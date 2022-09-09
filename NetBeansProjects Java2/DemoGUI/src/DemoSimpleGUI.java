/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class DemoSimpleGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button okBtn = new Button("OK");
        okBtn.setText("ok");
        Scene scene = new Scene(okBtn, 300, 250);
        
        primaryStage.setTitle("MY first GUI!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //create second window
        Button cancelBtn = new Button("Cancal");
        Scene scene2 = new Scene(cancelBtn, 100, 100);
        Stage secondStage = new Stage();
//        //给他固定size
        secondStage.setMaxHeight(100);
        
        primaryStage.setTitle("Second Window");
        primaryStage.setScene(scene2);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
