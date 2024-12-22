package com.flexible_editor.Interactor;

import com.flexible_editor.model.TextEditorModel;

public class TextEditorInteractor {
    TextEditorModel editorModel;

    public TextEditorInteractor(TextEditorModel editorModel) {
        this.editorModel = editorModel;
    }

    public void printMessage () {
        System.out.println("Hello World");
    }
}
