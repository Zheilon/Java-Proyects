module app.company.play.calculatortwo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires com.almasb.fxgl.all;

    opens app.company.play.calculatortwo to javafx.fxml;
    exports app.company.play.calculatortwo;
}