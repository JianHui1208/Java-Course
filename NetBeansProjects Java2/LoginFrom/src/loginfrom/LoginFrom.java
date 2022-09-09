/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginfrom;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class LoginFrom extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Image img = new Image("logo.jpg");
        ImageView v1 = new ImageView(img);
        v1.setFitHeight(147);
        v1.setFitWidth(117);
        pane.getChildren().add(v1);
        Label label1 = new Label("Southren University Colloge");
        label1.setFont(Font.font("Agency FB",30));
        label1.setPadding(new Insets(55,0,0,120));
        pane.getChildren().add(label1);
        GridPane g1 = new GridPane();
        g1.setHgap(10);//一行之间的距离
        g1.setVgap(5);
        g1.add(new Label("UesrName: "), 0, 0);//bordor pane
        TextField tf = new TextField();
        g1.add(tf, 1, 0);
        g1.add(new Label("Password: "),0,1);
        TextField tf1 = new TextField();
        g1.add(tf1, 1, 1);
        GridPane g2 = new GridPane();
        g2.add(new Button("Submit"),0,3);
        g2.add(new Button("Clear"),1,3);
        g2.add(new Button("Exit"),2,3);
        g1.setPadding(new Insets(150,0,0,100));
        g2.setHgap(10);//一行之间的距离
        g2.setVgap(5);
        pane.getChildren().add(g1);
        pane.getChildren().add(g2);
        g2.setPadding(new Insets(200,0,0,100));


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
