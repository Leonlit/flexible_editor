package com.flexible_editor.controller;

import javafx.scene.layout.Region;

import com.flexible_editor.Interactor.MainWindowInteractor;
import com.flexible_editor.model.MainWindowModel;
import com.flexible_editor.view.MainWindowView;

public class MainWindowController {
    private final Region view;

    public MainWindowController() {
        MainWindowModel viewModel = new MainWindowModel();
        MainWindowInteractor interactor = new MainWindowInteractor(viewModel);
        this.view = new MainWindowView(viewModel, interactor::printMessage);
    }

    public Region getView() {
        return view;
    }
}
