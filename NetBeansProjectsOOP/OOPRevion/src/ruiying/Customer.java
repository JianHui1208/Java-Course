package ruiying;
import java.util.ArrayList;

public abstract class Customer {

    private String name;
    private String id;
    private ArrayList<RentDetail> RentList = new ArrayList<RentDetail>();

    public Customer() {

    }

    public Customer(String name) {

        this.name = name;

    }

    public String getName() {

        return this.name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getId() {

        return id;

    }

    public void setId(String id) {

        this.id = id;

    }

    public ArrayList<RentDetail> getRentDetail() {

        return RentList;

    }

    public abstract boolean addRentalDetail(RentDetail RentDetail);

}
