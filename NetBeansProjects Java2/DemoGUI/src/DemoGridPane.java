/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class DemoGridPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setHgap(10);//一行之间的距离
        pane.setVgap(5);//上下的距离
        pane.add(new Label("Name: "), 0, 0);
        TextField tf = new TextField();
        pane.add(tf, 1, 0);
        pane.add(new Label("Home address"),0,1);
        pane.add(new TextField("Enter your home address"),1,1);
        pane.add(new Button("Enter"),0,2);
        pane.add(new Button("Clear"),1,2);
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
