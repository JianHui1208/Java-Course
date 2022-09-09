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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
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
public class PhotoCopyPanel extends Application {
    Button Calculate;
    Label L1,L2,L3,L4,L5;
    RadioButton Color,Black;
    TextField Name,Pages,Cost;
    String StrPrice,StrRadio,StrName,StrPages,M,StrPoint;
    TextArea Result;
    double DouPrice;
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        GridPane G2 = new GridPane();
        GridPane G3 = new GridPane();
        FlowPane F1 = new FlowPane();
        G2.setHgap(10);
        G2.setVgap(5);
        G3.setHgap(10);
        G3.setVgap(5);
        HBox H1 = new HBox();
        L1 = new Label("Type of printing: ");
        Color = new RadioButton("Color");
        Black = new RadioButton("Black");
        Calculate=new Button("Calculate");
        Color.setPadding(new Insets(0,0,0,10));
        Black.setPadding(new Insets(0,0,0,20));
        H1.getChildren().addAll(L1,Color,Black,Calculate);
        G2.add(H1,0,0);
        G2.setPadding(new Insets(100,0,0,0));
         
        G3.add(new Label("Customer Name: "),0,1);
        G3.add(new Label("Number of Pages: "),0,2);
        G3.add(new Label("Printing Cost: "),0,3);
        G3.add(Name = new TextField(),1,1);
        G3.add(Pages = new TextField(),1,2);
        G3.add(Cost = new TextField(),1,3);
        Cost.setEditable(false);
        
        Result = new TextArea("Name     Pages   Type    Printing Cost");
        Result.setEditable(false);
        Result.setPrefColumnCount(20);
        Result.setPrefRowCount(5);
        F1.setPadding(new Insets(130,0,0,0));
        F1.getChildren().addAll(Result);
        pane.getChildren().addAll(F1,G2,G3);
        Scene scene = new Scene(pane, 300, 250);
        
        Color.setOnAction(A->{
            Black.setSelected(false);
        });
        
        Black.setOnAction(A->{
            Color.setSelected(false);
        });
        
        Result.setOnMouseClicked(P->{
                        try{
                            File file = new File("Output.txt");
                            JOptionPane.showMessageDialog(null,"Record Saved");
                            PrintWriter output = new PrintWriter(file);
                            {
                                output.println(Result.getText());
                                output.close();
                            }
                            Name.setText("");
                            Pages.setText("");
                            Cost.setText("");
                            Result.setText("Name     Pages   Type    Printing Cost");
                            Black.setSelected(true);
                            Color.setSelected(false);
                        }catch(FileNotFoundException ex){
                            Logger.getLogger(PhotoCopyPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
        });
        
        Calculate.setOnAction(A->{
            try{
            PhotoCopy Z = new PhotoCopy();
            StrName = Name.getText();
            StrPages = Pages.getText();
            int IntPages = Integer.parseInt(StrPages);
            Z.setPages(IntPages);
            
            if(Color.isSelected()){
                StrRadio = Color.getText();
                Z.getCode(Color.getText());
                DouPrice = Z.calculatePrintingCost();
                StrPoint = String.format("%.2f", Z.calculatePrintingCost());
                DouPrice = Z.calculatePrintingCost();
                StrPrice = String.valueOf(DouPrice);
                Cost.setText(StrPoint);
            }
            
            if(Black.isSelected()){
                StrRadio = Black.getText();
                Z.getCode(Black.getText());
                StrPoint = String.format("%.2f", Z.calculatePrintingCost());
                DouPrice = Z.calculatePrintingCost();
                StrPrice = String.valueOf(DouPrice);
                Cost.setText(StrPoint);
            }
            String D = String.format("%.2f", DouPrice);
            M = String.format(StrName+"\t\t"+StrPages+"\t    "+StrRadio+"\t"+D);
            Result.setText(Result.getText() + "\n" + M);
            
            }catch(NumberFormatException D){
                JOptionPane.showMessageDialog(null,"Must be Enter the Number");
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
