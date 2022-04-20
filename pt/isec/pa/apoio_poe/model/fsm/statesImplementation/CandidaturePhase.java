package pt.isec.pa.apoio_poe.model.fsm.statesImplementation;

import pt.isec.pa.apoio_poe.model.fsm.ApplicationState;
import pt.isec.pa.apoio_poe.model.fsm.StateAdapter;
import pt.isec.pa.apoio_poe.model.data.Data;
import pt.isec.pa.apoio_poe.model.context.ApplicationContext;

public class CandidaturePhase extends StateAdapter {
    public CandidaturePhase(ApplicationContext context, Data data) {
        super(context, data);
    }

    @Override
    public ApplicationState getState() {
        return ApplicationState.CANDIDATURE;
    }

    @Override
    public boolean studentManager() {
        if (data.isLocked(ApplicationState.STUDENT)) {
            setState(ApplicationState.STUDENT_LOCKED);
            return true;
        }

        setState(ApplicationState.STUDENT);
        return true;
    }

    @Override
    public boolean closeState() {
        if (data.isLocked(ApplicationState.STUDENT)) {
            data.lockPhase(ApplicationState.CANDIDATURE);
            setState(ApplicationState.CANDIDATURE_LOCKED);
        }
        return true;
    }

    @Override
    public boolean proposalAttributionManager() {
        if (data.isLocked(ApplicationState.PROPOSAL_ATTRIBUTION)) {
            setState(ApplicationState.PROPOSAL_ATTRIBUTION_LOCKED);
            return true;
        }

        setState(ApplicationState.PROPOSAL_ATTRIBUTION);
        return true;
    }

}
