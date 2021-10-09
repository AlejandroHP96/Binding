package dad.bindings.samples;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample3 extends Application {

	private TextField nombreText;
	private TextField apellidosText;
	private Label nombreCompletoLabel;

	@Override
	public void start(Stage primaryStage) throws Exception {

		nombreText = new TextField();

		apellidosText = new TextField();

		nombreCompletoLabel = new Label();

		VBox root = new VBox(5);
		root.setAlignment(Pos.CENTER);
		root.setFillWidth(false);
		root.getChildren().addAll(nombreText, apellidosText, nombreCompletoLabel);

		Scene scene = new Scene(root, 320, 200);

		primaryStage.setTitle("Sample3");
		primaryStage.setScene(scene);
		primaryStage.show();

		nombreCompletoLabel.textProperty()
				.bind(nombreText.textProperty().concat(" ").concat(apellidosText.textProperty()));

		primaryStage.titleProperty().bind(Bindings.concat("Sample3: ", nombreCompletoLabel.textProperty()));

	}

	public static void main(String[] args) {
		launch(args);
	}

}
