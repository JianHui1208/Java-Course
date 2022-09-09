/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

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
public class Question1 extends Application {
    
    public TextField length,width,OutArea,OutPerimeter;
    public Button enterBTN,exitBTN;
    
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.add(new Label("Enter the length: "),0 ,0);
        pane.add(length = new TextField(),1 ,0);
        pane.add(new Label("Enter the width: "),0 ,1);
        pane.add(width = new TextField(),1 ,1);
        pane.add(new Label("Area: "),0 ,2);
        pane.add(OutArea = new TextField(),1 ,2);
        OutArea.setEditable(false);
        pane.add(new Label("Perimeter: "),0 ,3);
        pane.add(OutPerimeter = new TextField(),1 ,3);
        OutPerimeter.setEditable(false);
        pane.add(enterBTN = new Button("Calculate"),0 ,4);
        pane.add(exitBTN = new Button("Exit"),1 ,4);
        
        enterBTN.setOnAction(e->{
            String StrLength = length.getText();
            double DouLength = Double.parseDouble(StrLength);

            String StrWidth = width.getText();
            double DouWidth = Double.parseDouble(StrWidth);

            Rectangle A = new Rectangle();

            A.setLength(DouLength);
            A.setWidth(DouWidth);

            OutArea.setText(String.valueOf(A.getArea()));
            OutPerimeter.setText(String.valueOf(A.getPerimeter()));
        });
        
        exitBTN.setOnAction(e -> {
            System.exit(0);
        });
        
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Area and Perimeter of a Rectangle");
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
