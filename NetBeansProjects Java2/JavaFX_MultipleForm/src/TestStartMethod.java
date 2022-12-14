/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author lc3532
 */
public class TestStartMethod extends Application {
    private Button enterBtn;
    private TextField nameTF;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.setTitle("Read name from text field and return to main page");
        
        FlowPane root = new FlowPane();
        enterBtn = new Button("Enter");
        nameTF = new TextField();
        root.getChildren().addAll(nameTF, enterBtn);
        Scene scene = new Scene(root, 300, 250);
        
        enterBtn.setOnAction(e->{
            setName(nameTF.getText());
            primaryStage.close();
        });
        
        primaryStage.setScene(scene);
        primaryStage.showAndWait();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
