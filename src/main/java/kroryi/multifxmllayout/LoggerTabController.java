package kroryi.multifxmllayout;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class LoggerTabController {
    @FXML
    private VBox loggerTab;
    @FXML
    private TextArea loggerTxtArea;
    public TextArea getLoggerTxtArea() {
        return this.loggerTxtArea;
    }
    public void initialize() {
        this.loggerTxtArea.appendText("로그시작");
    }


}
