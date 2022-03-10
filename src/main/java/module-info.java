module com.example.terraingenerationtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.terraingenerationtest to javafx.fxml;
    exports com.example.terraingenerationtest;
}