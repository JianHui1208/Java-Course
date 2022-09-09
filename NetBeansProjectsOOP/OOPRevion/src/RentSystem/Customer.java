package RentSystem;

import java.util.ArrayList;

public abstract class Customer {
    private String name;
    private String id;
    private ArrayList<RentDetail> RentList  = new ArrayList<RentDetail>();
    private static int i = 0;
    
    public Customer() {
    }
        
    public Customer(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(){
        i++;
        String StrI = String.valueOf(i);
        id = "D1234" + StrI;
    }
    
    public ArrayList<RentDetail> isMember(){
        return RentList;
    }
    
    public abstract boolean addRentalDetail(RentDetail R1);
}
