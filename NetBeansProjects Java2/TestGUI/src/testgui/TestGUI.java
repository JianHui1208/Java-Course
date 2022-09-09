/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgui;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class TestGUI extends Application {
    CheckBox C1,C2,C3,C4,C5;
    Button SubmitBtn,exitBtn;
    String CustomerFeedback;
    TextArea descriptionTA;
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        GridPane G2 = new GridPane();
        G2.add(new Label("Customer Feedback"), 1, 3);
        G2.add(new Label(),1,4);
        G2.add(C1 = new CheckBox("Very Good"), 1, 5);
        G2.add(C2 = new CheckBox("Good"), 1, 6);
        G2.add(C3 = new CheckBox("Normal"), 1, 7);
        G2.add(C4 = new CheckBox("Poor"), 1, 8);
        G2.add(C5 = new CheckBox("Worst"), 1, 9);
        G2.add(new Label(),1,10);
        G2.add(descriptionTA = new TextArea("Write some text here"),1,11);
        G2.add(SubmitBtn = new Button("Submit"),1,12);
        G2.add(exitBtn = new Button("Exit"),2,12);
        descriptionTA.setPrefColumnCount(20);
        descriptionTA.setPrefRowCount(5);
        G2.setHgap(10);
        G2.setVgap(5);
        
        pane.getChildren().addAll(G2);
                
        C1.setOnAction(e->{
            if(C1.isSelected()){
                C2.setSelected(false);
                C3.setSelected(false);
                C4.setSelected(false);
                C5.setSelected(false);
            }
        });
        
        C2.setOnAction(e->{
            if(C2.isSelected()){
                C1.setSelected(false);
                C3.setSelected(false);
                C4.setSelected(false);
                C5.setSelected(false);
            }
        });
        
        C3.setOnAction(e->{
            if(C3.isSelected()){
                C2.setSelected(false);
                C1.setSelected(false);
                C4.setSelected(false);
                C5.setSelected(false);
            }
        });
        
        C4.setOnAction(e->{
            if(C4.isSelected()){
                C2.setSelected(false);
                C3.setSelected(false);
                C1.setSelected(false);
                C5.setSelected(false);
            }
        });
        
        C5.setOnAction(e->{
            if(C5.isSelected()){
                C2.setSelected(false);
                C3.setSelected(false);
                C4.setSelected(false);
                C1.setSelected(false);
            }
        });
        
        SubmitBtn.setOnAction(e->{
            try{
            File file = new File("CustomerFeedback.txt");
            PrintWriter output = new PrintWriter(file);
            FileOutputStream output1 = new FileOutputStream("Sample.dat",true);
            DataOutputStream outputData = new DataOutputStream(output1);
            CustomerFeedback = descriptionTA.getText();
            
            if(C1.isSelected()){
                outputData.writeUTF("Very Good");
                output.println("Very Good");
            }
            
            if(C2.isSelected()){
                outputData.writeUTF("Good");
                output.println("Good");
            }
            
            if(C3.isSelected()){
                outputData.writeUTF("Normal");
                output.println("Normal");
            }
            
            if(C4.isSelected()){
                outputData.writeUTF("Poor");
                output.println("Poor");
            }
            
            if(C5.isSelected()){
                outputData.writeUTF("Worst");
                output.println("Worst");
            }
            
            outputData.writeUTF(CustomerFeedback);
            output.println(CustomerFeedback);
            output.close();
            output1.close();
            
            FileInputStream input = new FileInputStream("Sample.dat");
            DataInputStream inputData = new DataInputStream(input);
            while(inputData.available()>0){
                System.out.println(inputData.readUTF());
            }
            inputData.close();
            }catch(FileNotFoundException A){
                System.out.println("File no Found");
            } catch (IOException ex) {
                Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        Scene scene = new Scene(pane, 320, 330);
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
