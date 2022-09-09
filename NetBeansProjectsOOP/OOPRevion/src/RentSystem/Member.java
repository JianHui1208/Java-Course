package RentSystem;

public class Member extends Customer {
    public static final int MAX_CREADIT = 1000;
    
    @Override
    public boolean addRentalDetail(RentDetail R1){
        if(R1.calculateTotalPrice() <= MAX_CREADIT){
            this.isMember().add(R1);
            return true;
        }
        return false;
    }
}
