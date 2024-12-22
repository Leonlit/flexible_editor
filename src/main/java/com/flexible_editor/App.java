package com.flexible_editor;

import com.flexible_editor.controller.MainWindowController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        MainWindowController mainViewController = new MainWindowController();
        Scene scene = new Scene(mainViewController.getView(), 800, 600);
        primaryStage.setTitle("Flexible Editor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}