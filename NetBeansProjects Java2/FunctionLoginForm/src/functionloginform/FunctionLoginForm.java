/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionloginform;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class FunctionLoginForm extends Application {
    //class variable
    private TextField NameTF,ageTF;
    private Button enterbtn;
    private Label ageInDaysLabel;
    @Override
    public void start(Stage primaryStage) {
        
        GridPane pane = new GridPane();
        pane.setHgap(10);//一行之间的距离
        pane.setVgap(5);
        pane.add(new Label("Name: "), 0, 0);
        pane.add(NameTF = new TextField(), 1, 0);
        pane.add(new Label("Age: "), 0, 1);
        pane.add(ageTF = new TextField(), 1, 1);
        pane.add(enterbtn=new Button("Enter"), 1, 2);
        

        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //enter button action
        enterbtn.setOnAction(e->{
            //write the enter button action here
            //read age input from age text field
            //x.getText()
            String ageStr = ageTF.getText();
            int age = Integer.parseInt(ageStr);
            
            //calculate age in day => age * 365
            int ageInDay = age * 365;
            Person p=new Person();
            p.setName(NameTF.getText());
            p.setAge(age);
            //display result at ageIndayLabel
            //x.setText()
            //computeAge()  from  person class and display it
//            pane.add(new Label("Age in days: "), 0, 3);
//            pane.add(ageInDaysLabel = new Label(), 1, 3);
//            ageInDaysLabel.setText(String.valueOf(p.compuAge()));
            JOptionPane.showMessageDialog(null, p.toString());
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
