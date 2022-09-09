/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class DemoBroderPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();//不用打getchildren（）
        pane.setStyle("-fx-background-color:pink");
        Button topBTN,bottomBtn, leftBtn, rightBtn;
        pane.setTop(topBTN = new Button("Top"));
        pane.setBottom(bottomBtn = new Button("Buttom"));
        pane.setLeft(leftBtn = new Button("left"));
        pane.setRight(rightBtn = new Button("Right"));
        pane.setCenter(new Button("center"));
        
        //直接写颜色
        topBTN.setTextFill(Color.RED);
        
        //set颜色给他 然后才等于他
        Color c = new Color(0.5 , 0 , 0.5 , 1);
        bottomBtn.setTextFill(c);
        
        //直接等于他
        leftBtn.setTextFill(Color.color(0,0,0));
        
        //RGB
        rightBtn.setTextFill(Color.rgb(150, 100, 0));
        
        //用CSS
        topBTN.setStyle("-fx-background-color:yellow");
        
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
