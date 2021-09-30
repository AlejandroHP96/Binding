package dad.bindings.samples;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleExpression;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample4 extends Application {

	private Label anchoLabel;
	private Label altoLabel;
	private Label areaLabel;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		anchoLabel = new Label("ancho = xxx");
		altoLabel = new Label("alto = xxx");
		areaLabel = new Label("area = xxx");
		
		VBox root = new VBox(5,anchoLabel, altoLabel, areaLabel);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root,320,200);
		 primaryStage.setTitle("(x, y)");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		 
		 anchoLabel.textProperty().bind(
				 Bindings.concat("ancho =", primaryStage.widthProperty().asString("%.0f"))
				 );
		 altoLabel.textProperty().bind(
				 Bindings.concat("alto =", primaryStage.heightProperty().asString("%.0f"))
				 );
		 primaryStage.titleProperty().bind(
				 Bindings
				 	.concat("(")
				 	.concat(primaryStage.xProperty().asString("%.0f"))
				 	.concat(", ")
				 	.concat(primaryStage.yProperty().asString("%.0f"))
				 	.concat(")")
				 );
		 
			DoubleExpression area = primaryStage.widthProperty().multiply(primaryStage.heightProperty());
			
			areaLabel.textProperty().bind(
					 Bindings.concat("area =",area.asString("%.0f"))
					 );
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
