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
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * read radius value from radius text field and display the area (result) in area text field
 */
public class CircleGUI extends Application {
    TextField radiusTF;
    @Override
    public void start(Stage primaryStage) {
        Button enterBtn = new Button("Enter");
        TextField radiusTF = new TextField();
        
        FlowPane root =  new FlowPane();
        root.getChildren().addAll(new Label("Enter radius:"), radiusTF, enterBtn);
        
        TextField areaTF = new TextField();
        areaTF.setEditable(false);
        root.getChildren().addAll(new Label("Area:"), areaTF);
        
        enterBtn.setOnAction(e->{
            try{
            Circle A = new Circle();
            String StrRadius = radiusTF.getText();
            if(StrRadius.equals("")){
                JOptionPane.showMessageDialog(null,"Must be enter number");
            }else{
            double radius = Double.parseDouble(StrRadius);             
            A.setRadius(radius);            
            areaTF.setText(String.valueOf(radius));
            }
            }catch(NumberFormatException A){
                JOptionPane.showMessageDialog(null,"Radius must be numeric");
            }catch(IllegalArgumentException A){
                JOptionPane.showMessageDialog(null,A.getMessage());
            }
        });
        
        Scene scene = new Scene(root, 280, 100);
        
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
