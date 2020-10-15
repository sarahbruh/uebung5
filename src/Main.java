import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * uebung 5
 * @author Brunmayr Sarah
 * @version 12.0.1, 15.10.2020
 */
public class Main extends Application{
    public static void main(String[] args) {

        //Programm funktioniert auch ohne Main!
        Application.launch(args);
    }

    @Override
    public void start(Stage stage){

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setBackground(new Background(new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY)));

        Text txt = new Text();
        txt.setText("Grad Celsius");
        txt.setStyle("-fx-font-size:14;-fx-font-weight: bold");

        TextField text = new TextField();
        text.setMaxWidth(300);

        Text txt1 = new Text();
        txt1.setText("Grad Fahrenheit");
        txt1.setStyle("");
        txt1.setStyle("-fx-font-size:14;-fx-font-weight: bold");

        TextField text1 = new TextField();
        text1.setMaxWidth(300);

        Text br = new Text("");  //Abstand zwischen Textfeld und Buttons

        Button btn1 = new Button();
        btn1.setText("Convert C -> F");
        btn1.setMinWidth(100);
        btn1.setMinHeight(20);

        EventHandler btn1_handler = new EventHandler() {
            @Override
            public void handle(Event event) {

            }
        };

        Button btn2 = new Button();
        btn2.setText("Convert F -> C");
        btn2.setMinWidth(100);
        btn2.setMinHeight(20);

        EventHandler btn2_handler = new EventHandler() {
            @Override
            public void handle(Event event) {

            }
        };

        vbox.getChildren().addAll(txt, text, txt1, text1, br, btn1, btn2);

        Scene scene = new Scene(vbox);

        stage.setScene(scene);
        stage.setHeight(300);
        stage.setWidth(300);
        stage.setTitle("Übung 5");
        stage.show();
    }
}
