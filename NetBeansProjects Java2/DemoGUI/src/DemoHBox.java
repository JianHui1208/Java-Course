/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class DemoHBox extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox();
        Image image1 = new Image("1.png");
        //getClass().getResourceAsStream("JPG.jpg").toString()
        //has problom use this
        ImageView view1 = new ImageView(image1);
        view1.setFitHeight(100);
        view1.setFitWidth(100);
        
        ImageView view2 = new ImageView(image1);
        pane.getChildren().addAll(view1, view2);
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Login Form");
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
