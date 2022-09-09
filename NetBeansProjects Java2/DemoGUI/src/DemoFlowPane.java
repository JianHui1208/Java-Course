/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class DemoFlowPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane(10,5);
//        pane.setHgap(10);//btn之间的距离（左右）
//        pane.setVgap(5);//btn之间的距离（上下）
        pane.setAlignment(Pos.TOP_CENTER);//btn的位置
        Button okBtn = new Button("1");
        Button cancelBtn = new Button("2");
        Button okBtn1 = new Button("3");
        Button cancelBtn1 = new Button("4");
        Button okBtn2 = new Button("5");
        Button cancelBtn2 = new Button("6");
        Button okBtn3 = new Button("7");
        Button cancelBtn3 = new Button("8");
        Button okBtn4 = new Button("9");
        Button cancelBtn4 = new Button("10");
        pane.getChildren().addAll(okBtn, cancelBtn, okBtn1, cancelBtn1, okBtn2, cancelBtn2, okBtn3, cancelBtn3, okBtn4, cancelBtn4);
        
        for(int i=1; i<=10; i++){
            Button btn = new Button("button " + i);
            pane.getChildren().add(btn);
        }
        
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
