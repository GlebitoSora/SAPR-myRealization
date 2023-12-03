module com.example.saprbarbyme {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.saprbarbyme to javafx.fxml;
    exports com.example.saprbarbyme;
    exports com.example.saprbarbyme.Payload;
    opens com.example.saprbarbyme.Payload to javafx.fxml;
    exports com.example.saprbarbyme.Controller;
    opens com.example.saprbarbyme.Controller to javafx.fxml;
}