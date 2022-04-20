package pt.isec.pa.apoio_poe.model.fsm.statesImplementation;

import pt.isec.pa.apoio_poe.model.data.Data;
import pt.isec.pa.apoio_poe.model.context.ApplicationContext;
import pt.isec.pa.apoio_poe.model.fsm.ApplicationState;
import pt.isec.pa.apoio_poe.model.fsm.StateAdapter;

public class ProfessorPhase extends StateAdapter {

    public ProfessorPhase(ApplicationContext context, Data data) {
        super(context, data);
    }

    @Override
    public ApplicationState getState() {
        return ApplicationState.PROFESSOR;
    }

    @Override
    public boolean proposalManager() {
        setState(ApplicationState.PROPOSAL);
        return true;
    }

    @Override
    public boolean closeState() {
        if (data.lockPhase1()) {
            setState(ApplicationState.PROFESSOR_LOCKED);
            data.lockPhase(ApplicationState.STUDENT);
            data.lockPhase(ApplicationState.PROFESSOR);
            data.lockPhase(ApplicationState.PROPOSAL);
        }

        return true;
    }

    @Override
    public boolean candidatureManager() {
        if (data.isLocked(ApplicationState.CANDIDATURE)) {
            setState(ApplicationState.CANDIDATURE_LOCKED);
            return true;
        }
        setState(ApplicationState.CANDIDATURE);
        return true;
    }
}
