/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author user
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.Optional;
import javafx.application.Platform;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

public class Home extends Application{
    private Button btnMember = new Button("Member");
    private Button btnNewMember = new Button("New member");
    private Label lblWelcome = new Label("Welcome to Black Market Restaurent");
    private Label lblClick = new Label("Click the button below");
    Image icon = new Image("images/restaurant_icon.png");
    protected String tempID="";
    protected int tempPoint=0;
    //---------------------------------------------------------------------------------------------------------
    Button btnNew = new Button("Register");
    Button btnClear = new Button("Clear");
    TextField tfName = new TextField();
    TextField tfPn = new TextField();
    TextField tfId = new TextField();
    Alert alert = new Alert(Alert.AlertType.ERROR);
    CustomerAccount c;
    ManageCustomer MC = new ManageCustomer();
    //-----------------------------------------------------------------------------------------------------------
    
    Button btnLogin = new Button("Login");
    Button btnBack = new Button("Back");
    
    //-------------------------------------------------------------------------------------------------------------
    protected static int Quantity1 = 0;
    protected static int Quantity2 = 0;
    protected static int Quantity3 = 0;
    protected static int Quantity4 = 0;
    private double Price1 = 12.00;
    private double Price2 = 14.00;
    private double Price3 = 15.00;
    private double Price4 = 11.00;
    private double TotalPrice1 = 0;
    private double TotalPrice2 = 0;
    private double TotalPrice3 = 0;
    private double TotalPrice4 = 0;
    private double AllPrice = 0;
    private Label lblFoodName1 = new Label("Burger");
    private Label lblFoodName2 = new Label("Pizza");
    private Label lblFoodName3 = new Label("Spegerti");
    private Label lblFoodName4 = new Label("Chicken chop");
    private Label lblQuantity1 = new Label(""+ Quantity1);
    private Label lblQuantity2 = new Label(""+ Quantity2);
    private Label lblQuantity3 = new Label(""+ Quantity3);
    private Label lblQuantity4 = new Label(""+ Quantity4);
    private Label lblPrice1 = new Label(""+ Price1);
    private Label lblPrice2 = new Label(""+ Price2);
    private Label lblPrice3 = new Label(""+ Price3);
    private Label lblPrice4 = new Label(""+ Price4);
    private Button btnAdd1 = new Button("+");
    private Button btnAdd2 = new Button("+");
    private Button btnAdd3 = new Button("+");
    private Button btnAdd4 = new Button("+");
    private Button btnMinus1 = new Button("-");
    private Button btnMinus2 = new Button("-");
    private Button btnMinus3 = new Button("-");
    private Button btnMinus4 = new Button("-");
    private Button btnComfirm = new Button("Comfirm");
    Alert AlertReceipt = new Alert(AlertType.INFORMATION);
    Alert AlertReceipt2 = new Alert(AlertType.INFORMATION);
    //-----------------------------------------------------------------------------------------------------------------------
    @Override
    public void start(Stage primaryStage){
        
        BorderPane p = new BorderPane();
        HBox hbox = new HBox();
        hbox.getChildren().addAll(btnMember,btnNewMember);
        hbox.setSpacing(10);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(new ImageView(icon),lblWelcome,lblClick);
        vbox.setSpacing(10);
        p.setTop(vbox);
        p.setCenter(hbox);
        
        lblWelcome.setFont(new Font("Impact", 20));
        
        vbox.setAlignment(Pos.CENTER);
        hbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(p,400,250);
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Home");
        primaryStage.setScene(scene);
        primaryStage.show();
        looping();
        btnMember.setOnAction(e -> {
            MemberLoginStage();
        });
        btnNewMember.setOnAction(e ->{
            NewMemberStage();
        });
    }
        public void looping(){
	  		// Create a Runnable
		Runnable task = new Runnable()
		{
                        @Override
			public void run()
			{while(true){
	      			try{
	      			// Update the Label on the JavaFx Application Thread
				Platform.runLater(new Runnable()
				{
		            @Override
		            public void run()
		            {
		            	if(lblWelcome.getText()==null){
	      			lblWelcome.setText("Welcome to Black Market Restaurant");
                                }else
                                {lblWelcome.setText(null);
                                }
		            }
		        });
	      				Thread.sleep(200);
	    				}catch(InterruptedException ae){
    					}
                                    }   //end while   
			}
		};
		
		// Run the task in a background thread
		Thread t = new Thread(task);
		// Terminate the running thread if the application exits
		t.setDaemon(true);
		// Start the thread
		t.start();
    }
    //---------------------------------------------------------------------------------------
    public void NewMemberStage(){
    Stage NewMemberStage = new Stage();
    
    tfPn.setOnKeyPressed(e->{
            if(!(e.getCode().isDigitKey())){
                PnError();
            tfPn.setText("");
            }
        });
    
        HBox hbox = new HBox();
        hbox.getChildren().addAll(btnClear,btnNew,btnBack);
        GridPane p = new GridPane();
        p.add(new Label("Name"), 0, 0);
        p.add(tfName, 1, 0);
        p.add(new Label("Phone Number:"), 0, 1);
        p.add(tfPn, 1, 1);
        p.add(new Label("ID:"), 0, 2);
        p.add(tfId, 1, 2);
        p.add(hbox, 1, 3,2,1);
        
        btnNew.setOnAction(e -> Save());
        btnClear.setOnAction(e -> Clear());
        btnBack.setOnAction(e -> {
        NewMemberStage.close();
    });
        p.setAlignment(Pos.CENTER);
        Scene NewMemberscene = new Scene(p,400,400);
        NewMemberStage.setTitle("Register New Account");
        NewMemberStage.setScene(NewMemberscene);
        NewMemberStage.getIcons().add(icon);
        NewMemberStage.show();
    }
    private void Clear(){
        tfName.setText("");
        tfPn.setText("");
        tfId.setText("");
    }
    private void Save(){
        String name = tfName.getText();
        int pn = Integer.parseInt(tfPn.getText());
        String id =  tfId.getText();
        int point = 0;
        c = new CustomerAccount(name,pn,id,point);
        MC.add(c);
        MC.SaveCustomer();
        
        tempID = c.getId();
        MenuStage();
        
    }
    private void PnError(){
        alert.setTitle("Invalid Phone Number");
        alert.setHeaderText(null);
        alert.setContentText("Please enter numeric value!");
        alert.showAndWait();
    }
    //---------------------------------------------------------------------------------------
    public void MemberLoginStage(){
        Stage MemberLoginStage = new Stage();
        
        MC.ViewMember();
    
    HBox hbox1 = new HBox();
    HBox hbox2 = new HBox();
    hbox1.getChildren().addAll(new Label("ID:"),tfId);
    hbox2.getChildren().addAll(btnLogin,btnBack);
    GridPane p = new GridPane();
    
    p.add(new Label("Enter your ID below"), 0,0);
    p.add(hbox1, 0, 2);
    
    p.add(hbox2, 0, 3,2,1);
    
    hbox1.setSpacing(10);
    hbox2.setSpacing(10);
    hbox2.setPadding(new Insets(10,10,20,30));
    btnLogin.setOnAction(e->{
        Check();
    });
    btnBack.setOnAction(e -> {
        MemberLoginStage.close();
    });
    
    p.setAlignment(Pos.CENTER);
    
    Scene MemberLoginscene = new Scene(p,300,100);
    MemberLoginStage.setScene(MemberLoginscene);
    MemberLoginStage.setTitle("Login Page");
    MemberLoginStage.getIcons().add(icon);
    MemberLoginStage.show();
    }
    public void Check(){
        String ID = tfId.getText();
        
        if(MC.SearchID(ID)==true){
            tempID=tfId.getText();
            MenuStage();
            
        }else{
            
        }

    }
    //-------------------------------------------------------------------------------------------------------------------
    public void MenuStage(){
        Stage MenuStage = new Stage();
        
        GridPane p = new GridPane();
        Label lblMenu = new Label("Menu");
        lblMenu.setFont(new Font("Impact", 20));
        
        p.setHgap(10);
        p.setVgap(10);
        p.add(lblMenu,3,0);
        
        p.add(new Label("Name"),0,1);
        p.add(new Label("Quantity"),2,1);
        p.add(new Label("Price"),4,1);
        
        p.add(lblFoodName1,0,2);
        p.add(lblQuantity1,2,2);
        p.add(lblPrice1,4,2);
        p.add(btnAdd1,6,2);
        p.add(btnMinus1,8,2);
        
        p.add(lblFoodName2,0,4);
        p.add(lblQuantity2,2,4);
        p.add(lblPrice2,4,4);
        p.add(btnAdd2,6,4);
        p.add(btnMinus2,8,4);
        
        p.add(lblFoodName3,0,6);
        p.add(lblQuantity3,2,6);
        p.add(lblPrice3,4,6);
        p.add(btnAdd3,6,6);
        p.add(btnMinus3,8,6);
        
        p.add(lblFoodName4,0,8);
        p.add(lblQuantity4,2,8);
        p.add(lblPrice4,4,8);
        p.add(btnAdd4,6,8);
        p.add(btnMinus4,8,8);
        
        p.add(btnComfirm,10,10);
        
        btnAdd1.setOnAction(e -> IncreaseFood1());
        btnAdd2.setOnAction(e -> IncreaseFood2());
        btnAdd3.setOnAction(e -> IncreaseFood3());
        btnAdd4.setOnAction(e -> IncreaseFood4());
        btnMinus1.setOnAction(e -> DecreaseFood1());
        btnMinus2.setOnAction(e -> DecreaseFood2());
        btnMinus3.setOnAction(e -> DecreaseFood3());
        btnMinus4.setOnAction(e -> DecreaseFood4());
        btnComfirm.setOnAction(e -> ConfirmFood());
        
        p.setAlignment(Pos.CENTER);
        Scene MenuScene = new Scene(p,600,450);
        MenuStage.setScene(MenuScene);
        MenuStage.setTitle("Menu");
        MenuStage.getIcons().add(icon);
        MenuStage.show();
    }
    public void IncreaseFood1(){
        Quantity1++;
        lblQuantity1.setText(""+Quantity1);
        
    }
    public void IncreaseFood2(){
        Quantity2++;
        lblQuantity2.setText(""+Quantity2);
        
    }
    public void IncreaseFood3(){
        Quantity3++;
        lblQuantity3.setText(""+Quantity3);
        
    }
    public void IncreaseFood4(){
        Quantity4++;
        lblQuantity4.setText(""+Quantity4);
        
    }
    public void DecreaseFood1(){
        Quantity1--;
        lblQuantity1.setText(""+Quantity1);
    }
    public void DecreaseFood2(){
        Quantity2--;
        lblQuantity2.setText(""+Quantity2);
    }
    public void DecreaseFood3(){
        Quantity3--;
        lblQuantity3.setText(""+Quantity3);
    }
    public void DecreaseFood4(){
        Quantity4--;
        lblQuantity4.setText(""+Quantity4);
    }
    public void ConfirmFood(){
        String toString = "";
        TotalPrice1 = Quantity1 * Price1;
        TotalPrice2 = Quantity2 * Price2;
        TotalPrice3 = Quantity3 * Price3;
        TotalPrice4 = Quantity4 * Price4;
        double FinalTotal=0;
        if(Quantity1>0){
            toString +="\nBurger\t\t\t"+Quantity1+"\t\t"+TotalPrice1;
        }
        if(Quantity2>0){
            toString +="\nPizza\t\t\t"+Quantity2+"\t\t"+TotalPrice2;
        }
        if(Quantity3>0){
            toString +="\nSpegerti\t\t\t"+Quantity3+"\t\t"+TotalPrice3;
        }
        if(Quantity4>0){
            toString +="\nChicken chop\t\t"+Quantity4+"\t\t"+TotalPrice4;
        }
        FinalTotal=TotalPrice1+TotalPrice2+TotalPrice3+TotalPrice4;
                AlertReceipt.setTitle("Receipt");
                AlertReceipt.setHeaderText("Receipt");
                AlertReceipt.setContentText("Name\t\tQuantity\t\tPrice"
                                            +"\n------------------------------------------------"
                                            +toString
                                            +"\n------------------------------------------------"
                                            + "\nTotal Price : \t\t\t\t"+FinalTotal
                                            +"\n(Get discount if you have more than 5 point!!!)");
                
                ButtonType btntypeDiscount = new ButtonType("Get Discount");
                
                AlertReceipt.getButtonTypes().addAll(btntypeDiscount);
                
                Optional<ButtonType> result = AlertReceipt.showAndWait();
                
                if(result.get()== btntypeDiscount){
                   if(MC.getdiscount(tempID)>=5){
                       MC.deletePoint(tempID);
                       MC.SaveCustomer();
                       FinalTotal = FinalTotal *0.5;
                AlertReceipt2.setTitle("Receipt");
                AlertReceipt2.setHeaderText("Receipt");
                AlertReceipt2.setContentText("Name\t\tQuantity\t\tPrice"
                                            +"\n------------------------------------------------"
                                            +toString
                                            +"\n------------------------------------------------"
                                            + "\nTotal Price : \t\t\t\t"+FinalTotal);
                AlertReceipt2.showAndWait();
                   }else{
                       AlertReceipt2.setTitle("Receipt");
                AlertReceipt2.setHeaderText("Receipt");
                AlertReceipt2.setContentText("Name\t\tQuantity\t\tPrice"
                                            +"\n------------------------------------------------"
                                            +toString
                                            +"\n------------------------------------------------"
                                            + "\nTotal Price : \t\t\t\t"+FinalTotal
                                            +"\nSorry You didnt have more than 5 points");
                AlertReceipt2.showAndWait();
                       
                   }
                }else{
                   tempPoint = (int)(FinalTotal/10);
                   
                   MC.update(tempPoint, tempID);
                   MC.SaveCustomer();
                   
                }
                System.exit(0);
        
    }

    //--------------------------------------------------------------------------------------------------------------------------------
    public static void main(String []args){
        Application.launch(args);
    }
}
