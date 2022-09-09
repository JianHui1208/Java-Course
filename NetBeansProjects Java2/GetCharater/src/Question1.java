/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.StringTokenizer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class Question1 extends Application {
    Label wordLB, passwordLB;
    TextField wordTF, passwordTF;
    Button createBtn, saveBtn, exitBtn;
    
    @Override
    public void start(Stage primaryStage) {
        GridPane g = new GridPane();
        FlowPane f = new FlowPane();    
        
        g.add(wordLB = new Label("Words: "), 0, 0);
        g.add(wordTF = new TextField(), 0, 1);
        g.add(passwordLB = new Label("Password: "), 0, 2);
        g.add(passwordTF = new TextField(), 0, 3);
        passwordTF.setDisable(true);
        
        createBtn = new Button("Create password");
        saveBtn = new Button("Save");
        exitBtn = new Button("Exit");
        f.getChildren().addAll(createBtn, saveBtn, exitBtn);
        f.setHgap(3);
        g.add(f, 0, 5);    
        
        wordLB.setPadding(new Insets(0,0,20,0));
        //wordTF.setPadding(new Insets(0,0,20,0));
        passwordLB.setPadding(new Insets(0,0,20,0));
        //passwordTF.setPadding(new Insets(0,0,20,0));
        
        Scene scene = new Scene(g, 500, 250);
        
        primaryStage.setTitle("Password Application");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        createBtn.setOnAction(e -> {
            String Number = "";
            char array1 = 0;
            String s1 = wordTF.getText();
            StringTokenizer s = new StringTokenizer(s1, " ");
            String [] array = s1.split(" ");           
            for(int i=0; i<array.length; i++){
//                Number  = String.valueOf(s.countTokens());
//                array1 = array[i].charAt(0);
//                System.out.println(Array + Number);
//                System.out.println();
                System.out.print(array[i].charAt(0) + String.valueOf(s.countTokens()));
//                String M = array[i].charAt(0) + String.valueOf(s.countTokens());
                passwordTF.setText(array[i].charAt(0) + String.valueOf(s.countTokens()));
            }
            //passwordTF.setText(String.valueOf(s.countTokens()));
//            System.out.println(array1 + Number);
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
