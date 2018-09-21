import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class JUB extends Application{
	public void start(Stage stage){
		stage.setWidth(300);
		stage.setHeight(300);

		Rectangle rec = new Rectangle(10,20,60,40);
		rec.setFill(Color.PURPLE);

		Circle cir = new Circle(120,40,25);
		cir.setFill(Color.YELLOW);

		Group roo = new Group();
		roo.getChildren().addAll(rec,cir);

		Scene scene = new Scene(roo);

		stage.setScene(scene);

		stage.show();
	}






	public static void main(String[] args){
		launch();
		Runtime.getRuntime().gc();

	}
}
