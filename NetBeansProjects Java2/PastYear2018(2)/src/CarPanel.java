/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class CarPanel extends Application {
    CheckBox CBox1;
    TextField ModelTF,PriceTF,CapacityTF,YearTF,AgeOfCarTF,LuxuryTF,EnterAgeTF;
    Button Process,Clear,Exit;
    String fileName,StrYear;
    int IntYear,IntCapacity;
    Label L1,L2;
    Car X = new Car();
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        GridPane G1 = new GridPane();
        GridPane G2 = new GridPane();
        G2.setHgap(10);
        G2.setVgap(5);
        G2.add(L1 = new Label("~Check Function~"),0,0);
        G2.add(new Label("Model: "),0,1);
        G2.add(new Label("Price: "),0,2);
        G2.add(new Label("Capacity: "),0,3);
        G2.add(new Label("Year: "),0,4);
        G2.add(new Label("Age of Car: "),0,5);
        G2.add(new Label("Luxury?:"),0,6);
        G2.add(L2 = new Label("~Search Function~"),0,7);
        G2.add(new Label("Enter Age of Car: "),0,8);
        G2.add(CBox1=new CheckBox("Luxury Car?"),0,9);
        G2.add(ModelTF = new TextField(),1,1);
        G2.add(PriceTF = new TextField(),1,2);
        G2.add(CapacityTF = new TextField(),1,3);
        G2.add(YearTF = new TextField(),1,4);
        G2.add(AgeOfCarTF = new TextField(),1,5);
        AgeOfCarTF.setEditable(false);
        G2.add(LuxuryTF = new TextField(),1,6);
        LuxuryTF.setEditable(false);
        G2.add(EnterAgeTF = new TextField(),1,8);
        HBox H1 = new HBox();
        Process=new Button("Process");
        Clear=new Button("Clear");
        Exit = new Button("Exit");
        H1.getChildren().addAll(Process,Clear,Exit);
        G1.add(H1,0,0);
        G1.setPadding(new Insets(280,0,0,80));
        pane.getChildren().addAll(G1,G2);
        
        
        L2.setOnMouseClicked(P->{
                    ModelTF.setEditable(false);
                    PriceTF.setEditable(false);
                    CapacityTF.setEditable(false);
                    YearTF.setEditable(false);
                    AgeOfCarTF.setEditable(false);
                    LuxuryTF.setEditable(false);
                    EnterAgeTF.setEditable(true);
            Process.setOnAction(A->{
                    try{
                        String StrAge = EnterAgeTF.getText();
                        fileName = StrAge + ".dat" ;
                        FileInputStream file = new FileInputStream(fileName);
                        DataInputStream input = new DataInputStream (file);
                        JOptionPane.showMessageDialog(null,"Model: " + input.readUTF()
                                + "\n" + "Price: " + input.readUTF() + "\n" + "Capacity: " + input.readUTF() + "\n" + 
                                        "Year of Manufacturing: " + input.readUTF() + "\n" + "Age of Car: " + input.readUTF() + "\n" + 
                                                "Is Luxuries: " + input.readUTF());
                                input.close();
                    }catch(FileNotFoundException V){
                        JOptionPane.showMessageDialog(null,"File not Exist.");
                    } catch (IOException ex) {
                    Logger.getLogger(CarPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
            });            
        });

            L1.setOnMouseClicked(P->{
                            ModelTF.setEditable(true);
                            PriceTF.setEditable(true);
                            CapacityTF.setEditable(true);
                            YearTF.setEditable(true);
                            AgeOfCarTF.setEditable(false);
                            LuxuryTF.setEditable(false);
                            EnterAgeTF.setEditable(false);
                Process.setOnAction(A->{
                        try{
                            String StrModel = ModelTF.getText();
                            String StrPrice = PriceTF.getText();
                            String StrCapacity = CapacityTF.getText();
                            StrYear = YearTF.getText();
                            IntYear = Integer.parseInt(StrYear);
                            IntCapacity = Integer.parseInt(StrCapacity);

                            X.setYear(IntYear);
                            X.setCapacity(IntCapacity);
                            String s1=String.valueOf(X.isLucuriousCar()); 
                            String age2 = X.ageOfCar();
                            AgeOfCarTF.setText(age2);
                            LuxuryTF.setText(s1);
                            
                            fileName = age2 + ".dat";
                            FileOutputStream file = new FileOutputStream(fileName);
                            DataOutputStream output = new DataOutputStream(file);
                            output.writeUTF(StrModel);
                            output.writeUTF(StrPrice);
                            output.writeUTF(StrCapacity);
                            output.writeUTF(StrYear);
                            output.writeUTF(X.ageOfCar());
                            output.writeUTF(s1);
                            output.close();
                            }catch(FileNotFoundException V){
                                JOptionPane.showMessageDialog(null,"File not Exist.");
                            }catch(IOException V) {
                                Logger.getLogger(CarPanel.class.getName()).log(Level.SEVERE, null, A);
                            }
                    });
                });
        
        Clear.setOnAction(A->{
            CBox1.setSelected(false);
            ModelTF.setText("");
            PriceTF.setText("");
            CapacityTF.setText("");
            YearTF.setText("");
            AgeOfCarTF.setText("");
            LuxuryTF.setText("");
            EnterAgeTF.setText("");
        });
        
        Exit.setOnAction(A->{
                int dialogBtn=JOptionPane.YES_OPTION;
                dialogBtn=JOptionPane.showConfirmDialog(null,"Do you want to exit?","exit",dialogBtn);
                if(dialogBtn==JOptionPane.YES_OPTION){
                    System.exit(0);
                }else if(dialogBtn==JOptionPane.NO_OPTION){
                    int dialogBtn1 = JOptionPane.YES_NO_CANCEL_OPTION;
                }
            });
        
        Scene scene = new Scene(pane, 300, 320);
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
