/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getpersonaldetail;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GetPersonDetail extends Application {
    //class variable
    TextField nameTF,ageTF,dobTF;
    Button enterBtn,saveBtn,searchBtn;
    Label ageInDaysLabel;
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.add(new Label("Name: "),0,0);
        pane.add(nameTF = new TextField(), 1, 0);
        pane.add(searchBtn = new Button("search"),2,0);
        pane.add(new Label("Age: "),0,1);
        pane.add(ageTF = new TextField(),1,1);
        pane.add(new Label("DOB: "),0,2);
        pane.add(dobTF=new TextField("dd/MM/YYYY"),1,2);
        //pane.add(saveBtn = new Button("save"),2,3);
        //pane.add(enterBtn = new Button("Enter"),2,2);
        
        HBox btnPane = new HBox();
        enterBtn=new Button("Enter");
        saveBtn=new Button("Save");
       // searchBtn=new Button("Search");
        btnPane.getChildren().addAll(saveBtn,enterBtn);
        pane.add(btnPane,1,4);
        
        
        
        //enter button action
        enterBtn.setOnAction(e->{
            //write the enter button action here
            //read age,name input from age text field
            //x.getText()
            String ageStr = ageTF.getText();
            int age = Integer.parseInt(ageStr);
            
            //create person object
            //store the name and age in person object
            Person p = new Person();
            p.setName(nameTF.getText());
            p.setAge(age);
            
            //calculate age in day => age * 365
            int ageInDay = age * 365 ;
            
            pane.add(new Label("Age in Days: "),0,3);
            pane.add(ageInDaysLabel = new Label(),1,3);
            ageInDaysLabel.setText(String.valueOf(p.computeAge()));
           /*
            try{
                String name=nameTF.getText();
                //String ageStr=ageTF.getText();
                //int age=Integer.parseInt(ageStr);
                String dobStr=dobTF.getText();
                Date dob=new Date(dobStr);
                String fileName = name+".dat";
                FileOutputStream file=new FileOutputStream("person.dat");
                DataOutputStream output=new DataOutputStream(file);
                output.writeUTF(p.getName());
                output.writeInt(age);
                //output.writeByte();
                output.close();
                JOptionPane.showMessageDialog(null,"Record save successfully");
            }catch(IOException io){
                JOptionPane.showMessageDialog(null,"Error occurred!");
            }*/
        });
        
        searchBtn.setOnAction(e->{
            try{
                String name = nameTF.getText();
                if(name.equals("")){
                    JOptionPane.showMessageDialog(null,"empty name");
                }else{
                    String fileName = name+".dat";
                    FileInputStream file = new FileInputStream(fileName);
                    DataInputStream input=new DataInputStream(file);
                    
                    Person p =new Person();
                    p.setName(name);
                    p.setAge(input.readInt());
                    long dateLong = input.readLong();
                    Date d = new Date (dateLong);
                    p.setDOB(d);
                    input.close();
                    //populate the object data into textfield
                    ageTF.setText(String.valueOf(p.getAge()));
                    
                    //comvert the date to DD/MM/YYYY
                    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
                    String dateStr=sdf.format(p.getDOB());
                    dobTF.setText(dateStr);
                    
                    //String.format("%.2f",10.1234);
                }
            }catch(FileNotFoundException ab){
                JOptionPane.showMessageDialog(null,"file is not exist.");
            }catch (IOException ex) {
                Logger.getLogger(GetPersonDetail.class.getName()).log(Level.SEVERE, null, ex);
            } 
        });
        
        saveBtn.setOnAction(e->{
            try{
                String name=nameTF.getText();
                String ageStr=ageTF.getText();
                int age=Integer.parseInt(ageStr);
                String dobStr=dobTF.getText();
                Date dob=new Date(dobStr);
                String fileName=name+".dat";
                FileOutputStream file = new FileOutputStream(fileName);
                DataOutputStream output=new DataOutputStream(file);
                output.writeInt(age);
                output.writeLong(dob.getTime());
                output.close();
                JOptionPane.showMessageDialog(null,"Record save successfully!");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GetPersonDetail.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GetPersonDetail.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Get Personal Details");
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
