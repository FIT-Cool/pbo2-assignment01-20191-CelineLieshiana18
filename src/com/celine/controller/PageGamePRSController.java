package com.celine.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class PageGamePRSController {
    public TextField txtWin;
    public TextField txtDraw;
    public TextField txtLose;
    public ImageView UserImage;
    public ImageView ComputerImage;
    public int UserScore;
    public int ComputerScore;

    public void PaperAction(ActionEvent actionEvent) {
        UserImage.setImage(new Image("paper.jpg"));
        UserScore=1;
        Random();
    }

    public void RockAction(ActionEvent actionEvent) {
        UserImage.setImage(new Image("rock.jpg"));
        UserScore=2;
        Random();
    }

    public void ScissorsAction(ActionEvent actionEvent) {
        UserImage.setImage(new Image("scissors.jpg"));
        UserScore=3;
        Random();
    }

    public void Random(){
        Random random = new Random();
        int nilai = random.nextInt(3);
        nilai +=1;
        ComputerScore = nilai;

        if(nilai == 1){
            ComputerImage.setImage(new Image("paper.jpg"));
        }
        else if(nilai == 2){
            ComputerImage.setImage(new Image("rock.jpg"));
        }
        else{
            ComputerImage.setImage(new Image("scissors.jpg"));
        }
        Banding();
    }

    public void Banding(){

        int win = Integer.parseInt(txtWin.getText());
        int lose = Integer.parseInt(txtLose.getText());
        int draw = Integer.parseInt(txtDraw.getText());

        if(UserScore==ComputerScore){
            // ser draw
            draw = draw + 1;
            txtDraw.setText(Integer.toString(draw));
        }
        else if(UserScore==1 && ComputerScore==2){
            win = win + 1;
            txtWin.setText(Integer.toString(win));
            //set user win
        }
        else if(UserScore==2 && ComputerScore==3){
            win = win + 1;
            txtWin.setText(Integer.toString(win));
            //set user win
        }
        else if(UserScore==3 && ComputerScore==1){
            win = win + 1;
            txtWin.setText(Integer.toString(win));
            //set user win
        }
        else{
            lose = lose + 1;
            txtLose.setText(Integer.toString(lose));
            // set lose
        }
    }

    public void ExitAction(ActionEvent actionEvent) {
        Platform.exit();
    }
}
