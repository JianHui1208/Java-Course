package School;

public class information {
    String Name = "";
    String ID = "";
    String PhoneNo = "";
    
    public information() {
    }

    public information(String newName, String newID, String newPhoneNo) {
        setName(newName);
        setID(newID);
        setPhoneNo(newPhoneNo);
    }
    
    public String setName(String newName) {
        Name = newName;
        return Name;
    }

    public String setID(String newID) {
        ID = newID;
        return ID;
    }

    public String setPhoneNo(String newPhoneNo) {
        PhoneNo = newPhoneNo;
        return PhoneNo;
    }

    public String Result() {
        String MSG = "Name: " + setName(Name) + "\n" + 
                     "Student ID: " + setID(ID) + "\n" + 
                     "Phone Number: " + setPhoneNo(PhoneNo) + "\n";
        return MSG;
    }
}
