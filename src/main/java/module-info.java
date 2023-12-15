module kroryi.multifxmllayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens kroryi.multifxmllayout to javafx.fxml;
    exports kroryi.multifxmllayout;
}