package dad.bindings.samples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Sample5 extends Application {

    private TextField izquierdaText;
    private TextField derechaText;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        izquierdaText = new TextField();
        izquierdaText.setPrefColumnCount(5);

        derechaText = new TextField();
        derechaText.setPrefColumnCount(5);

        HBox root = new HBox(5, izquierdaText, derechaText);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root,320,200);

        primaryStage.setTitle("Sample5");
        primaryStage.setScene(scene);
        primaryStage.show();

        derechaText.textProperty().bindBidirectional(izquierdaText.textProperty());

    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
