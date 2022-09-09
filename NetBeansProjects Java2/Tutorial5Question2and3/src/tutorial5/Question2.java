/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class Question2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setStyle("-fx-background-color:red");
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Setting color using a mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        pane.setOnMouseEntered(e->{
            pane.setStyle("-fx-background-color:yellow");
        });
    
        pane.setOnMouseExited(e->{
            pane.setStyle("-fx-background-color:Green");
        });
        
        pane.setOnMouseClicked(e->{
            pane.setStyle("-fx-background-color:blue");
        });
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
