package pt.isec.pa.apoio_poe.ui.gui.components;

import javafx.scene.layout.BorderPane;
import pt.isec.pa.apoio_poe.model.fsm.ApplicationState;
import pt.isec.pa.apoio_poe.model.FSManager;

public class ProposalsAttributionLockedUI extends BorderPane {
    private FSManager manager;

    public ProposalsAttributionLockedUI(FSManager manager){
        this.manager = manager;createViews();
        registerHandlers();
        update();
    }

    private void createViews() {

    }

    private void registerHandlers() { }

    private void update() {
        this.setVisible(manager != null && manager.getState() == ApplicationState.PROPOSAL_ATTRIBUTION_LOCKED);
    }
}