/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sushishopa;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
//import static sushishopa.SushiShopOrder.Quantity1;

/**
 *
 * @author User
 */
public class SushishopA extends Application {
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    private Image i1;
    private String CustomerName;
    private TextField cnameb,cnumb;
    private Label name,cname,bhour,cnum,hi;
    private Button ConBtn;
    //sushi
    private Label FoodName1 = new Label("| Tamago Egg");
    private Label FoodName2 = new Label("| Inari beancurd");
    private Label FoodName3 = new Label("| KimchiHotate/Scallop");
    //Dessert
    private Label FoodNameD1 = new Label("| Banana Boat");
    private Label FoodNameD2 = new Label("| Macha IceCream");
    private Label FoodNameD3 = new Label("| Agedashi Toufu");
    //drinks
    private Label FoodNamed1 = new Label("| Greed tea");
    private Label FoodNamed2 = new Label("| Drinkable Yoqurt");
    private Label FoodNamed3 = new Label("| NihooSake");
    //Main Dishes
    private Label FoodNameM1 = new Label("| Chicken Chashu Ramen");
    private Label FoodNameM2 = new Label("| Salmon&TunaCombo");
    private Label FoodNameM3 = new Label("| Beef Don");
    //Total Price
    private double TotalPrice1=0;
    private double TotalPrice2=0;
    private double TotalPrice3=0;
    private double TotalPrice4=0;
    private double TotalPrice5=0;
    private double TotalPrice6=0;
    private double TotalPrice7=0;
    private double TotalPrice8=0;
    private double TotalPrice9=0;
    private double TotalPrice10=0;
    private double TotalPrice11=0;
    private double TotalPrice12=0;
    //
    private Label SS1 = new Label("SUSHI ---");
    private Label DD1 = new Label("DESERT ---");
    private Label dd1 = new Label("DRINKS ---");
    private Label MM1 = new Label("MAIN DISHES ---");
    
    protected static int Quantity1,Quantity2,Quantity3,Quantity4,Quantity5,Quantity6,
            Quantity7,Quantity8,Quantity9,Quantity10,Quantity11,Quantity12= 0;
    
    private double Price1 = 2.00;
    private double Price2 = 2.00;
    private double Price3 = 5.00;
    //Dessert
    private double PriceD1 = 5.00;
    private double PriceD2 = 7.00;
    private double PriceD3 = 6.00;
    //driks
    private double Priced1 = 1.00;
    private double Priced2 = 5.00;
    private double Priced3 = 25.00;
    //Main Dishes
    private double PriceM1 = 10.00;
    private double PriceM2 = 35.00;
    private double PriceM3 = 7.00;
    //
    private Label addQuantity1 =new Label(""+Quantity1);
    private Label addQuantity2 =new Label(""+Quantity2);
    private Label addQuantity3 =new Label(""+Quantity3);
    private Label addQuantity4 =new Label(""+Quantity4);
    private Label addQuantity5 =new Label(""+Quantity5);
    private Label addQuantity6 =new Label(""+Quantity6);
    private Label addQuantity7 =new Label(""+Quantity7);
    private Label addQuantity8 =new Label(""+Quantity8);
    private Label addQuantity9 =new Label(""+Quantity9);
    private Label addQuantity10 =new Label(""+Quantity10);
    private Label addQuantity11 =new Label(""+Quantity11);
    private Label addQuantity12 =new Label(""+Quantity12);
    //
    private Label addPrice1 =new Label(""+Price1);
    private Label addPrice2 =new Label(""+Price2);
    private Label addPrice3 =new Label(""+Price3);
    private Label addPrice4 =new Label(""+PriceD1);
    private Label addPrice5 =new Label(""+PriceD2);
    private Label addPrice6 =new Label(""+PriceD3);
    private Label addPrice7 =new Label(""+Priced1);
    private Label addPrice8 =new Label(""+Priced2);
    private Label addPrice9 =new Label(""+Priced3);
    private Label addPrice10 =new Label(""+PriceM1);
    private Label addPrice11 =new Label(""+PriceM2);
    private Label addPrice12 =new Label(""+PriceM3);
    //
    //add btn
    private Button btnAdd1=new Button("+");
    private Button btnAdd2=new Button("+");
    private Button btnAdd3=new Button("+");
    private Button btnAdd4=new Button("+");
    private Button btnAdd5=new Button("+");
    private Button btnAdd6=new Button("+");
    private Button btnAdd7=new Button("+");
    private Button btnAdd8=new Button("+");
    private Button btnAdd9=new Button("+");
    private Button btnAdd10=new Button("+");
    private Button btnAdd11=new Button("+");
    private Button btnAdd12=new Button("+");
    
