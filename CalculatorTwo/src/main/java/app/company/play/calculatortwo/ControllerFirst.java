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

        List<Button> listButtonAll = new ArrayList<>(List.of(zero,
                one, two, three, four, five, six, seven, eight,
                nine, deleteAll, division, per, rest, sum, equal, dot));

        List<Button> listButtonNumbs = new ArrayList<>(List.of(zero,
                one, two, three, four, five, six, seven, eight,
                nine));

        for (Button z : listButtonAll) {
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
    private Button dot;

    @FXML
    void dotButton(MouseEvent event)
    {
        if (!textUp.getText().isEmpty()) {
            textUp.setStyle("-fx-background-color: rgba(230, 176, 170, 0.5);");
        }

        if (!textDown.getText().contains(".")) {
            textUp.setText(textUp.getText() + ".");
            textDown.setText(textDown.getText() + ".");
        }
    }

    @FXML
    private void deleteAllButton(MouseEvent event)
    {
        textUp.setText("");
        textDown.setText("");
        textUp.setStyle("-fx-background-color: rgba(250, 219, 216, 1);");
    }

    @FXML
    private void zeroButton() {
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

    @FXML
    private void twoButton(MouseEvent event)
    {
        if (!textUp.getText().isEmpty()) {
            textUp.setStyle("-fx-background-color: rgba(230, 176, 170, 0.5);");
        }

        textUp.setText(textUp.getText() + "2");
        textDown.setText(textDown.getText() + "2");
    }

    @FXML
    private void threeButton(MouseEvent event)
    {
        if (!textUp.getText().isEmpty()) {
            textUp.setStyle("-fx-background-color: rgba(230, 176, 170, 0.5);");
        }

        textUp.setText(textUp.getText() + "3");
        textDown.setText(textDown.getText() + "3");
    }

    @FXML
    private void fourButton(MouseEvent event)
    {
        if (!textUp.getText().isEmpty()) {
            textUp.setStyle("-fx-background-color: rgba(230, 176, 170, 0.5);");
        }

        textUp.setText(textUp.getText() + "4");
        textDown.setText(textDown.getText() + "4");
    }

    @FXML
    private void fiveButton(MouseEvent event)
    {
        if (!textUp.getText().isEmpty()) {
            textUp.setStyle("-fx-background-color: rgba(230, 176, 170, 0.5);");
        }

        textUp.setText(textUp.getText() + "5");
        textDown.setText(textDown.getText() + "5");
    }

    @FXML
    private void sixButton(MouseEvent event)
    {
        if (!textUp.getText().isEmpty()) {
            textUp.setStyle("-fx-background-color: rgba(230, 176, 170, 0.5);");
        }

        textUp.setText(textUp.getText() + "6");
        textDown.setText(textDown.getText() + "6");
    }



}