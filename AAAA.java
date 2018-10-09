import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;








public class AAAA extends Application {

	public void start(Stage stage) {
		stage.setWidth(500);
		stage.setHeight(500);


		Button button1 = new Button("A");
		Button button2 = new Button("B");
		Button button3 = new Button("C");
		Button button4 = new Button("D");
		button1.setOnAction(event -> System.out.println("OK!"));
		button2.setOnAction(event -> System.out.println("NICE!"));
		button3.setOnAction(event -> System.out.println("Year!"));
		button4.setOnAction(event -> System.out.println("Goodluck!"));








		VBox box = new VBox(5);
		box.getChildren().addAll(button1,button2,button3,button4);


		stage.setScene(new Scene(box));
		stage.show();

	}

	public static void main(String[] args) {
		launch();
	}
}
