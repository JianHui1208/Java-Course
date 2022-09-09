package RentSystem;

public class NonMember extends Customer{
    public static final int MAX_CREADIT = 500;
    
    @Override
    public boolean addRentalDetail(RentDetail R1){
        if(R1.calculateTotalPrice() <= MAX_CREADIT){
            this.isMember().add(R1);
            return false;
        }
        return true;
    }
}
