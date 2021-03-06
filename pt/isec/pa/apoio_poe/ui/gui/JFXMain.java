package pt.isec.pa.apoio_poe.ui.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import pt.isec.pa.apoio_poe.model.FSManager;
import pt.isec.pa.apoio_poe.ui.gui.components.LoggerUI;
import pt.isec.pa.apoio_poe.ui.gui.components.RootPane;
import pt.isec.pa.apoio_poe.ui.gui.components.RootPane2;

/**
 * <p>Class that wil launch the GUI</p>
 *
 * @author RafelGil and HugoFerreira
 */
public class JFXMain extends Application {
    private FSManager manager;

    public JFXMain(){
        this.manager = new FSManager();
    }


    /**
     *
     * @param stage stage
     * @throws Exception when launch unsuccessful
     */
    @Override
    public void start(Stage stage) throws Exception {
        RootPane root = new RootPane(manager);
        Scene scene = new Scene(root, 600, 450, Color.INDIGO);
        stage.setScene(scene);
        stage.setTitle("POI_MANAGEMENT");
        stage.setMinWidth(500);
        stage.setMinHeight(150);
        stage.setResizable(false);
        stage.show();

        Stage stage1 = new Stage();
        RootPane2 root2 = new RootPane2(manager);
        Scene scene1 = new Scene(root2, 400, 210, Color.INDIGO);
        stage1.setScene(scene1);
        stage1.setX(stage.getX()+stage.getWidth());
        stage1.setY(stage.getY());
        stage1.setTitle("Data");
        stage1.setResizable(false);
        stage1.show();

        Stage stage2 = new Stage();
        LoggerUI loggerUI = new LoggerUI(manager);
        Scene scene2 = new Scene(loggerUI, 400, 210, Color.INDIGO);
        stage2.setScene(scene2);
        stage2.setX(stage.getX()+stage.getWidth());
        stage2.setY(stage1.getY()+stage1.getHeight());
        stage2.setTitle("Logger");
        stage2.setResizable(false);

        stage2.show();
    }
    @Override
    public void init() throws Exception {
        super.init();
    }
    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
