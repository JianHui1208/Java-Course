/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Interface extends Application {
    TextField CardNumber,Q1,Q2,Q3;
    Label name,point,Item,Quantity,Point,RemainingPoint;
    Button Search,Comfirm,Clear;
    CheckBox A1,A2,A3;
    int A1Point,A2Point,A3Point,TotalItem,IntQ1,IntQ2,IntQ3,TotalQuantity,TotalPoint,tatolItem,IntA1,IntA2,IntA3;
    HBox H1 = new HBox();
    HBox H2 = new HBox();
    HBox H3 = new HBox();
    String StrCardNumber,StrQ1,StrQ2,StrQ3;
    String MSG1 = "";
    String MSG2 = "";
    String MSG3 = "";
    int IntPoint;
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        GridPane G2 = new GridPane();
        GridPane G1 = new GridPane();
        FlowPane F1 = new FlowPane();
        G2.add(new Label("MemberCardNumber: "),0,0);
        G2.add(CardNumber = new TextField(),1,0);
        G2.add(Search = new Button("Search"),2,0);
        G2.add(Clear = new Button("Clear"),3,0);
        G2.add(new Label("CustomerName: "),0,1);
        G2.add(new Label("Available Point: "),0,2);
        G2.add(name = new Label("---"),1,1);
        G2.add(point = new Label("---"),1,2);
        G1.add(new Label("Total Item: "),0,0);
        G1.add(new Label("Total Quantity: "),0,1);
        G1.add(new Label("Total Point: "),0,2);
        G1.add(new Label("Remaining Point: "),0,3);
        G1.add(Item = new Label("0"),1,0);
        G1.add(Quantity = new Label("0"),1,1);
        G1.add(Point = new Label("0"),1,2);
        G1.add(RemainingPoint = new Label(""),1,3);
        G1.add(Comfirm = new Button("Comfirm"),1,4);
        G1.setPadding(new Insets(200,0,0,0));
        F1.setPadding(new Insets(80,0,0,0));
        pane.getChildren().addAll(G1,F1,G2);
        
        Clear.setOnAction(A->{
            CardNumber.clear();
            name.setText("---");
            point.setText("---");
            Item.setText("0");
            Quantity.setText("0");
            Point.setText("0");
            RemainingPoint.setText("");
        });
        
        Search.setOnAction(A->{
            try{
            StrCardNumber = CardNumber.getText();
            int intCardNumber = Integer.parseInt(StrCardNumber);
                switch (intCardNumber) {
                    case 1001:
                        {
                            StrCardNumber = CardNumber.getText();
                            File file = new File(StrCardNumber + ".txt");
                            Scanner input = new Scanner(file);
                            name.setText(input.next() + " " + input.next());
                            IntPoint = input.nextInt();
                            String M = String.valueOf(IntPoint);
                            point.setText(M);
                            RemainingPoint.setText(M);
                            input.close();
                            A1 = new CheckBox("Anniversary Cup (100 pt)  Quantity: ");
                            A2 = new CheckBox("Jusco Voucher RM10 (200pt) Quantity: ");
                            A3 = new CheckBox("Umbrella(100pt) Quantity: ");
                            Q1 = new TextField();
                            Q2 = new TextField();
                            Q3 = new TextField();
                            F1.getChildren().addAll(A1,Q1,A2,Q2,A3,Q3);
                            break;
                        }
                    case 1002:
                        {
                            StrCardNumber = CardNumber.getText();
                            File file = new File(StrCardNumber + ".txt");
                            Scanner input = new Scanner(file);
                            name.setText(input.next() + " " + input.next() + input.next() + " " + input.next() + " " + input.next());
                            IntPoint = input.nextInt();
                            String M = String.valueOf(IntPoint);
                            point.setText(M);
                            RemainingPoint.setText(M);
                            input.close();
                            A1 = new CheckBox("Anniversary Cup (100 pt)  Quantity: ");
                            A2 = new CheckBox("Jusco Voucher RM10 (200pt) Quantity: ");
                            A3 = new CheckBox("Umbrella(100pt) Quantity: ");
                            Q1 = new TextField();
                            Q2 = new TextField();
                            Q3 = new TextField();
                            F1.getChildren().addAll(A1,Q1,A2,Q2,A3,Q3);
                            break;
                        }
                    default:
                        JOptionPane.showMessageDialog(null,"You no is Member.");
                        break;
                }
            }catch(FileNotFoundException e){
            System.out.println("File no found");
        }
        });
        
        Comfirm.setOnAction(A->{
            try{
            MemberCard X = new MemberCard();
            if(A1.isSelected()){
                IntA1 = 1;
                StrQ1 = Q1.getText();
                IntQ1 = Integer.parseInt(StrQ1);
                A1Point = IntQ1 * 100;
                MSG1 = "1)Anniversary Cup(100pt) X" + StrQ1;
            }
            if(A2.isSelected()){
                IntA2 = 1;
                StrQ2 = Q2.getText();
                IntQ2 = Integer.parseInt(StrQ2);
                A2Point = IntQ2 * 200;
                MSG2 = "2)Jusco Voucher RM10 (200pt) X" + StrQ2;
            }
            if(A3.isSelected()){
                IntA3 = 1;
                StrQ3 = Q3.getText();
                IntQ3 = Integer.parseInt(StrQ3);
                A3Point = IntQ3 * 100;
                MSG3 = "3)Umbrella(100pt) X" + StrQ3;
            }
            
            TotalQuantity = IntQ1 + IntQ2 + IntQ3;
            TotalItem = IntA1 + IntA2 + IntA3;
            TotalPoint = A1Point + A2Point + A3Point;
            
            String LBTotalQuantity = String.valueOf(TotalQuantity);
            String LBTotalItem = String.valueOf(TotalItem);
            String LBTotalPoint = String.valueOf(TotalPoint);
            
            Item.setText(LBTotalItem);
            Quantity.setText(LBTotalQuantity);
            Point.setText(LBTotalPoint);
            
            int J = X.redeemPoint(IntPoint,TotalPoint);
            
            if(J < 0){
                Item.setText("0");
                Quantity.setText("0");
                Point.setText("0");
                JOptionPane.showMessageDialog(null,"You have exceeded your due score");
            }else{
                JOptionPane.showMessageDialog(null,"Receipt\n" + "Member Card Number: " + StrCardNumber + "\n"
                + "Member Name: " + name.getText() + "\n" 
                + "Remaining Point: " + J + "\n"
                + "Redeemption List:\n"
                + MSG1 + "\n" + MSG2 + "\n" + MSG3);
            }
            }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Must be enter Quantity");
            }
        });
        
        Scene scene = new Scene(pane, 300, 250);
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
