/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class Question2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox pane = new VBox(); 
        
        Label L1 = new Label("Department of Computer Science");
        Label L2 = new Label("Faculty of Engineering and Information Technology");
        Label L3 = new Label("Southern University College");
        Label L4 = new Label("Tel: +607-5586605");
        
        L1.setFont(Font.font("TimesRoman", FontWeight.BOLD, 20));
        L1.setTextFill(Color.BLUE);
        
        L2.setFont(Font.font("TimesRoman", 16));
        L2.setTextFill(Color.RED);
        
        L4.setFont(Font.font("TimesRoman", FontPosture.ITALIC, 10));
                
        pane.getChildren().addAll(L1, L2, L3, L4);
        
        Scene scene = new Scene(pane, 400, 250);
        
        primaryStage.setTitle("Text and Font!");
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
