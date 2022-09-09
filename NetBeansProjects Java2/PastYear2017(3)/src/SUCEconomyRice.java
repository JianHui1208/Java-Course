/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class SUCEconomyRice extends Application {
    String [] SelectOption={"Seafood","Meat","Vegetable","Rice","Mushroom","Tea","Coffee","Soda Drink","Other"};
    ObservableList<String> OptionList = FXCollections.observableArrayList(SelectOption);
    ComboBox Item;
    TextField Price,Quantity,Total,change;
    Button Clear,Add,Submit,Pay,Save;            
    TextArea Result;
    Label L1,L2;
    String StrPrice,StrQuantity,StrTotal,Strchange,StrItem,M;
    double DouPrice,Item1,Item2,Item3,Item4,Item5,Item6,Item7,Item8,Item9,Item10;
    int IntQuantity,Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10;
    double T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TotalPrice;
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        GridPane G1 = new GridPane();
        GridPane G2 = new GridPane();
        FlowPane F1 = new FlowPane();
        HBox H1 = new HBox();
        HBox H2 = new HBox();
        HBox H3 = new HBox();
        HBox H4 = new HBox();
        G2.add(new Label("Item:"), 0, 0);
        G2.add(Item = new ComboBox(OptionList), 1, 0);
        G2.add(new Label("Price: RM "), 0, 1);
        G2.add(Price = new TextField(), 1, 1);
        G2.add(new Label("Quantity: "), 0, 2);
        G2.add(Quantity = new TextField(), 1, 2);
        G2.setHgap(10);
        G2.setVgap(5);
        Clear = new Button("Clear");
        Add = new Button("Add");
        Submit = new Button("Submit");
        H1.getChildren().addAll(Clear,Add,Submit);
        G1.add(H1, 0, 0);
        G1.setPadding(new Insets(100,0,0,20));
        
        Result = new TextArea("Item             Quantity          Price");
        Result.setEditable(false);
        Result.setPrefColumnCount(20);
        Result.setPrefRowCount(15);
        F1.setPadding(new Insets(0,0,0,250));
        F1.getChildren().addAll(Result);
        
        L1 = new Label("Total Payment: ");
        Total = new TextField();
        H2.getChildren().addAll(L1,Total);
        H2.setPadding(new Insets(280,0,0,250));
        
        L2 = new Label("Change: ");
        change = new TextField();
        H3.getChildren().addAll(L2,change);
        H3.setPadding(new Insets(320,0,0,250));
        
        Save = new Button("Save");
        Pay = new Button("Pay");
        H4.getChildren().addAll(Pay,Save);
        H4.setPadding(new Insets(370,0,0,300));

        pane.getChildren().addAll(F1,H4,H3,H2,G1,G2);
        
        Add.setOnAction(A->{
            StrItem = (String) Item.getValue();
            StrPrice = Price.getText();
            StrQuantity = Quantity.getText();
            Price.setText("");
            Quantity.setText("");
            M = String.format(StrItem + "\t\t" + StrPrice + "\t\t\t" + StrQuantity);
            Result.setText(Result.getText() + "\n" + M);
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
