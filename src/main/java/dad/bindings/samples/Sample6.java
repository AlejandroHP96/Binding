package dad.bindings.samples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sample6 extends Application{
    
    private TextField numeroText;

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        numeroText = new TextField();

        VBox root = new VBox(numeroText);
        root.setAlignment(Pos.CENTER);
        root.setFillWidth(false);

        Scene scene = new Scene(root,320,200);

        primaryStage.setTitle("Sample6");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
    public static void main(String[] args) {
        launch(args);
    }
}
