/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class Question1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                int a = (int)(Math.random()*3);
                if(a == 0){
                    pane.add(new ImageView(new Image("x.gif")),y, x);
                }else if(a == 1){
                    pane.add(new ImageView(new Image("o.gif")),y, x);
                }
            }
        }
        
        Scene scene = new Scene(pane, 150, 150);
        
        primaryStage.setTitle("Tic tac Toe");
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
