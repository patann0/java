import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JUB extends Application {
    public void start(Stage stage){
        stage.setWidth(300);
        stage.setHeight(200);

        Button button1 = new Button("ABC");
        Button button2 = new Button("DEF");
        Button button3 = new Button("GHI");

        button1.setPrefSize(100,100);
        button2.setPrefSize(100,100);
        button3.setPrefSize(100,100);

        HBox root = new HBox(10);

        root.getChildren().addAll(button1, button2, button3);

        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.show();

    }


	public static void main(String[] args){
		Runtime.getRuntime().gc();
		launch();
	}
}
