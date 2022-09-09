/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class WoofWashPanel extends Application {
    RadioButton Gold,Silver;
    CheckBox Bath,Cut,Trim;
    TextField Cost,Amount,Payable;
    Button Calculate,Clear,Exit;
    String StrCost,StrAmount,StrPayable,MSG;
    TextArea Result;
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        GridPane G1 = new GridPane();
        FlowPane F1 = new FlowPane();
        G1.setHgap(10);
        G1.setVgap(5);
        G1.setPadding(new Insets(0,0,0,10));
        G1.add(new Label("Membership: "),0,0);
        G1.add(Gold = new RadioButton("Gold"),1,0);
        G1.add(Silver = new RadioButton("Silver"),2,0);
        G1.add(Bath = new CheckBox("Bath(RM20)"),0,1);
        G1.add(Cut = new CheckBox("Cut(RM10)"),1,1);
        G1.add(Trim = new CheckBox("Trim(RM8)"),2,1);
        G1.add(new Label("Total Cost: "),0,2);
        G1.add(Cost = new TextField(),1,2);
        G1.add(Calculate = new Button("Calculate"),2,2);
        G1.add(new Label("Discount Amount: "),0,3);
        G1.add(Amount = new TextField(),1,3);
        G1.add(Clear = new Button("Clear"),2,3);
        G1.add(new Label("Net Fee Payable: "),0,4);
        G1.add(Payable = new TextField(),1,4);
        G1.add(Exit = new Button("Exit"),2,4);
        
        Result = new TextArea("Membership       Tatol Charges       Discount Amount       NetFee Payable");
        Result.setEditable(false);
        Result.setPrefColumnCount(50);
        Result.setPrefRowCount(5);
        F1.setPadding(new Insets(130,0,0,0));
        F1.getChildren().addAll(Result);
        
        pane.getChildren().addAll(F1,G1);
        Scene scene = new Scene(pane, 360, 250);
        
        Bath.setOnAction(A->{
            Cut.setSelected(false);
            Trim.setSelected(false);
        });
        
        Cut.setOnAction(A->{
            Bath.setSelected(false);
            Trim.setSelected(false);
        });
        
        Trim.setOnAction(A->{
            Cut.setSelected(false);
            Bath.setSelected(false);
        });
        
        Gold.setOnAction(A->{
            Silver.setSelected(false);
        });
        
        Silver.setOnAction(A->{
            Gold.setSelected(false);
        });
        
        Clear.setOnAction(A->{
            Gold.setSelected(true);
            Silver.setSelected(false);
            Bath.setSelected(false);
            Cut.setSelected(false);
            Trim.setSelected(false);
            Cost.setText("");
            Amount.setText("");
            Payable.setText("");
            Result.setText("Membership       Tatol Charges       Discount Amount       NetFee Payable");
        });
        
        Exit.setOnAction(A->{
            int dialogboxBTN = JOptionPane.YES_OPTION;
            dialogboxBTN = JOptionPane.showConfirmDialog(null,"Do you want to save the records?",null,dialogboxBTN);
            if(dialogboxBTN == JOptionPane.YES_OPTION){
                
                        
                        
                            try{
                            File file = new File("Output.txt");
                            PrintWriter output = new PrintWriter(file);
                            {
                                output.println(Result.getText());
                                output.close();
                                JOptionPane.showMessageDialog(null,"Record Saved");
                            }
                            }catch(FileNotFoundException ex){
                            Logger.getLogger(WoofWashPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }

//                        try{
//                            File file = new File("Output.txt");
//                            PrintWriter output = new PrintWriter(file);
//                            output.println(Result.getText());
//                            output.close();
//                            JOptionPane.showMessageDialog(null,"Record Saved");
//                        }catch(FileNotFoundException Q){
//                            JOptionPane.showMessageDialog(null,"File not Exist");
//                        }
                        
                            Gold.setSelected(true);
                            Silver.setSelected(false);
                            Bath.setSelected(false);
                            Cut.setSelected(false);
                            Trim.setSelected(false);
                            Cost.setText("");
                            Amount.setText("");
                            Payable.setText("");
                            Result.setText("Membership   Tatol Charges Discount Amount       NetFee Payable");

            }else if(dialogboxBTN == JOptionPane.NO_OPTION){
                System.exit(0);
            }
        });
        
        Calculate.setOnAction(A->{
            
            if(Bath.isSelected() == false && Cut.isSelected() == false && Trim.isSelected() == false){
                JOptionPane.showMessageDialog(null,"Must be Select One Servies");
            }else{
                
            if(Gold.isSelected()){
                MSG = "Gold";
                if(Bath.isSelected()){
                    Cost.setText("20.0");
                    Amount.setText("3.0");
                    Payable.setText("17.0");
                }
                if(Cut.isSelected()){
                    Cost.setText("10.0");
                    Amount.setText("1.5");
                    Payable.setText("8.5");
                }
                if(Trim.isSelected()){
                    Cost.setText("8.0");
                    Amount.setText("1.2");
                    Payable.setText("6.8");
                }
            }
            
            if(Silver.isSelected()){
                MSG = "Silver";
                if(Bath.isSelected()){
                    Cost.setText("20.0");
                    Amount.setText("2.0");
                    Payable.setText("18.0");
                }
                if(Cut.isSelected()){
                    Cost.setText("10.0");
                    Amount.setText("1.0");
                    Payable.setText("9.0");
                }
                if(Trim.isSelected()){
                    Cost.setText("8.0");
                    Amount.setText("0.8");
                    Payable.setText("7.2");
                }
            }
            String M = String.format(MSG +"\t\t"+ Cost.getText() +"\t\t"+ Amount.getText() +"\t\t"+ Payable.getText());
            Result.setText(Result.getText() + "\n" + M);
            }
        });
        
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
