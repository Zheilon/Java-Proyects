package app.company.play.calculatortwo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerFirst implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

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
        textDown.setText("");
    }

    @FXML
    private void zeroButton(MouseEvent event)
    {
        textDown.setText(textDown.getText() + "0");
    }

    @FXML
    private void oneButton(MouseEvent event)
    {
        textDown.setText(textDown.getText() + "1");
    }

}