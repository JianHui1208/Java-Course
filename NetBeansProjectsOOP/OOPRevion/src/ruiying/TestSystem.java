package ruiying;

public class TestSystem {

    public static void main(String[] args) {

        Customer c = new Member();
        c.setName("Alan");
        c.setId("D12345");

        RentDetail r = new RentDetail(2, c, "No. 1, Jalan Bunga 1, Taman Bunga.", 100);

        System.out.println(r.toString());
        System.out.println(c.addRentalDetail(r));

        System.out.println();

        Customer c2 = new NonMember();
        c2.setName("Mary");
        c2.setId("D45678");

        RentDetail r2 = new RentDetail(5, c2, "No. 15, Jalan Bunga 20, Taman Johor.", 115);

        System.out.println(r2.toString());
        System.out.println(c2.addRentalDetail(r2));
    }

}
