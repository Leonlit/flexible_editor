package com.flexible_editor.view;

import com.flexible_editor.model.MainMenuBarModel;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

public class MainMenuBarView extends MenuBar {
    public MainMenuBarView (MainMenuBarModel viewModel, Runnable actionHandler) {
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
        getMenus().addAll(fileMenu, editMenu, helpMenu);
    }
}
