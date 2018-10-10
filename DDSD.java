import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;






public class DDSD extends Application {
    public void start(Stage stage) {
        stage.setWidth(500);
        stage.setHeight(300);

        Button button1 = new Button("TEST button1");
        Button button2 = new Button("TEST button2");

        button1.setPrefSize(100,100);
        button2.setPrefSize(100,100);

        TextField text = new TextField("TEST");

        FlowPane root = new FlowPane();
        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(text);


        stage.setScene(new Scene(root));
        stage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
