package com.flexible_editor.view;

import com.flexible_editor.controller.MainMenuBarController;
import com.flexible_editor.controller.TextEditorController;
import com.flexible_editor.model.MainWindowModel;

import javafx.scene.layout.VBox;

public class MainWindowView extends VBox {
    public MainWindowView(MainWindowModel viewModel, Runnable actionHandler) {
		
		MainMenuBarController mainMenuBar = new MainMenuBarController();
        getChildren().add(mainMenuBar.getView());

        TextEditorController editor = new TextEditorController();
        getChildren().add(editor.getView());
    }
}
