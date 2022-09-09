/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcheckbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class TestCheckBox extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        CheckBox C1 = new CheckBox("Function");
        pane.getChildren().addAll(C1);
        Scene scene = new Scene(pane, 300, 250);
        
        C1.setOnMouseClicked(P->{
            TestSecondPage t = new TestSecondPage();
            JOptionPane.showMessageDialog(null, t.getName());
            C1.setSelected(false);
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
