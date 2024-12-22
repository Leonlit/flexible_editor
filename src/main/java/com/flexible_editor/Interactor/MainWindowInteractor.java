package com.flexible_editor.Interactor;

import com.flexible_editor.model.MainWindowModel;

public class MainWindowInteractor {
    MainWindowModel viewModel;

    public MainWindowInteractor(MainWindowModel viewModel) {
        this.viewModel = viewModel;
    }

    public void printMessage () {
        System.out.println("Hello World");
    }
}
