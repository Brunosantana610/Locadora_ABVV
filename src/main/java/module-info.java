    module com.example.locadora_abvv {
    requires javafx.controls;
    requires javafx.fxml;

        exports com.locadora_abvv;
        opens com.locadora_abvv to javafx.fxml;
    }