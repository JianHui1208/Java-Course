/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class DemoStackPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //at the center
        StackPane root = new StackPane();
        root.getChildren().add(new Label("hello would"));
        root.getChildren().add(new Button("ok"));
        
        Circle c1 = new Circle(50);
        c1.setFill(Color.RED);
        c1.setStroke(Color.BLACK);
        root.getChildren().add(c1);
        
        Circle c2 = new Circle(20, Color.PINK);
        root.getChildren().add(c2);
        
        Label label1 = new Label("SUC");
        label1.setFont(Font.font("Verdana", 20));
        root.getChildren().add(label1);
        
        //text
        Text t1 = new Text(10, 10, "Southern University Collge");
        t1.setFill(Color.BLUE);
        t1.setFont(Font.font("Verdana", 20));
//        t1.setUnderline(true);
//        t1.setStrikethrough(true);
        root.getChildren().add(t1);
        
        Scene scene = new Scene(root, 300, 250);
        
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
