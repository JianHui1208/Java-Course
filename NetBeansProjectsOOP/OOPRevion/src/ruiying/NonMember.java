package ruiying;

public class NonMember extends Customer {

    public static final int MAX_CREDIT = 500;

    @Override
    public boolean addRentalDetail(RentDetail RentDetail) {

        if (RentDetail.calculateTotalPrice() <= MAX_CREDIT) {

            this.getRentDetail().add(RentDetail);

            return true;

        }

        return false;

    }

}
