module com.sanetro.app.tutorlanguage {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.sanetro.app.tutorlanguage to javafx.fxml;
    exports com.sanetro.app.tutorlanguage;
    exports com.sanetro.app.tutorlanguage.controller;
    opens com.sanetro.app.tutorlanguage.controller to javafx.fxml;
    opens com.sanetro.app.tutorlanguage.model to javafx.base;
    exports com.sanetro.app.tutorlanguage.core to javafx.fxml;
    opens com.sanetro.app.tutorlanguage.core;
}