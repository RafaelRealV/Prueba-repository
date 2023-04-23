module com.example.hilos_mascorto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hilos_mascorto to javafx.fxml;
    exports com.example.hilos_mascorto;
}