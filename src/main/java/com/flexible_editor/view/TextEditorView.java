package com.flexible_editor.view;

import com.flexible_editor.model.TextEditorModel;
//import org.fxmisc.flowless.VirtualizedScrollPane;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import org.fxmisc.richtext.InlineCssTextArea;

public class TextEditorView extends VBox{
    public TextEditorView (TextEditorModel editorModel, Runnable actionHandler) {
        InlineCssTextArea textArea = new InlineCssTextArea();

        // Create toolbar with formatting buttons
        ToolBar toolBar = new ToolBar();

        // Bold button
        Button boldButton = new Button("B");
        boldButton.setStyle("-fx-font-weight: bold;"); // Make the button label bold
        boldButton.setOnAction(e -> {
            int start = textArea.getSelection().getStart();
            int end = textArea.getSelection().getEnd();
            if (start != end) {
                textArea.setStyle(start, end, "-fx-font-weight: bold;");
            }
        });

        // Italic button
        Button italicButton = new Button("I");
        italicButton.setStyle("-fx-font-style: italic;"); // Make the button label italic
        italicButton.setOnAction(e -> {
            int start = textArea.getSelection().getStart();
            int end = textArea.getSelection().getEnd();
            if (start != end) {
                textArea.setStyle(start, end, "-fx-font-style: italic;");
            }
        });

        // Underline button
        Button underlineButton = new Button("U");
        underlineButton.setStyle("-fx-underline: true;"); // Make the button label underline
        underlineButton.setOnAction(e -> {
            int start = textArea.getSelection().getStart();
            int end = textArea.getSelection().getEnd();
            if (start != end) {
                textArea.setStyle(start, end, "-fx-underline: true;");
            }
        });

        // Add buttons to toolbar
        toolBar.getItems().addAll(boldButton, italicButton, underlineButton);

        getChildren().add(toolBar);
        getChildren().add(textArea);
    }
}
