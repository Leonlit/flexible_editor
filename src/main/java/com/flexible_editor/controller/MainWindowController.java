package com.flexible_editor.controller;

import java.io.IOException;

import org.fxmisc.richtext.InlineCssTextArea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ColorPicker;

public class MainWindowController {

    @FXML
    private InlineCssTextArea textEditor;

    @FXML
    private void applyStyle(ActionEvent event) throws IOException {
        System.out.println("tester");
        Node source = (Node) event.getSource();
        String id = source.getId();
        String newStyle = this.getIDStyleString(id);

        int start = textEditor.getSelection().getStart();
        int end = textEditor.getSelection().getEnd();

        if (start == end) {
            // No text selected
            return;
        }

        // Toggle the style for each character in the selection
        for (int i = start; i < end; i++) {
            String existingStyle = textEditor.getStyleOfChar(i);
            String updatedStyle;
            if (existingStyle.contains(newStyle.trim())) {
                // If the style exists, remove it
                updatedStyle = this.removeStyle(existingStyle, newStyle);
            } else {
                // If the style doesn't exist, add it
                updatedStyle = this.mergeStyles(existingStyle, newStyle);
            }

            // Apply the updated style to the character
            textEditor.setStyle(i, i + 1, updatedStyle);
        }
    }

    private String getIDStyleString (String optionID) {
        switch (optionID) {
            case "applyBold":
                return "-fx-font-weight: bold;";
            case "applyItalic":
                return "-fx-font-style: italic;";
            case "applyUnderline":
                return "-fx-underline: true;";
            default:
                return "";
        }
    }

    /**
     * Removes a specific style from the existing style string.
     */
    private String removeStyle(String existingStyle, String styleToRemove) {
        // Split styles into key-value pairs
        String[] styleParts = existingStyle.split(";");
        StringBuilder updatedStyle = new StringBuilder();
        styleToRemove = styleToRemove.trim().replaceAll(";$", "");

        for (String stylePart : styleParts) {
            // Only include styles that are not the one to remove
            if (!stylePart.trim().equals(styleToRemove.trim())) {
                updatedStyle.append(stylePart).append(";");
            }
        }

        return updatedStyle.toString();
    }

    /**
     * Merges a new style with an existing style string.
     */
    private String mergeStyles(String existingStyle, String newStyle) {
        // Use a StringBuilder for efficiency
        StringBuilder mergedStyle = new StringBuilder(existingStyle);

        // Split the new style into key-value pairs
        String[] newStyleParts = newStyle.split(";");
        for (String stylePart : newStyleParts) {
            if (!stylePart.trim().isEmpty() && !existingStyle.contains(stylePart.trim())) {
                // Add the new style if it isn't already in the existing style
                mergedStyle.append(stylePart).append(";");
            }
        }

        return mergedStyle.toString();
    }

    private void textApplyColor (ColorPicker picker) {
        //System.out.println("New Color's RGB = "+picker.getRed()+" "+picker.getGreen()+" "+picker.getBlue());
    }
}