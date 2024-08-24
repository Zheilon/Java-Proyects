package app.company.play.calculatortwo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerFirst implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        List<Button> listButton = new ArrayList<>(List.of(zero,
                one, two, three, four, five, six, seven, eight,
                nine, deleteAll, division, per, rest, sum, equal));

        for (Button z : listButton) {
            z.setOnMouseEntered(InteractController.cursorHandShow(z).getOnMouseEntered());
        }

    }

    @FXML
    private Label textUp;

    @FXML
    private Label textDown;

    @FXML
    private Button division;

    @FXML
    private Button equal;

    @FXML
    private Button per;

    @FXML
    private Button rest;

    @FXML
    private Button sum;

    @FXML
    private Button zero;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button deleteAll;

    @FXML
    void deleteAllButton(MouseEvent event)
    {
        textUp.setText("");
        textDown.setText("");
        textUp.setStyle("-fx-background-color: rgba(250, 219, 216, 1);");
    }

    @FXML
    void zeroButton(MouseEvent event) {
        if (!textUp.getText().isEmpty()) {
            textUp.setStyle("-fx-background-color: rgba(230, 176, 170, 0.5);");
        }

        textUp.setText(textUp.getText() + "0");
        textDown.setText(textDown.getText() + "0");
    }

    @FXML
    private void oneButton(MouseEvent event)
    {
        if (!textUp.getText().isEmpty()) {
            textUp.setStyle("-fx-background-color: rgba(230, 176, 170, 0.5);");
        }

        textUp.setText(textUp.getText() + "1");
        textDown.setText(textDown.getText() + "1");
    }

}