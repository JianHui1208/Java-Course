package projectPresent;

public class Customer {

    private String name, phoneNumber, shippingAddress, email;

    public Customer() {

    }

    public Customer(String name, String phoneNumber, String email, String shippingAddress) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
        this.email = email;

    }

    public String getCustomerName() {

        return this.name;

    }

    public void setCustomerName(String name) {

        this.name = name;

    }

    public String getPhoneNumber() {

        return this.phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

    public String getEmail() {

        return this.email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getShippingAddress() {

        return this.shippingAddress;

    }

    public void setShippingAddress(String shippingAddress) {

        this.shippingAddress = shippingAddress;

    }

    public void searchMember(String memberID) {

        if (this instanceof Member) {
            if (memberID.equals(((Member) this).getMemberID())) {
                
                System.out.println("\nYou are member!");
                
                System.out.println(((Member) this).toString());

            }
        }

    }

    public String toString() {

        return "Name: " + this.name + "\nPhone Number: " + this.phoneNumber
                + "\nEmail: " + this.email + "\nShipping Address: " + this.shippingAddress;

    }

}
