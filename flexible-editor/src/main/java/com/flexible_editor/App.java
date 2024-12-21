package com.flexible_editor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        MenuBar menuBar = new MenuBar();

        // Create Menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");

        // Add MenuItems to Menus
        fileMenu.getItems().addAll(
                new MenuItem("New"),
                new MenuItem("Open"),
                new MenuItem("Save"),
                new SeparatorMenuItem(),
                new MenuItem("Exit")
        );

        editMenu.getItems().addAll(
                new MenuItem("Undo"),
                new MenuItem("Redo"),
                new SeparatorMenuItem(),
                new MenuItem("Cut"),
                new MenuItem("Copy"),
                new MenuItem("Paste")
        );

        helpMenu.getItems().addAll(
                new MenuItem("About"),
                new MenuItem("Documentation")
        );

        // Add Menus to MenuBar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        VBox root = new VBox();
        root.getChildren().add(menuBar);

        BorderPane editor = new BorderPane();
        root.getChildren().add(editor);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Flexible Editor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}