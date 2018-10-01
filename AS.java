import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AS extends Application {
	CheckBox checkBox;
	ChoiceBox<String> choiceBox;
	Slider slider;
	Label label;
	TextField textField;
	RadioButton radioButton1;
	RadioButton radioButton2;
	RadioButton radioButton3;
	RadioButton radioButton4;
	ToggleGroup toggleGroup;
	Button button;
	TextArea textArea;

	public void start(Stage stage) {
		stage.setWidth(500);
		stage.setHeight(300);

		checkBox = new CheckBox("チェックボックス");

		choiceBox = new ChoiceBox<>();
		choiceBox.getItems().addAll("チョイスボックス1","チョイスボックス2",
				"チョイスボックス3");
		choiceBox.setValue("チョイスボックス1");

		radioButton1 = new RadioButton("ラボタン1");
		radioButton2 = new RadioButton("ラボタン2");
		radioButton3 = new RadioButton("ラボタン3");

		label = new Label("ラベル");

		slider = new Slider(0,100,50);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setOnMouseClicked(event -> label.setText(
				"スライダー:" + (int) slider.getValue()));
		textField = new TextField("テキストフィールド");

		button = new Button("OK!");
		button.setOnAction(event -> buttonPressed());

		textArea = new TextArea("テキストエリア");

		VBox box = new VBox(5);
		box.setPadding(new Insets(20,25,25,25));

		box.getChildren().addAll(checkBox,radioButton1,
				radioButton2,radioButton3,choiceBox,slider,
				label,textField,button);
		MenuBar menuBar = new MenuBar();
		Menu fileMenu = new Menu("ファイル");
		MenuItem menuOpen = new MenuItem("開く");
		MenuItem menuExit = new MenuItem("閉じる");
		menuExit.setOnAction(event -> System.exit(0));
		fileMenu.getItems().add(menuOpen);
		fileMenu.getItems().add(menuExit);
		menuBar.getMenus().add(fileMenu);

		BorderPane root = new BorderPane();
		root.setLeft(box);
		root.setTop(menuBar);
		root.setCenter(textArea);

		stage.setScene(new Scene(root));
		stage.show();
	}
	void buttonPressed() {
		textArea.clear();
		textArea.appendText("チェックボックスの選択項目:" +
		checkBox.isSelected());
		textArea.appendText("\nラジオボタンの選択項目" +
		((RadioButton) toggleGroup.getSelectedToggle()).
		getText());
		textArea.appendText("\nチョイスボックスの選択項目:" +
		choiceBox.getValue());

		textArea.appendText("\nスライダーの選択項目:" + slider.
				getValue());
		textArea.appendText("\nテキストフィールドの文字列:" +
				textField.getText());
	}
	public static void main(String[] args){
		launch();
	}
}
