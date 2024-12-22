package com.flexible_editor.controller;

import com.flexible_editor.Interactor.TextEditorInteractor;
import com.flexible_editor.model.TextEditorModel;
import com.flexible_editor.view.TextEditorView;

import javafx.scene.layout.Region;

public class TextEditorController{
    private final Region editorView;

    public TextEditorController() {
        TextEditorModel textEditorModel = new TextEditorModel();
        TextEditorInteractor interactor = new TextEditorInteractor(textEditorModel);
        this.editorView = new TextEditorView(textEditorModel, interactor::printMessage);
    }

    public Region getView() {
        return editorView;
    }
}
