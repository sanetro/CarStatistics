module com.sanetro.app.tutorlanguage {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.sanetro.app.carStatisticsGUI to javafx.fxml;
    exports com.sanetro.app.carStatisticsGUI;
    exports com.sanetro.app.carStatisticsGUI.controller;
    opens com.sanetro.app.carStatisticsGUI.controller to javafx.fxml;
    opens com.sanetro.app.carStatisticsGUI.model to javafx.base;
    exports com.sanetro.app.carStatisticsGUI.template to javafx.fxml;
    opens com.sanetro.app.carStatisticsGUI.template;
}