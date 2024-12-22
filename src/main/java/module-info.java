module com.flexible_editor {
    requires javafx.controls;
    requires javafx.base;
    requires javafx.media;
    requires javafx.fxml;
    requires org.fxmisc.richtext;
    exports com.flexible_editor;
    exports com.flexible_editor.controller;
    opens com.flexible_editor.controller to javafx.fxml;
}
