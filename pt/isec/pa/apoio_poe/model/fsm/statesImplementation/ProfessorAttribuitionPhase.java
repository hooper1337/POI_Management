package pt.isec.pa.apoio_poe.model.fsm.statesImplementation;

import pt.isec.pa.apoio_poe.model.fsm.StateAdapter;
import pt.isec.pa.apoio_poe.model.data.Data;
import pt.isec.pa.apoio_poe.model.context.ApplicationContext;

public class ProfessorAttribuitionPhase extends StateAdapter {
    public ProfessorAttribuitionPhase(ApplicationContext context, Data data) {
        super(context, data);
    }
}