    //mius btn
    private Button btnMinus1 = new Button("-");
    private Button btnMinus2 = new Button("-");
    private Button btnMinus3 = new Button("-");
    private Button btnMinus4 = new Button("-");
    private Button btnMinus5 = new Button("-");
    private Button btnMinus6 = new Button("-");
    private Button btnMinus7 = new Button("-");
    private Button btnMinus8 = new Button("-");
    private Button btnMinus9 = new Button("-");
    private Button btnMinus10 = new Button("-");
    private Button btnMinus11 = new Button("-");
    private Button btnMinus12 = new Button("-");
    
    private CheckBox worst,poor,average,good,excellent;
    
    private Button btnComfirm = new Button("Comfirm");
    private Button btnex = new Button("Exit");
    private Button btnremove = new Button("Reset");
    
    private Alert RStage = new Alert(Alert.AlertType.INFORMATION);
    private Alert RStage2 = new Alert(Alert.AlertType.INFORMATION);
    
    @Override
    public void start(Stage primaryStage) {
        
        
        GridPane mpane = new GridPane ();
        mpane.setStyle("-fx-background-color:black");
        mpane.add(name=new Label("\t\t\t  Welcome to H.C.W.C Sushi Shop ! "),0 ,0);
        mpane.add(bhour=new Label("\n\n\nBusiness Hour : 2.00 pm ~ 12.00 am"),0 ,1);
        mpane.add(cname=new Label("Please Enter Your name :"),0 ,2);
        mpane.add(cnameb = new TextField(),1 ,2);
        mpane.add(cnum=new Label("Please Enter Your Phone number :"),0 ,3);
        mpane.add(cnumb=new TextField(),1,3);
        mpane.add(hi=new Label("hi"),0 ,5);
        mpane.add(ConBtn=new Button("Clear"),1,5);
        CustomerName = cnameb.getText();
        
      
        
        
        
        name.setFont(Font.font("Algerian", FontWeight.BOLD, 20));
        cnum.setFont(Font.font("Algerian", FontWeight.BOLD, 20));
        bhour.setFont(Font.font("Algerian", FontWeight.BOLD, 20));
        cname.setFont(Font.font("Algerian", FontWeight.BOLD, 20));
        ConBtn.setTextFill(Color.BLACK);
        ConBtn.setStyle("-fx-background-color:white");
        ConBtn.setFont(Font.font("Algerian", FontWeight.BOLD, 15));
        name.setTextFill(Color.RED);
        cname.setTextFill(Color.WHITE);
        cnum.setTextFill(Color.WHITE);
        bhour.setTextFill(Color.WHITE);
        hi.setTextFill(Color.BLACK);
        
        FlowPane bpane = new FlowPane(200,0);
        bpane.setStyle("-fx-background-color:black");
        
        Button NextBtn = new Button("Next");
        Button ExitBtn = new Button("Exit");
        NextBtn.setPrefSize(200,70);
        ExitBtn.setPrefSize(200,70);
        NextBtn.setTextFill(Color.RED);
        ExitBtn.setTextFill(Color.RED);
        NextBtn.setStyle("-fx-background-color:black");
        ExitBtn.setStyle("-fx-background-color:black");
        NextBtn.setFont(Font.font("Algerian", FontWeight.BOLD, 20));
        ExitBtn.setFont(Font.font("Algerian", FontWeight.BOLD, 20));
        //okBtn.setPadding(new Insets(400,0,0,-1560));
        bpane.getChildren().addAll(NextBtn,ExitBtn);
        
        ConBtn.setOnAction(e -> Clear());
        
        cnumb.setOnKeyPressed(e->{
            if(!(e.getCode().isDigitKey())){
                Error();
            cnumb.setText("");
            }
        });
        
        /*cnameb.setOnKeyPressed(e->{
            if(!(e.getCode().isLetterKey())){
                Errora();
            cnameb.setText("");
            }
        });
        */
        
        ExitBtn.setOnAction(e->{
              JOptionPane.showMessageDialog(null,"Thank You ! Come Again !");
                            System.exit(0);
        });
        NextBtn.setOnAction(new EventHandler<ActionEvent>(){
                   @Override
                   public void handle(ActionEvent o){
                     
                       String cna = cnameb.getText();
                       String cnu = cnumb.getText();
                        if(cna.equals("")){
                                 alert.setContentText("Please enter your name!");
                                 alert.showAndWait();
                       }else if(cnu.equals("")){
                                 alert.setContentText("Please enter your phone number!");
                                 alert.showAndWait();
                        }
                       else{
                       CustomerName = cnameb.getText();
                       Menu();
                       }
                     
                   }
          });
        
        
        
        
        BorderPane mborder =new BorderPane();
        
        mborder.setCenter(mpane);
        mborder.setBottom(bpane);
        mpane.setAlignment(Pos.CENTER);
        bpane.setAlignment(Pos.BOTTOM_CENTER);
        cname.setPadding(new Insets(35,0,20,0));
        cnum.setPadding(new Insets(20,0,20,0));
        hi.setPadding(new Insets(20,0,20,0));
        
        i1=new Image("cutesushi.jpg");
        ImageView view1=new ImageView(i1);
        
        Scene scene = new Scene(mborder, 750, 650);
        
        primaryStage.getIcons().add(i1);
        primaryStage.setTitle("Welcome to H.C.W.C Sushi Shop !");
        primaryStage.setScene(scene);
        primaryStage.show();
        
   } 
    private void Clear(){
        cnameb.setText("");
        cnumb.setText("");
        
    }
    private void Error(){ 
        alert.setContentText("Please enter numeric value!");
        alert.showAndWait();
    }
    
