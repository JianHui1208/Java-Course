package RentSystem;

public class RentDetail{
    private String id;
    private Customer rentBy;
    private String address;
    private double price;
    private int rentDay;
    private static int i = 0;
    
    public RentDetail(int rentDay, Customer customer, String addr, double price){
        this.rentBy = customer;
        this.address = addr;
        this.rentDay = rentDay;
        this.price = price;
        getId();
    }
    
    public String getId(){
        i++;
        String StrI = String.valueOf(i);
        String StrId = String.format("%4s", StrI).replace(" ", "0");
        this.id = "R" + StrId;
        return id;
    }
    
    public Customer getCustomer(){
        return rentBy;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double calculateTotalPrice(){
        double totalPrice = 0;
        totalPrice = this.price * this.rentDay;
        return totalPrice;
    }
    
    @Override
    public String toString(){
        String MSG = "";
        MSG = "Rent by: " + this.rentBy.getName() + 
                "(" + this.rentBy.getId() + ")" +
                "\nRent ID: " + this.id + 
                "\nRent Address: " + this.address + 
                "\nTotal Days of staying: " + this.rentDay + 
                "\nPrice per day: RM" + getPrice() + 
                "\nPayment: RM" + calculateTotalPrice();
        return MSG;
    }
}
