package com.flexible_editor.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MainWindowModel {
    private final StringProperty number = new SimpleStringProperty("0");

    String getNumber() {
        return number.get();
    }
}
