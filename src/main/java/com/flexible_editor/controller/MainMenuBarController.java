package com.flexible_editor.controller;

import com.flexible_editor.Interactor.MainMenuBarInteractor;
import com.flexible_editor.model.MainMenuBarModel;
import com.flexible_editor.view.MainMenuBarView;

import javafx.scene.layout.Region;

public class MainMenuBarController {
    private final Region view;

    public MainMenuBarController () {
        MainMenuBarModel mainMenuModel = new MainMenuBarModel();
        MainMenuBarInteractor interactor = new MainMenuBarInteractor(mainMenuModel);
        this.view = new MainMenuBarView(mainMenuModel, interactor::printMessage);
    }
    
    public Region getView() {
        return view;
    }
}
