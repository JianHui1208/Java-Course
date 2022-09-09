/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalcution;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class BMICalcution extends Application {
    public void testError(double heightDou) throws ArithmeticException,IllegalArgumentException{
        if(heightDou == 0){
            throw new ArithmeticException();
        }
    }
   
    private Label name, weight, height, gender, bmi, status;
    private TextField nameTF,weigthTF,heightTF;
    private RadioButton male,female;
    private Button calculateBT,ExitBT,clearBtn,sreachBtn;
    private String weigthStr,heightStr,Name;
    private double BMI,heightDou,weightDou;
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
        GridPane G1 = new GridPane();
        
        G1.setVgap(10);
        G1.setHgap(5);
        
        G1.add(new Label("Name: "), 0, 0);
        G1.add(new Label("Weigth(KG): "), 0, 1);
        G1.add(new Label("Height(M): "), 0, 2);
        G1.add(new Label("Gender: "), 0, 3);
        
        G1.add(nameTF = new TextField(), 1, 0);
        G1.add(weigthTF = new TextField(), 1, 1);
        G1.add(sreachBtn = new Button("Search"), 2, 1);
        G1.add(heightTF = new TextField(), 1, 2);
        G1.add(clearBtn = new Button("Clear"), 2, 2);
        G1.add(male = new RadioButton("Male"), 1, 3);
        G1.add(female = new RadioButton("Female"), 1, 4);
        ToggleGroup gruop = new ToggleGroup();
        male.setToggleGroup(gruop);
        female.setToggleGroup(gruop);
        male.setSelected(true);
        
        G1.add(calculateBT = new Button("Calculate"), 0, 5);
        G1.add(ExitBT = new Button("Exit"), 1, 5);
        
        Label label = new Label("Result: ");
        label.setPadding(new Insets(210,0,0,0));
        name = new Label();
        name.setPadding(new Insets(235,0,0,0));
        weight = new Label();
        weight.setPadding(new Insets(255,0,0,0));
        height = new Label();
        height.setPadding(new Insets(275,0,0,0));
        gender = new Label();
        gender.setPadding(new Insets(295,0,0,0));
        bmi = new Label();
        bmi.setPadding(new Insets(315,0,0,0));
        status = new Label();
        status.setPadding(new Insets(335,0,0,0));
        
        pane.getChildren().addAll(G1,label,name,weight,height,gender,bmi,status);

        ExitBT.setOnAction(e->{
            int dialogboxBTN = JOptionPane.YES_OPTION;
            dialogboxBTN = JOptionPane.showConfirmDialog(null,"Do You want to Exit?","Exit",dialogboxBTN);
            if(dialogboxBTN == JOptionPane.YES_OPTION){
                System.exit(0);
            }else if(dialogboxBTN == JOptionPane.NO_OPTION){
                //
            }
        });
        
        clearBtn.setOnAction(e->{
            nameTF.setText("");
            weigthTF.setText("");
            heightTF.setText("");
            name.setText("");
            male.setSelected(true);
            weight.setText("");
            height.setText("");
            gender.setText("");
            bmi.setText("");
            status.setText("");
        });
        
        sreachBtn.setOnAction(e->{
            try{
                Name = nameTF.getText();
                if(Name.equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter Name.");
                }else{
                    String fileName = Name + ".dat" ;
                    FileInputStream file = new FileInputStream(fileName);
                    DataInputStream input = new DataInputStream (file);
                    name.setText("Name: " + Name);
                    weight.setText("Weight: " + input.readUTF() + " KG");
                    height.setText("Height: " + input.readUTF() + " M");
                    gender.setText("Gender: " + input.readUTF());
                    bmi.setText("BMI: " + input.readUTF());
                    status.setText(input.readUTF());
                    input.close();
                }
            }catch(FileNotFoundException A){
                JOptionPane.showMessageDialog(null,"File not Exist.");
            } catch (IOException A) {
                Logger.getLogger(BMICalcution.class.getName()).log(Level.SEVERE, null, A);
            }
        });
        
        calculateBT.setOnAction(e->{
            try{
            Name = nameTF.getText();
            if(Name.equals("")){
                JOptionPane.showMessageDialog(null,"Must be enter the Name");
            }else{
            weigthStr = weigthTF.getText();
            heightStr = heightTF.getText();
            
            weightDou = Double.parseDouble(weigthStr);
            heightDou = Double.parseDouble(heightStr);
            
            testError(heightDou);
            
            //Two decimal places
            BMI = weightDou / (heightDou*heightDou);
            String BMIStr = String.valueOf(BMI);
            BMIStr = String.format("%.2f", BMI);
            
            name.setText("Name: " + Name);
            weight.setText("Weight: " + weigthStr + " KG");
            height.setText("Height: " + heightStr + " M");
            bmi.setText("BMI: " + BMIStr);
            
            if(male.isSelected()){
            gender.setText("Gender: " + male.getText());
                if(BMI < 20){
                        status.setText("Weight Status: Underweight");
                    }else if(BMI >= 20 && BMI <= 24.9){
                        status.setText("Weight Status: Normal");
                    }else if(BMI >= 25 && BMI <= 31.9){
                        status.setText("Weight Status: Overweight");
                    }else if(BMI >= 32){
                        status.setText("Weight Status: Obese");
                    }
            }
            
            if(female.isSelected()){
            gender.setText("Gender: " + female.getText());
                    if(BMI <= 18.5){
                        status.setText("Weight Status: Underweight");
                    }else if(BMI >= 18.5 && BMI <= 21.9){
                        status.setText("Weight Status: Normal");
                    }else if(BMI >= 22 && BMI <= 27.9){
                        status.setText("Weight Status: Overweight");
                    }else if(BMI >= 28){
                        status.setText("Weight Status: Obese");
                    }
            }
            
            weigthStr = weigthTF.getText();
            heightStr = heightTF.getText();
            String fileName = Name + ".dat";
            FileOutputStream file = new FileOutputStream(fileName);
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF(weigthStr);
            output.writeUTF(heightStr);
            if(male.isSelected()){
                output.writeUTF("Male");
            }
            if(female.isSelected()){
                output.writeUTF("Female");
            }
            output.writeUTF(BMIStr);
            
            if(male.isSelected()){
                if(BMI < 20){
                        output.writeUTF("Weight Status: Underweight");
                    }else if(BMI > 20 && BMI < 24.9){
                        output.writeUTF("Weight Status: Normal");
                    }else if(BMI > 25 && BMI < 31.9){
                        output.writeUTF("Weight Status: Overweight");
                    }else if(BMI > 32){
                        output.writeUTF("Weight Status: Obese");
                    }
            }
            
            if(female.isSelected()){
                    if(BMI < 18.5){
                        output.writeUTF("Weight Status: Underweight");
                    }else if(BMI > 18.5 && BMI < 21.9){
                        output.writeUTF("Weight Status: Normal");
                    }else if(BMI > 22 && BMI < 27.9){
                        output.writeUTF("Weight Status: Overweight");
                    }else if(BMI > 28){
                        output.writeUTF("Weight Status: Obese");
                    }
            }
            output.close();
            JOptionPane.showMessageDialog(null,"Record Save Successfully");
            
            }
            }catch(NumberFormatException A){
                JOptionPane.showMessageDialog(null,"Cannot will be Letter");
            }catch(ArithmeticException A){
                JOptionPane.showMessageDialog(null,"Height cannot will be 0");
            }catch(FileNotFoundException A){
                JOptionPane.showMessageDialog(null,"File not exist.");
            }catch(IOException A){
                Logger.getLogger(BMICalcution.class.getName()).log(Level.SEVERE, null, A);
            }
            
        });
        Scene scene = new Scene(pane, 300, 385);
        primaryStage.setTitle("BMI System");
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
