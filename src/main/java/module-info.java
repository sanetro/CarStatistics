module com.sanetro.app.tutorlanguage {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.sanetro.app.tutorlanguage to javafx.fxml;
    exports com.sanetro.app.tutorlanguage;
}