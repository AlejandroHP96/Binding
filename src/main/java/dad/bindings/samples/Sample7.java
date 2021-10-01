package dad.bindings.samples;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Sample7
 */
public class Sample7 extends Application{

    private TextField numero1Text,numero2TexT,resultadoText;
    private DoubleProperty numero1,numero2,resultado;

    @Override
    public void start( Stage primaryStage) throws Exception{
        
        numero1Text = new TextField();

        numero2TexT = new TextField();
        
        resultadoText = new TextField();
    
        VBox root = new VBox();
        root.setSpacing(5);
        root.setAlignment(Pos.CENTER);
        root.setFillWidth(false);
        root.getChildren().addAll(numero1Text,numero2TexT,resultadoText);


        Scene scene = new Scene(root, 320,200);


        primaryStage.setTitle("Sumatorio");
        primaryStage.setScene(scene);
        primaryStage.show();;


    }

    public static void main(String[] args) {
        launch(args);
    }
}