   /*  private void Errora(){ 
        alert.setContentText("Your name have number or other symbol ... ? ");
        alert.showAndWait();
    }*/
    
    public void Menu(){
        Stage MenuStage= new Stage();
        
        Date enow= new Date();
        Calendar cal = Calendar.getInstance();
        JOptionPane.showMessageDialog(null, "The Time now is\n " + enow);
         if(cal.get(Calendar.HOUR_OF_DAY)>=12&cal.get(Calendar.HOUR_OF_DAY)<=9){
                    JOptionPane.showMessageDialog(null,"Sorry ! We Haven't Open Yet !\nBusiness Hour : 2.00pm ~ 12.pm \n");
                    System.exit(0);
        }else{
             
        
        FlowPane pane = new FlowPane ();
        pane.setStyle("-fx-background-color:red");
        Label CName = new Label ("Hi "+CustomerName+"!");
        Label name = new Label ("Welcome to H.C.W.C Sushi Shop !");
        CName.setTextFill(Color.BLACK);
        CName.setFont(Font.font("Algerian", FontWeight.BOLD, 40));
        name.setTextFill(Color.BLACK);
        name.setFont(Font.font("Algerian", FontWeight.BOLD, 40));
        pane.getChildren().addAll(CName,name);
        
        
        GridPane pane1= new GridPane();
        pane1.setStyle("-fx-background-color:orange");
        i1=new Image("cutesushi.jpg");
        ImageView view1=new ImageView(i1);
        view1.setFitHeight(150);
        view1.setFitWidth(150);
        Label menu = new Label("\t\t\t  MeNu~\n\n");
        Label sushi = new Label ("\t\t\tSushi\n\t1. Tamago Egg(RM2)\n"+"\t2. Inari beancurd(RM2)\n"
                +"\t3. KimchiHotate/Scallop is(RM5)");
        Label dessert = new Label ("\t\t  Dessert\n"+"\t1. Banana Boat(RM5)\n"+"\t2. Macha IceCream(RM7)\n"
                +"\t3. Agedashi Toufu(RM6)\n");
        Label drinks = new Label ("\n\t\t\t Drinks\n"+"\t1. Greed tea(RM1)\n"+"\t2. Drinkable Yoqurt(RM5)\n"+"\t3. NihooSake(RM25)\n");
        Label mdishes= new Label ("\n\t\t\tMain Dishes\n\t1.Chicken Chashu Ramen(RM10)\n"+"\t2.Salmon&Tuna Combo(RM35)\n"
                +"\t3. Beef Don(RM7)");
        menu.setFont(Font.font("Forte", FontWeight.BOLD, 30));
        sushi.setFont(Font.font("Georgia ", FontWeight.BOLD, 20));
        dessert.setFont(Font.font("Georgia ", FontWeight.BOLD, 20));
        drinks.setFont(Font.font("Georgia ", FontWeight.BOLD, 20));
        mdishes.setFont(Font.font("Georgia ", FontWeight.BOLD, 20));
        menu.setTextFill(Color.BLACK);
        sushi.setTextFill(Color.BLACK);
        dessert.setTextFill(Color.BLACK);
        drinks.setTextFill(Color.BLACK);
        mdishes.setTextFill(Color.BLACK);
        
        
        pane1.add(view1,1,0);
        pane1.add(mdishes,1,2);
        pane1.add(menu,0,0);
        pane1.add(sushi,0,1);
        pane1.add(dessert,1,1);
        pane1.add(drinks,0,2);
        
        FlowPane pane3 = new FlowPane(200,0);
        pane3.setStyle("-fx-background-color:yellow");
        Button Btn = new Button("Next");
        Button Btn1 = new Button("Exit");
        Btn.setPrefSize(200,70);
        Btn1.setPrefSize(200,70);
        Btn.setTextFill(Color.RED);
        Btn1.setTextFill(Color.RED);
        Btn.setStyle("-fx-background-color:yellow");
        Btn1.setStyle("-fx-background-color:yellow");
        Btn.setFont(Font.font("Algerian", FontWeight.BOLD, 20));
        Btn1.setFont(Font.font("Algerian", FontWeight.BOLD, 20));
        //okBtn.setPadding(new Insets(400,0,0,-1560));
        pane3.getChildren().addAll(Btn,Btn1);
        Btn1.setOnAction(e->{
              JOptionPane.showMessageDialog(null,"Thank You ! Come Again !");
              System.exit(0);
        });
        Btn.setOnAction(e->{
              JOptionPane.showMessageDialog(null,"Order Your Food Here !");
              Order();               
          });
        
       
        
         BorderPane border =new BorderPane();
         border.setTop(pane);
         border.setCenter(pane1);
         border.setBottom(pane3);
         
         pane.setAlignment(Pos.TOP_CENTER);
         pane1.setAlignment(Pos.CENTER);
         pane3.setAlignment(Pos.BOTTOM_CENTER);
         pane3.setPadding(new Insets(20,50,20,50));
  
        
        Scene scene = new Scene(border, 750, 650);
        
        MenuStage.getIcons().add(i1);
        MenuStage.setTitle("Welcome to H.C.W.C Sushi Shop !");
        MenuStage.setScene(scene);
        MenuStage.show();
    }


        
    }
    public void Order(){
        Stage OrderStage= new Stage();
        
        GridPane Order1 = new GridPane();    
        Label limit = new Label("\t  maximum order of dessert and main dishes is 5 ! ( No limit for sushi and drinks )");
        Order1.add(limit,0,0);
        limit.setFont(new Font("MV Boli", 15));
        
        GridPane Order = new GridPane();
        Order.setStyle("-fx-background-color:orange");
        Label lblMenu = new Label("Menu");
        lblMenu.setFont(new Font("Impact", 20));
        
        Order.setHgap(10);
        Order.setVgap(10);
        Order.add(lblMenu,2,0);
        
        Order.add(new Label("Name"),1,1);
        Order.add(new Label("Quantity"),2,1);
        Order.add(new Label("Price"),4,1);
         
        Order.add(btnComfirm,10,12);
        Order.add(btnremove,10,11);
        Order.add(btnex,10,13);
        
        
        Order.add(SS1,0,2);
        Order.add(DD1,0,5);
        Order.add(dd1,0,8);
        Order.add(MM1,0,11);
                
        Order.add(FoodName1,1,2);
        Order.add(addQuantity1,2,2);
        Order.add(addPrice1,4,2);
        Order.add(btnAdd1,6,2);
        Order.add(btnMinus1,8,2);
        
        Order.add(FoodName2,1,3);
        Order.add(addQuantity2,2,3);
        Order.add(addPrice2,4,3);
        Order.add(btnAdd2,6,3);
        Order.add(btnMinus2,8,3);
        
        Order.add(FoodName3,1,4);
        Order.add(addQuantity3,2,4);
        Order.add(addPrice3,4,4);
        Order.add(btnAdd3,6,4);
        Order.add(btnMinus3,8,4);
        
        Order.add(FoodNameD1,1,5);
        Order.add(addQuantity4,2,5);
        Order.add(addPrice4,4,5);
        Order.add(btnAdd4,6,5);
        Order.add(btnMinus4,8,5);
        
        Order.add(FoodNameD2,1,6);
        Order.add(addQuantity5,2,6);
        Order.add(addPrice5,4,6);
        Order.add(btnAdd5,6,6);
        Order.add(btnMinus5,8,6);
        
        Order.add(FoodNameD3,1,7);
        Order.add(addQuantity6,2,7);
        Order.add(addPrice6,4,7);
        Order.add(btnAdd6,6,7);
        Order.add(btnMinus6,8,7);
        
        Order.add(FoodNamed1,1,8);
        Order.add(addQuantity7,2,8);
        Order.add(addPrice7,4,8);
        Order.add(btnAdd7,6,8);
        Order.add(btnMinus7,8,8);
        
        Order.add(FoodNamed2,1,9);
        Order.add(addQuantity8,2,9);
        Order.add(addPrice8,4,9);
        Order.add(btnAdd8,6,9);
        Order.add(btnMinus8,8,9);
        
        Order.add(FoodNamed3,1,10);
        Order.add(addQuantity9,2,10);
        Order.add(addPrice9,4,10);
        Order.add(btnAdd9,6,10);
        Order.add(btnMinus9,8,10);
        
        Order.add(FoodNameM1,1,11);
        Order.add(addQuantity10,2,11);
        Order.add(addPrice10,4,11);
        Order.add(btnAdd10,6,11);
        Order.add(btnMinus10,8,11);
        
        Order.add(FoodNameM2,1,12);
        Order.add(addQuantity11,2,12);
        Order.add(addPrice11,4,12);
        Order.add(btnAdd11,6,12);
        Order.add(btnMinus11,8,12);
        
        Order.add(FoodNameM3,1,13);
        Order.add(addQuantity12,2,13);
        Order.add(addPrice12,4,13);
        Order.add(btnAdd12,6,13);
        Order.add(btnMinus12,8,13);
        
        
        
        FoodName1.setFont(new Font("Impact", 15));
        FoodName2.setFont(new Font("Impact", 15));
        FoodName3.setFont(new Font("Impact", 15));
        FoodNameD1.setFont(new Font("Impact", 15));
        FoodNameD2.setFont(new Font("Impact", 15));
        FoodNameD3.setFont(new Font("Impact", 15));
        FoodNamed1.setFont(new Font("Impact", 15));
        FoodNamed2.setFont(new Font("Impact", 15));
        FoodNamed3.setFont(new Font("Impact", 15));
        FoodNameM1.setFont(new Font("Impact", 15));
        FoodNameM2.setFont(new Font("Impact", 15));
        FoodNameM3.setFont(new Font("Impact", 15));
        
        FoodName1.setTextFill(Color.CHOCOLATE);
        FoodName2.setTextFill(Color.CHOCOLATE);
        FoodName3.setTextFill(Color.CHOCOLATE);
        FoodNameD1.setTextFill(Color.PURPLE);
        FoodNameD2.setTextFill(Color.PURPLE);
        FoodNameD3.setTextFill(Color.PURPLE);
        FoodNamed1.setTextFill(Color.AZURE);
        FoodNamed2.setTextFill(Color.AZURE);
        FoodNamed3.setTextFill(Color.AZURE);
        FoodNameM1.setTextFill(Color.DIMGRAY);
        FoodNameM2.setTextFill(Color.DIMGRAY);
        FoodNameM3.setTextFill(Color.DIMGRAY);
    
        SS1.setFont(new Font("Impact", 15));
        DD1.setFont(new Font("Impactr", 15));
        dd1.setFont(new Font("Impact", 15));
        MM1.setFont(new Font("Impact", 15));
        SS1.setTextFill(Color.CHOCOLATE);
        DD1.setTextFill(Color.PURPLE);
        dd1.setTextFill(Color.AZURE);
        MM1.setTextFill(Color.DIMGRAY);
        
       
        btnAdd1.setOnAction(e->{
            Quantity1++;
            addQuantity1.setText("| "+Quantity1); 
        });
        btnAdd2.setOnAction(e->{
            Quantity2++;
            addQuantity2.setText("| "+Quantity2); 
        });
        btnAdd3.setOnAction(e->{
            Quantity3++;
            addQuantity3.setText("| "+Quantity3); 
        });
        btnAdd4.setOnAction(e->{
            if (Quantity4 == 5){
                
            }else{
            Quantity4++;
            addQuantity4.setText("| "+Quantity4); 
            }
        });
        btnAdd5.setOnAction(e->{
            if (Quantity5 == 5){
                
            }else{
            Quantity5++;
            addQuantity5.setText("| "+Quantity5); 
            }
        });
        btnAdd6.setOnAction(e->{
            if (Quantity6 == 5){
                
            }else{
            Quantity6++;
            addQuantity6.setText("| "+Quantity6); 
            }
        });
        btnAdd7.setOnAction(e->{
            Quantity7++;
            addQuantity7.setText("| "+Quantity7); 
        });
        btnAdd8.setOnAction(e->{
            Quantity8++;
            addQuantity8.setText("| "+Quantity8); 
        });
        btnAdd9.setOnAction(e->{
            Quantity9++;
            addQuantity9.setText("| "+Quantity9); 
        });
        btnAdd10.setOnAction(e->{
            if (Quantity10 == 5){
                
            }else{
            Quantity10++;
            addQuantity10.setText("| "+Quantity10); 
            }
        });
        btnAdd11.setOnAction(e->{
            if (Quantity11 == 5){
                
            }else{
            Quantity11++;
            addQuantity11.setText("| "+Quantity11); 
            }
        });
        btnAdd12.setOnAction(e->{
            if (Quantity12 == 5){
                
            }else{
            Quantity12++;
            addQuantity12.setText("| "+Quantity12); 
            }
        });
        //Mius
        btnMinus1.setOnAction(e->{
            if (Quantity1 == 0){
                
            }else{
            Quantity1--;
            addQuantity1.setText("| "+Quantity1); 
            }
        });
        btnMinus2.setOnAction(e->{
            if (Quantity2 == 0){
                
            }else{
            Quantity2--;
            addQuantity2.setText("| "+Quantity2); 
            }
        });
        btnMinus3.setOnAction(e->
            {if (Quantity3 == 0){
                
            }else{
            Quantity3--;
            addQuantity3.setText("| "+Quantity3); 
        }
        });
        btnMinus4.setOnAction(e->{
            if (Quantity4 == 0){
                
            }else{
            Quantity4--;
            addQuantity4.setText("| "+Quantity4); 
            }
        });
        btnMinus5.setOnAction(e->{
            if (Quantity5 == 0){
                
            }else{
            Quantity5--;
            addQuantity5.setText("| "+Quantity5); 
            }
        });
        btnMinus6.setOnAction(e->{
            if (Quantity6 == 0){
                
            }else{
            Quantity6--;
            addQuantity6.setText("| "+Quantity6); 
            }
        });
        btnMinus7.setOnAction(e->{
            if (Quantity7 == 0){
                
            }else{
            Quantity7--;
            addQuantity7.setText("| "+Quantity7); 
            }
        });
        btnMinus8.setOnAction(e->{
            if (Quantity8 == 0){
                
            }else{
            Quantity8--;
            addQuantity8.setText("| "+Quantity8); 
            }
        });
        btnMinus9.setOnAction(e->{
            if (Quantity9 == 0){
                
            }else{
            Quantity9--;
            addQuantity9.setText("| "+Quantity9); 
            }
        });
        btnMinus10.setOnAction(e->{
            if (Quantity10 == 0){
                
            }else{
            Quantity10--;
            addQuantity10.setText("| "+Quantity10); 
            }
        });
        btnMinus11.setOnAction(e->{
            if (Quantity11 == 0){
                
            }else{
            Quantity11--;
            addQuantity11.setText("| "+Quantity11); 
            }
        });
        btnMinus12.setOnAction(e->{
            if (Quantity12 == 0){
                
            }else{
            Quantity12--;
            addQuantity12.setText("| "+Quantity12); 
            }
        });
        //
         btnComfirm.setOnAction(e->{
            receipt();
        });
         
         btnex.setOnAction(e->{
              JOptionPane.showMessageDialog(null,"Thank You ! Come Again !");
                            System.exit(0);
        });
         ///remove order
         btnremove.setOnAction(e->{
           Quantity1 = 0;
           addQuantity1.setText(""+Quantity1);
           Quantity2 = 0;
           addQuantity2.setText(""+Quantity2);
           Quantity3 = 0;
           addQuantity3.setText(""+Quantity3);
           Quantity4 = 0;
           addQuantity4.setText(""+Quantity4);
           Quantity5 = 0;
           addQuantity5.setText(""+Quantity5);
           Quantity6 = 0;
           addQuantity6.setText(""+Quantity6);
           Quantity7 = 0;
           addQuantity7.setText(""+Quantity7);
           Quantity8 = 0;
           addQuantity8.setText(""+Quantity8);
           Quantity9 = 0;
           addQuantity9.setText(""+Quantity9);
           Quantity10 = 0;
           addQuantity10.setText(""+Quantity10);
           Quantity11 = 0;
           addQuantity11.setText(""+Quantity11);
           Quantity12 = 0;
           addQuantity12.setText(""+Quantity12);
         });
         
         BorderPane bor1 = new BorderPane();
         bor1.setTop(Order1);
         bor1.setCenter(Order);
         
         Order.setAlignment(Pos.CENTER);
        Scene scene = new Scene(bor1, 750, 650);
        
        OrderStage.getIcons().add(i1);
        OrderStage.setTitle("Welcome to H.C.W.C Sushi Shop !");
        OrderStage.setScene(scene);
        OrderStage.show();
        
    }
   public void receipt(){

       String toString = ""; 
       double TotalAllPrice = 0;
       double TotalPrice = 0;
       double servicecharge = 0;
       double GST =0;
       TotalPrice1 = Quantity1 * Price1;
       TotalPrice2 = Quantity2 * Price2;
       TotalPrice3 = Quantity3 * Price3;
       TotalPrice4 = Quantity4 * PriceD1;
       TotalPrice5 = Quantity5 * PriceD2;
       TotalPrice6 = Quantity6 * PriceD3;
       TotalPrice7 = Quantity7 * Priced1;
       TotalPrice8 = Quantity8 * Priced2;
       TotalPrice9 = Quantity9 * Priced3;
       TotalPrice10 = Quantity10 * PriceM1;
       TotalPrice11 = Quantity11 * PriceM2;
       TotalPrice12 = Quantity12 * PriceM3;
           
           if(Quantity1>0){
               toString += "\nTamago Egg\t\t\t\t"+Quantity1+"\t\t\t"+TotalPrice1;
           }if(Quantity2>0){
                toString += "\nInari beancurd\t\t\t\t"+Quantity2+"\t\t\t"+TotalPrice2;
           }if(Quantity3>0){
               toString += "\nKimchiHotate/Scallop\t\t"+Quantity3+"\t\t\t"+TotalPrice3;
           }if(Quantity4>0){
               toString += "\nBanana Boat\t\t\t\t"+Quantity4+"\t\t\t"+TotalPrice4;
           }if(Quantity5>0){
               toString += "\nMacha IceCream\t\t\t"+Quantity5+"\t\t\t"+TotalPrice5;
           }if(Quantity6>0){
               toString += "\nAgedashi Toufu\t\t\t"+Quantity6+"\t\t\t"+TotalPrice6;
           }if(Quantity7>0){
               toString += "\nGreed tea\t\t\t\t\t"+Quantity7+"\t\t\t"+TotalPrice7;
           }if(Quantity8>0){
               toString += "\nDrinkable Yoqurt\t\t\t"+Quantity8+"\t\t\t"+TotalPrice8;
           }if(Quantity9>0){
               toString += "\nNihooSake\t\t\t\t"+Quantity9+"\t\t\t"+TotalPrice9;
           }if(Quantity10>0){
               toString += "\nChicken Chashu Ramen\t\t"+Quantity10+"\t\t\t"+TotalPrice10;
           }if(Quantity11>0){
               toString += "\nSalon&Tuna Combo\t\t"+Quantity11+"\t\t\t"+TotalPrice11;
           }if(Quantity12>0){
               toString += "\nBeef Don\t\t\t\t\t"+Quantity12+"\t\t\t"+TotalPrice12;
           }
           
           //total price
           TotalPrice=TotalPrice1+TotalPrice2+TotalPrice3+TotalPrice4+
                   TotalPrice5+TotalPrice6+TotalPrice7+TotalPrice8+TotalPrice9+
                   TotalPrice10+TotalPrice11+TotalPrice12;
           servicecharge= TotalPrice * 10/100;
           GST = TotalPrice * 6/100;
           TotalAllPrice =TotalPrice + servicecharge + GST;
           
          
           if(TotalPrice == 0){
               JOptionPane.showMessageDialog(null,"Please order something fool !");
                            Order();
           }else{
           
           //  print receipt 
        GridPane Receipt = new GridPane();
        RStage.setTitle("Receipt");
        RStage.setHeaderText("Receipt");
        RStage.setHeaderText("Receipt");
        RStage.setContentText(CustomerName+" , Your bill is here\n"
                + "\nFoodName\t\t\tQuantity\t\t\tPrice"
                +"\n-------------------------------------------------------\n"
                +toString
                +"\n-------------------------------------------------------"
                +"\nTotal:\t\t\t\t\t\t\t\t"+TotalPrice      
                +"\n-------------------------------------------------------\n"
                +"GST:\t\t\t\t\t\t\t\t\t6%\n"
                +"Service Charge:\t\t\t\t\t\t10%"        
                +"\nTotalPrice(RM):\t\t\t\t\t\t"+TotalAllPrice
                +"\n-------------------------------------------------------\n"
                );
        
        Optional<ButtonType> result = RStage.showAndWait();
        rate();
        
           }
   }
    

