package Project2;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xiiao
 */
public class ManageCustomer {
    private ArrayList<CustomerAccount>mC;
    String fileName = "CustomerData.ser";
    Alert AlertInfo = new Alert(AlertType.INFORMATION);
    
    public ManageCustomer(){
        mC = new ArrayList<CustomerAccount>();    
    }
    public void add(CustomerAccount newCustomer) {             
        	boolean found = false;
    	for(int i =0; i<mC.size() && found == false; i++){
    		CustomerAccount c = mC.get(i);
    		if(c.getName().equalsIgnoreCase(newCustomer.getName())){
    				found=true;
    		}//end if
    	}//end for
    	if(found ==true){
                JOptionPane.showMessageDialog(null,"Account of  "+newCustomer.getName()+" exists ");
    		System.out.println("Member " + newCustomer.getName() +  " exists.");
    	}else{    		
    		mC.add(newCustomer);
                JOptionPane.showMessageDialog(null,newCustomer.getName()+" , You are now a member of our restaurant ");
    		System.out.println("Added " + newCustomer.getName());
    	}        
    }
    public boolean SearchID(String id ){
    boolean found = false;
    boolean checkID = false;
    for(int i=0;i<mC.size() && found == false; i++){
        CustomerAccount c = mC.get(i);
        if(c.getId().equalsIgnoreCase(id)){
            found=true;
            checkID=true;
        }
        if(found ==true){
                JOptionPane.showMessageDialog(null,"ID "+id+" founds ");
                AlertInfo.setTitle("Customer Info");
                AlertInfo.setHeaderText("Customer Information");
                AlertInfo.setContentText("Name :"+c.getName() 
                                        +"\nID : "+c.getId()+
                                        "\nPoints : "+c.getPoint());
                
                AlertInfo.showAndWait();
                
                //System.out.println(c.getName());
    		
    	}else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Incorrect ID");
            alert.setHeaderText("Incorrect ID");
            alert.setContentText("Please try to enter your ID again");

            alert.showAndWait();
    		
    	}
    }
    return found;
}
    public void SaveCustomer(){
    FileOutputStream fileRegister;
    try{
        fileRegister = new FileOutputStream(fileName);
        ObjectOutputStream register = new ObjectOutputStream(fileRegister);
        register.writeObject(mC);
        register.close();
        fileRegister.close();
        JOptionPane.showMessageDialog(null, "Account updated!");
        
    }catch(Exception e ){
        e.printStackTrace();
    }
}
    public void ViewMember(){
    try{
        File f = new File(fileName);
        if(f.exists()){
            FileInputStream fileIn = new FileInputStream(f);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            mC = (ArrayList<CustomerAccount>) in.readObject();
            in.close();
            fileIn.close();
        }else{
            System.out.println("1st time use the system");
        }
        
    }catch(Exception e){
        e.printStackTrace();
    }
}
   public void update(int tempPoint,String tempID){
    boolean found =false;
    for(int i = 0;i<mC.size() && found == false;i++){
        CustomerAccount c =mC.get(i);
        if(c.getId().equalsIgnoreCase(tempID)){
            int p = 0;
            p = c.getPoint()+tempPoint;
            System.out.println(p);
           c.setPoint(p);
            found=true;
            
        }
    }if(found==true){
        
    }
}
   public int getdiscount(String tempID){
    boolean found =false;
    int d =0;
    for(int i = 0;i<mC.size() && found == false;i++){
        CustomerAccount c =mC.get(i);
        if(c.getId().equalsIgnoreCase(tempID)){
            d=c.getPoint();
            found=true;
            
        }
}return d;
   }
   public void deletePoint(String tempID){
    boolean found =false;
    int d =0;
    for(int i = 0;i<mC.size() && found == false;i++){
        CustomerAccount c =mC.get(i);
        if(c.getId().equalsIgnoreCase(tempID)){
            c.setPoint(c.getPoint()-5);
            found=true;
            
        }
}
   }
}
