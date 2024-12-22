package com.flexible_editor;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("mainWindow.fxml"));
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root, 800, 600);
            primaryStage.setTitle("Flexible Editor");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
    }

    public static void main(String[] args) {
        launch();
    }

}