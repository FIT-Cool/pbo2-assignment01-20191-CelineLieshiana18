package com.celine.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class PageGameMenghitungLuasController {
    public TextField txtLength;
    public TextField txtWidth;
    public TextField txtRadius;
    public TextField txtHeight;
    public double keterangan,width,height,radius;
    public double hasilluas, hasilvolume;
    public double pi = 3.14;


    public void SquareAction(ActionEvent actionEvent) {
        txtLength.clear();
        txtRadius.clear();
        txtHeight.setDisable(false);
        txtWidth.setDisable(false);
        txtLength.setDisable(true);
        txtRadius.setDisable(true);

        keterangan = 1;

    }

    public void BallAction(ActionEvent actionEvent) {
        txtLength.clear();
        txtHeight.clear();
        txtWidth.clear();
        txtHeight.setDisable(true);
        txtWidth.setDisable(true);
        txtLength.setDisable(true);
        txtRadius.setDisable(false);

        keterangan = 2;
    }

    public void TubeAction(ActionEvent actionEvent) {
        txtRadius.clear();
        txtHeight.clear();
        txtHeight.setDisable(false);
        txtWidth.setDisable(true);
        txtLength.setDisable(true);
        txtRadius.setDisable(false);

        keterangan = 3;
    }

    public void ActionSubmit(ActionEvent actionEvent) {
        if(keterangan==1){
            height = Double.parseDouble(txtHeight.getText());
            width = Double.parseDouble(txtWidth.getText());

            hasilluas = width*height;
            hasilvolume = 2*(width+height);
        }
        else if(keterangan==2){
            radius = Double.parseDouble(txtRadius.getText());
            hasilluas = 4*pi*(Math.pow(radius,2));
            hasilvolume = (4/3)*pi*(Math.pow(radius,3));

        }
        else{
            height = Double.parseDouble(txtHeight.getText());
            radius = Double.parseDouble(txtRadius.getText());
            hasilluas = 2*pi*radius*(radius+height);
            hasilvolume = pi*(Math.pow(radius,2))*height;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Message");
        alert.setContentText("Surface Area: "+Double.toString(hasilluas)+", Volume: "+Double.toString(hasilvolume));

        alert.show();

        txtRadius.clear();
        txtLength.clear();
        txtHeight.clear();
        txtWidth.clear();
    }
}