    public void rate(){
        
        Stage RateStage = new Stage();
        GridPane rate = new GridPane();
        
        rate.setHgap(30);
        rate.setVgap(30);
        
        rate.setStyle("-fx-background-color:white");     
        
        Label feedback = new Label("FeedBack");
        rate.add(feedback,5,0);
        feedback.setFont(Font.font("Ink Free", FontWeight.BOLD, 20));      
        
        Label aworst = new Label("  Worst");
        Label apoor = new Label("   Poor");
        Label aaverage = new Label("Average");
        Label agood = new Label("  Good");
        Label aexe = new Label("Excellent");
        
        rate.add(aworst,1,2);
        rate.add(apoor,3,2); 
        rate.add(aaverage,5,2); 
        rate.add(agood,7,2); 
        rate.add(aexe,9,2); 
        
        
        aworst.setFont(Font.font("Ink Free", FontWeight.BOLD, 20));
        apoor.setFont(Font.font("Ink Free", FontWeight.BOLD, 20));
        aaverage.setFont(Font.font("Ink Free", FontWeight.BOLD, 20));
        agood.setFont(Font.font("Ink Free", FontWeight.BOLD, 20));
        aexe.setFont(Font.font("Ink Free", FontWeight.BOLD, 20));
        
        Image worstr=new Image("worst.png");
        ImageView worstrview=new ImageView(worstr);
        worstrview.setFitHeight(80);
        worstrview.setFitWidth(80);
        
        rate.add(worstrview,1,1);
        
        Image poorr=new Image("poor.png");
        ImageView poorrview=new ImageView(poorr);
        poorrview.setFitHeight(80);
        poorrview.setFitWidth(80);
        
        rate.add(poorrview,3,1);
        
        Image averager=new Image("average.png");
        ImageView averagerview=new ImageView(averager);
        averagerview.setFitHeight(80);
        averagerview.setFitWidth(80);
        
        rate.add(averagerview,5,1);
        
        Image goodr=new Image("good.png");
        ImageView goodrview=new ImageView(goodr);
        goodrview.setFitHeight(80);
        goodrview.setFitWidth(80);
        
        rate.add(goodrview,7,1);
        
        Image exer=new Image("excellent.png");
        ImageView exerview=new ImageView(exer);
        exerview.setFitHeight(80);
        exerview.setFitWidth(80);
        
        rate.add(exerview,9,1);
        
        
        worst = new CheckBox("");
        poor = new CheckBox("");
        average = new CheckBox("");
        good = new CheckBox("");
        excellent = new CheckBox("");
        
        worst.setOnAction(e->{
           //     rate.add(aworst,1,2); 
                worst();              
          });
        
        poor.setOnAction(e->{
         
                 poor();
          });
        
        average.setOnAction(e->{
           // rate.add(aaverage,5,2); 
                  average();               
          });
        
        good.setOnAction(e->{
            //rate.add(agood,7,2); 
                  good();
          });
        
        excellent.setOnAction(e->{
           // rate.add(aexe,9,2); 
                   excellent();              
          });
        
        rate.add(worst,1,2);
        rate.add(poor,3,2);
        rate.add(average,5,2);
        rate.add(good,7,2);
        rate.add(excellent,9,2);
        
        feedback.setPadding(new Insets(30,0,10,0));
        worst.setPadding(new Insets(0,0,30,28));
        poor.setPadding(new Insets(0,0,30,28));
        average.setPadding(new Insets(0,02,30,28));
        good.setPadding(new Insets(0,0,30,28));
        excellent.setPadding(new Insets(0,0,30,28));
        
        aworst.setPadding(new Insets(0,0,40,0));
        apoor.setPadding(new Insets(0,0,40,0));
        aaverage.setPadding(new Insets(0,0,40,0));
        agood.setPadding(new Insets(0,0,40,0));
        aexe.setPadding(new Insets(0,0,40,0));
        
        GridPane rate1 = new GridPane();
        
        rate1.setHgap(10);
        rate1.setVgap(10);
        
        rate1.setStyle("-fx-background-color:white");     
        
        Label comment= new Label("Leave Your Comment Here...");
        rate1.add(comment,1,1);
        comment.setFont(Font.font("Ink Free", FontWeight.BOLD, 20));
        
        TextArea tf = new TextArea();
        tf.setPrefHeight(140);
        tf.setPrefWidth(680);
        tf.setPadding(new Insets(0,0,0,0));
        rate1.add(tf,1,2);
        
        Button comfirm1 = new Button("Comfirm");
        rate1.add(comfirm1,1,3);
        comfirm1.setFont(Font.font("Ink Free", FontWeight.BOLD, 18));
        
        comfirm1.setOnAction(e->{
              if(worst.isSelected()){
                  JOptionPane.showMessageDialog(null,"You have choose worst D: ! \nThank You and Come Again !");
                            System.exit(0);
                  
              }
              if(poor.isSelected()){
                  JOptionPane.showMessageDialog(null,"You have choose poor :( ! \nThank You and Come Again !");
                            System.exit(0);
                  
              }
              if(average.isSelected()){
                  JOptionPane.showMessageDialog(null,"You have choose average : | ! \nThank You and Come Again !");
                            System.exit(0);
                  
              }
              if(good.isSelected()){
                  JOptionPane.showMessageDialog(null,"You have choose good :) ! \nThank You and Come Again !");
                            System.exit(0);
                  
              }
              if(excellent.isSelected()){
                  JOptionPane.showMessageDialog(null,"You have choose excellent :D ! \nThank You and Come Again !");
                            System.exit(0);
                  
              }
          });
        
        BorderPane bor = new BorderPane();
        bor.setTop(rate);
        bor.setCenter(rate1);
        
        
        
       
        Scene scene = new Scene(bor, 700, 550);
        
        RateStage.getIcons().add(i1);
        RateStage.setTitle("Rate Before You Leave!");
        RateStage.setScene(scene);
        RateStage.show();
        

    }
    
    
    
    private void worst(){
        
        
        poor.setSelected(false);
        average.setSelected(false);
        good.setSelected(false);
        excellent.setSelected(false);  
        
    }
    
    private void poor(){
        
        worst.setSelected(false);
        average.setSelected(false);
        good.setSelected(false);
        excellent.setSelected(false);  
        
    }
    
    private void average(){
        
        worst.setSelected(false);
        poor.setSelected(false);
        good.setSelected(false);
        excellent.setSelected(false);  
        
    }
    
    private void good(){
        
        worst.setSelected(false);
        average.setSelected(false);
        poor.setSelected(false);
        excellent.setSelected(false);  
        
    }
    
    private void excellent(){
        
        worst.setSelected(false);
        average.setSelected(false);
        good.setSelected(false);
        poor.setSelected(false);  
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
}
