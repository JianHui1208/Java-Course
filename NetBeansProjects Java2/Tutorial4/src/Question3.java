/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class Question3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        
        Image P1 = new Image("1.jpg");
        ImageView V1 = new ImageView(P1);
        
        Image P2 = new Image("2.jpg");
        ImageView V2 = new ImageView(P2);
        
        Image P3 = new Image("3.jpg");
        ImageView V3 = new ImageView(P3);

        pane.setLeft(V1);
        pane.setCenter(V2);
        pane.setRight(V3);
        
        Scene scene = new Scene(pane, 580, 100);
        
        primaryStage.setTitle("Beethoven Ninth Symphony First Movement");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
