/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class DemoCheckBox extends Application {
    private CheckBox readCB, swimCB, playGamesCB;
    private Label resultLabel;
    private RadioButton maleRB, FemaleRB;
    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();
        
        //creta checkbox, place the checkbox on box
        VBox hobbyPane = new VBox();
        readCB = new CheckBox("Reading");
        swimCB = new CheckBox("Swimming");
        playGamesCB = new CheckBox("Play Game");
        resultLabel = new Label("");
        resultLabel.setPadding(new Insets(100,0,0,200));
        hobbyPane.getChildren().addAll(readCB, swimCB, playGamesCB, resultLabel);
        
        //when user check on readCB, display dialog box =>reading
        readCB.setOnAction(e->{
            resultLabel.setText(getHobbies());
        });
        
        swimCB.setOnAction(e->{
               resultLabel.setText(getHobbies());
        });
        
        
        playGamesCB.setOnAction(e->{
               resultLabel.setText(getHobbies());
        });
        
        pane.getChildren().add(hobbyPane);
        
        
        //****Radio button
        maleRB = new RadioButton("Male");
        FemaleRB = new RadioButton("FameleRB");
        ToggleGroup genderGruop = new ToggleGroup();
        maleRB.setToggleGroup(genderGruop);
        FemaleRB.setToggleGroup(genderGruop);
        maleRB.setSelected(true);
        HBox genderPane = new HBox();
        genderPane.getChildren().addAll(maleRB, FemaleRB);
        pane.getChildren().add(genderPane);
        
        maleRB.setOnAction(e->{
            displayGender();
        });
        
        FemaleRB.setOnAction(e->{
            displayGender();
        });
        
        
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }//end start method
    
    public void displayGender(){
        String gender = "";
        if(maleRB.isSelected()){
            gender = maleRB.getText();
            }else{
            gender = FemaleRB.getText();
        }
        JOptionPane.showMessageDialog(null, "You select "+gender+" Option");
    }
    
    //read data from check box
    public String getHobbies(){
        String MSG = "";
        if(readCB.isSelected()){//true/false 
               MSG += readCB.getText();
            };
        if(swimCB.isSelected()){//true/false 
               MSG += swimCB.getText();
            };
        if(playGamesCB.isSelected()){//true/false 
               MSG += playGamesCB.getText();
            };
            return MSG;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
