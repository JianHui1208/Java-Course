/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class DemoVBox extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox pane = new VBox();
        Label lebal1 = new Label("welcome Java");
        Label lebal2 = new Label("welcome HTML");
        Label lebal3 = new Label("welcome home");
        
        Font font1 = new Font("Agency FB",30);
        lebal1.setFont(font1);
        lebal2.setFont(Font.font("Agency FB", FontWeight.BOLD 
                ,FontPosture.ITALIC, 20));
        lebal1.setTextFill(Color.PINK);
        lebal3.setPadding(new Insets(50,0,0,20));//padding
        
        
        pane.getChildren().addAll(lebal1,lebal2,lebal3);
        Button exitBtn = new Button("Exit");
        pane.getChildren().add(exitBtn);
        //exitBtn.setFont(font1);
        exitBtn.setPrefSize(100, 50);
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
