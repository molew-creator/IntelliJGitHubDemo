module mike.intellijgithubdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens mike.intellijgithubdemo to javafx.fxml;
    exports mike.intellijgithubdemo;
}