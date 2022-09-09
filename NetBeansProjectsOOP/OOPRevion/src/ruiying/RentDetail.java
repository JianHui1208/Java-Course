package ruiying;

public class RentDetail {

    private String id;
    private int rentDay;
    private Customer rentBy;
    private String address;
    private double price;
    private static int numOfRentDetail;

    public RentDetail(int rentDay, Customer customer, String addr, double price) {

        this.rentDay = rentDay;
        rentBy = customer;
        address = addr;
        this.price = price;
        numOfRentDetail++;
        id = "R" + String.format("%04d", numOfRentDetail);

    }

    public String getId() {

        return id;

    }

    public int getRentDay() {

        return rentDay;

    }

    public Customer getCustomer() {

        return rentBy;

    }

    public double getPrice() {

        return price;

    }

    public double calculateTotalPrice() {

        return price * rentDay;

    }

    @Override
    public String toString() {

        return "Rent by: " + rentBy.getName() + " (" + rentBy.getId() + ")" + "\nRent ID: " + id + "\nRent Address: " + address
                + "\nTotal days of staying: " + rentDay + " days\nPrice per day: RM " + price
                + "\nPayment: RM " + calculateTotalPrice();
    }

}
