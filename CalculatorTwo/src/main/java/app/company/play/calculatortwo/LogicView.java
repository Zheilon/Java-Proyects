package app.company.play.calculatortwo;
import javafx.scene.control.Label;

public class LogicView {

    public static Label labelColor(Label l)
    {
        if (!l.getText().isEmpty()) {
            l.setStyle("-fx-background-color: rgba(230, 176, 170, 0.5);");
        }
        return l;
    }
}
