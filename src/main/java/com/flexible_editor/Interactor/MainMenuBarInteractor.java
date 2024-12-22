package com.flexible_editor.Interactor;

import com.flexible_editor.model.MainMenuBarModel;

public class MainMenuBarInteractor {
    MainMenuBarModel menuModel;

    public MainMenuBarInteractor (MainMenuBarModel menuModel) {
        this.menuModel = menuModel;
    }

    public void printMessage () {
        System.out.println("Hello World");
    }
}
