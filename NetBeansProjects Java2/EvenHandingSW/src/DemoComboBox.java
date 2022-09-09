/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class DemoComboBox extends Application {
    private ComboBox stateCB;
    private String[] stateArray = {"Johor","KL"};
    private TextField stateTF;
    private TextArea descriptionTA;
    private Button enterBTN,readTextBTN;
    private ListView<String> nameLV;
    private String[] nameArray = {"Ali","Abu"};
    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();
        stateTF = new TextField();
        enterBTN = new Button("Enter");
        pane.getChildren().addAll(stateTF,enterBTN);
        
        descriptionTA = new TextArea("Write some text here");
        descriptionTA.setPrefColumnCount(10);
        descriptionTA.setPrefRowCount(5);
        readTextBTN = new Button("Display");
        pane.getChildren().addAll(descriptionTA,readTextBTN);
        
        //add combo box
        ObservableList<String> stateList = FXCollections.observableArrayList(stateArray);
        stateCB = new ComboBox(stateList);
        pane.getChildren().add(stateCB);
        
        //listview
        ObservableList<String> nameList = FXCollections.observableArrayList(nameArray);
        nameLV = new ListView(nameList);
        nameLV.setPrefSize(100,100);
        nameLV.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        pane.getChildren().add(nameLV);
        
        //button function
        enterBTN.setOnAction(e->{
            String state = stateTF.getText();
            stateTF.setEditable(false);
//            add option
            stateCB.getItems().add(0,state);
//            delete option
            stateCB.getItems().add(0,state);
//            clear option
            stateCB.getItems().clear();
            stateCB.getItems().add(state);
        });
        
        //function displayBTN
        readTextBTN.setOnAction(e->{
            String OPOP = descriptionTA.getText();
            System.out.println(OPOP);
        });
        
        //function Combo box
        stateCB.setOnAction(e->{
            System.out.println(stateCB.getValue());
            //show index value
            
        });
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        nameLV.getSelectionModel().selectedItemProperty().addListener(e->{
//            System.out.println(nameLV.getSelectionModel().getSelectedItems().toArray());
            Object[]  selectedItem = nameLV.getSelectionModel().getSelectedItems().toArray();
            for(int i = 0; i<selectedItem.length; i++){
                System.out.println(selectedItem[i]);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
