package app.company.play.calculatortwo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerFirst {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}