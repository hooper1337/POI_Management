package pt.isec.pa.apoio_poe.model.fsm.statesImplementation;

import pt.isec.pa.apoio_poe.model.fsm.StateAdapter;
import pt.isec.pa.apoio_poe.model.data.Data;
import pt.isec.pa.apoio_poe.model.context.ApplicationContext;

public class CandidaturePhase extends StateAdapter {
    public CandidaturePhase(ApplicationContext context, Data data) {
        super(context, data);
    }

}
