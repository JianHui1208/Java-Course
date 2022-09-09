/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class Question12 extends Application {
    private TextField SymbolTF,NameTF,ClosingTF,CurrentTF;
    private Button CheckBT,ClearBT,ExitBT;
    private Label L1;
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        GridPane G1 = new GridPane();
        
        G1.setVgap(10);
        G1.setHgap(5);
        
        G1.add(new Label("Symbol: "), 0, 0);
        G1.add(new Label("Name: "), 0, 1);
        G1.add(new Label("Previous Closing Price: "), 0, 2);
        G1.add(new Label("Current Price: "), 0, 3);
        
        G1.add(SymbolTF = new TextField(), 1, 0);
        G1.add(NameTF = new TextField(), 1, 1);
        G1.add(ClosingTF = new TextField(), 1, 2);
        G1.add(CurrentTF = new TextField(), 1, 3);
        G1.add(CheckBT = new Button("Check"), 1, 4);
        G1.add(ClearBT = new Button("Clear"), 2, 0);
        G1.add(ExitBT = new Button("Exit"), 3, 0); 
       
        pane.getChildren().addAll(G1);
        
        Scene scene = new Scene(pane, 500, 250);
        
        CheckBT.setOnAction(e->{
            String StrSymbol = SymbolTF.getText();
            int Symbol = Integer.parseInt(StrSymbol);
            
            String StrName = NameTF.getText();
            
            String StrPCP = ClosingTF.getText();
            double DouPCP = Double.parseDouble(StrPCP);
            
            String StrCP = CurrentTF.getText();
            double DouCP = Double.parseDouble(StrCP);
            
            Stock S1 =new Stock();
            S1.setSymbol(Symbol);
            S1.setName(StrName);
            S1.setpreviousClosingPrice(DouPCP);
            S1.setCurrentPrice(DouCP);
            L1 = new Label(S1.toString());
            L1.setPadding(new Insets(90,0,0,300));
            pane.getChildren().addAll(L1);
        });
        
        ClearBT.setOnAction(e->{
            SymbolTF.setText("");
            NameTF.setText("");
            ClosingTF.setText("");
            CurrentTF.setText("");
        });
        
        ExitBT.setOnAction(e->{
            System.exit(0);
        });
        
        primaryStage.setTitle("Stock Check");
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
