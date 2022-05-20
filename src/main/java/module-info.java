    module com.example.locadora_abvv {
    requires javafx.controls;
    requires javafx.fxml;

        exports com.locadora_abvv;
        exports com.locadora_abvv.apresentacao;
        opens com.locadora_abvv to javafx.fxml;
        opens com.locadora_abvv.apresentacao to javafx.fxml;
    }