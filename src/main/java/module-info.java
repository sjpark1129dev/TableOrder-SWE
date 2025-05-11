module deu.swe2.tableorder {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.desktop;

    opens deu.swe2.tableorder to javafx.fxml;
    opens deu.swe2.tableorder.boundary to javafx.fxml;
    exports deu.swe2.tableorder;
    exports deu.swe2.tableorder.boundary;
}