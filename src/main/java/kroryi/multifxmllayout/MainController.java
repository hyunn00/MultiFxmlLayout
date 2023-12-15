package kroryi.multifxmllayout;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class MainController {
    @FXML
    private HomeTabController homeTabController;
    @FXML
    private LoggerTabController loggerTabController;
    public TextArea getVisualLog() {
        return loggerTabController.getLoggerTxtArea();
    }

    @FXML
    private void initialize() {
        homeTabController.injectMainController(this);
    }


}
