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

        vbox.getChildren().addAll( btn1, btn2);

        Scene scene = new Scene(vbox);

        stage.setScene(scene);
        stage.setHeight(300);
        stage.setWidth(300);
        stage.setTitle("Übung 5");
        stage.show();
    }
}
