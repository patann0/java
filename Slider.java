import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Slider extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage stage) {
		stage.setWidth(500);
		stage.setHeight(500);

		TextArea t = new TextArea();
		CheckBox x = new CheckBox();
		Button a = new Button("A");
		Button b = new Button("B");
		Slider slider = new Slider(0,100,0);
		a.setPrefSize(200, 100);
		b.setPrefSize(200, 100);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);




		FlowPane n = new FlowPane();

		n.getChildren().addAll(t,x,a,b,slider);

		stage.setScene(new Scene(n));
		stage.show();
	}
}
