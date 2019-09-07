package com.celine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("view/PageGamePRS.fxml"));
//        primaryStage.setTitle("Paper Rock Scissors Game");
        Parent root = FXMLLoader.load(getClass().getResource("view/PageGameMenghitungLuas.fxml"));
        primaryStage.setTitle("Menghitung Luas");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}