module com.mycompany.escuela {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.escuela to javafx.fxml;
    exports com.mycompany.escuela;
}
