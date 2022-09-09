/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.io.File;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Restaurant extends Application {
    Label itemLabel;
    Button clearBtn,addBtn,submitBtn,payBtn,saveBtn;
    TextArea priceTA;
    TextField priceTF,quantityTF,paymentTF,changeTF;
    private ComboBox<String> itemCB;
    private String [] itemArray = {"Seafood","Meat","Vegetable","Rice","Mushroom","Tea","Coffee","Soda Drink","Others"};
    @Override
    public void start(Stage primaryStage) {
        
        GridPane pane = new GridPane();
        pane.setHgap(15);
        pane.setVgap(15);
        pane.add(new Label("Item : "), 0, 0);
        ObservableList<String> itemList = FXCollections.observableArrayList(itemArray);
        itemCB = new ComboBox(itemList);
        pane.add(itemCB, 1, 0);
        pane.add(new Label("Price: RM "), 0, 1);
        pane.add(priceTF = new TextField(), 1, 1);
        pane.add(new Label("Quantity: "), 0, 2);
        pane.add(quantityTF = new TextField(), 1, 2);
        priceTA = new TextArea("Item             Quantity          Price");
        priceTA.setEditable(false);
        priceTA.setPrefColumnCount(20);
        priceTA.setPrefRowCount(15);
        pane.add(priceTA, 1, 4);
        pane.add(new Label("Total payment: ") , 2, 5);
        pane.add(paymentTF = new TextField(), 3, 5);
        pane.add(new Label("Change: "),2, 6);
        pane.add(changeTF = new TextField(), 3, 6);
        pane.add(payBtn = new Button("Pay"), 2, 7);
        pane.add(saveBtn = new Button("Save"), 3, 7);
        HBox hbox = new HBox();
        clearBtn = new Button("Clear");
        addBtn = new Button("Add");
        submitBtn = new Button("Submit");
        hbox.getChildren().addAll(clearBtn,addBtn,submitBtn);
        pane.add(hbox, 0, 6);
        
        addBtn.setOnAction(e->{
            try{
                String itemName = itemCB.getValue();
                String priceStr = priceTF.getText();
                double price = Double.parseDouble(priceStr);
                String quantityStr = quantityTF.getText();
                int quantity = Integer.parseInt(quantityStr);
               // priceTA.setWrapText(true);
                String m = itemName + "\t\t" + quantity + "\t\t\t" + price + "\n";
                priceTA.setText(priceTA.getText() + "\n" + m);
                priceTF.setText("");
                quantityTF.setText("");
                
                
            
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Number must be numeric");
            }
            
            
            
        
        });
        clearBtn.setOnAction(e->{
            priceTA.setText("");
        
        });
        
        submitBtn.setOnAction(e->{
            String priceStr = priceTF.getText();
            double price = Double.parseDouble(priceStr);
            String quantityStr = quantityTF.getText();
            int quantity = Integer.parseInt(quantityStr);
            double total = 0;
            double totalPrice = total + (price * quantity);
            String d = "\t\t\t" + String.valueOf(totalPrice);
            priceTA.setText(priceTA.getText() + d);
        });
        
        payBtn.setOnAction(e->{
            String paymentStr = paymentTF.getText();
            double payment = Double.parseDouble(paymentStr);
            
        });
        
        saveBtn.setOnAction(e->{
            File fileName = new File("Sales.txt");
            
        });
        
        
        
        
        
        
        
        
        
        Scene scene = new Scene(pane, 700, 550);
        
        primaryStage.setTitle("SUC Economic Rice Restaurant");
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
