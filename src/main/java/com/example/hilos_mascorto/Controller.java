package com.example.hilos_mascorto;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {


    @FXML
    private Label lb2;
    @FXML
    private Label lbl3;
    @FXML
    private Label lb1;


    public void setLb1(Label lb1) {
        this.lb2.setText(.MainHilos());
    }
}
