package ruiying;

public class Member extends Customer {
    public static final int MAX_CREDIT = 1000;
    @Override
    public boolean addRentalDetail(RentDetail RentDetail) {
        if (RentDetail.calculateTotalPrice() <= MAX_CREDIT) {
            this.getRentDetail().add(RentDetail);
            return true;
        }
        return false;
    }

}
