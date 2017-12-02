package io.github.pl4gue.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainController {

    @FXML
    AnchorPane mainpane;

    @FXML
    protected void quit() {
        Platform.exit();
    }

    @FXML
    protected void panel() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/panel.fxml"));
        try {
            BorderPane aboutPane = fxmlLoader.load();
            mainpane.getChildren().clear();
            mainpane.getChildren().add(aboutPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void about() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/about.fxml"));
        try {
            AnchorPane aboutPane = fxmlLoader.load();
            mainpane.getChildren().clear();
            mainpane.getChildren().add(aboutPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
