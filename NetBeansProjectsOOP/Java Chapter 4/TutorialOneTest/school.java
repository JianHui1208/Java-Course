package TutorialOneTest;

public class school {
    String Name, ID, PhoNumber = "";
    int CountOfStudent, StudentsNo;

    public school() {
    }

    public school(String newName, String newID, String newPhoNumber, int i) {
        setName(newName);
        setID(newID);
        setPhoNumber(newPhoNumber);
        i++;
        CountOfStudent = i;
    }

    public int setStudentsNo() {
        StudentsNo = CountOfStudent;
        return StudentsNo;
    }

    private String setName(String newName) {
        this.Name = newName;// this.Name = Line 4
        return this.Name;
    }

    private String setID(String newID) {
        this.ID = newID;// this.ID = Line 4
        return this.ID;
    }

    private String setPhoNumber(String newPhoNumber) {
        this.PhoNumber = newPhoNumber;// this.PhoNumber = Line 4
        return this.PhoNumber;
    }

    public void DisplaySchool() {
        String MSG = "Student " + setStudentsNo() + ":\n" + "Name: " + setName(Name) + "\n"
                + "Student ID: " + setID(ID) + "\n" + "Phone Number: " + setPhoNumber(PhoNumber) + "\n";
        System.out.println(MSG);
    }
}
