/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class Question3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text();
        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Displaying a Character");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        pane.requestFocus();
        
        pane.setOnKeyTyped(e->{
            System.out.println(e.getCharacter());
            text.setText(e.getCharacter());
        });
        
        pane.setOnMouseMoved(e->{
        double x = e.getX();
        double y = e.getY();
        
        text.setX(x);
        text.setY(y);
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
