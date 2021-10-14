package dad.bindings.samples;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringExpression;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample8 extends Application{

    private TextField nombreText;
    private Label saludoLabel;
    private CheckBox hayNombreCheck;
    
    @Override
    public void start(Stage primaryStage) throws Exception {

        nombreText = new TextField();
        
        saludoLabel = new Label();

        hayNombreCheck = new CheckBox();

        VBox root = new VBox(5, nombreText,saludoLabel,hayNombreCheck);
        root.setAlignment(Pos.CENTER);
        root.setFillWidth(false);

        Scene scene = new Scene(root,320,200);

        primaryStage.setTitle("Sample8");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        StringExpression saludoExpression = Bindings
                                                .concat("!!!Hola")
                                                .concat(Bindings
                                                            .when(Bindings.isEmpty(nombreText.textProperty()))
                                                            .then("a todo el mundo")
                                                            .otherwise(nombreText.textProperty()))
                                                .concat("!!!");
        saludoLabel.textProperty().bind(saludoExpression);
        
        

        hayNombreCheck.selectedProperty().bind(Bindings.isEmpty(nombreText.textProperty()).not());
    }
    public static void main(String[] args) {
        launch(args);
    }
}
