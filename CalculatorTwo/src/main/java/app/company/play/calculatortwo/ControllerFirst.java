package app.company.play.calculatortwo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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

        for (Button z : listButtonAll) {
            z.setOnMouseEntered(InteractController.cursorHandShow(z).getOnMouseEntered());
        }

        zero.setOnKeyPressed(key -> {
            if (key.getCode() == KeyCode.DIGIT0) {
                zeroAlter();
            }
        });

    }

    private Stage stage;
    public void setStage(Stage stage) { this.stage = stage; }

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
        LogicView.labelColor(textUp);

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
    private void zeroButton()
    {
        LogicView.labelColor(textUp);
        textUp.setText(textUp.getText() + "0");
        textDown.setText(textDown.getText() + "0");
    }

    private void zeroAlter()
    {
        LogicView.labelColor(textUp);
        textUp.setText(textUp.getText() + "0");
        textDown.setText(textDown.getText() + "0");
    }

    @FXML
    private void oneButton(MouseEvent event)
    {
        LogicView.labelColor(textUp);
        textUp.setText(textUp.getText() + "1");
        textDown.setText(textDown.getText() + "1");
    }

    @FXML
    private void twoButton(MouseEvent event)
    {
        LogicView.labelColor(textUp);
        textUp.setText(textUp.getText() + "2");
        textDown.setText(textDown.getText() + "2");
    }

    @FXML
    private void threeButton(MouseEvent event)
    {
        LogicView.labelColor(textUp);
        textUp.setText(textUp.getText() + "3");
        textDown.setText(textDown.getText() + "3");
    }

    @FXML
    private void fourButton(MouseEvent event)
    {
        LogicView.labelColor(textUp);
        textUp.setText(textUp.getText() + "4");
        textDown.setText(textDown.getText() + "4");
    }

    @FXML
    private void fiveButton(MouseEvent event)
    {
        LogicView.labelColor(textUp);
        textUp.setText(textUp.getText() + "5");
        textDown.setText(textDown.getText() + "5");
    }

    @FXML
    private void sixButton(MouseEvent event)
    {
        LogicView.labelColor(textUp);
        textUp.setText(textUp.getText() + "6");
        textDown.setText(textDown.getText() + "6");
    }

    @FXML
    private void sevenButton(MouseEvent event)
    {
        LogicView.labelColor(textUp);
        textUp.setText(textUp.getText() + "7");
        textDown.setText(textDown.getText() + "7");
    }

    @FXML
    private void eightButton(MouseEvent event)
    {
        LogicView.labelColor(textUp);
        textUp.setText(textUp.getText() + "8");
        textDown.setText(textDown.getText() + "8");
    }


    @FXML
    private void nineButton(MouseEvent event)
    {
        LogicView.labelColor(textUp);
        textUp.setText(textUp.getText() + "9");
        textDown.setText(textDown.getText() + "9");
    }



}