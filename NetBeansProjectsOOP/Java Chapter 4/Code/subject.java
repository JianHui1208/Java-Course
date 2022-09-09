package Code;

public class subject {
    String SubCode, SubName = "";
    int hours;
    static int CountOfSubject;

    public subject() {
    }

    public subject(String newSubCode, String newSubName, int newHours) {
        CountOfSubject++;
        setSubName(newSubName);
        setSubCode(newSubCode);
        setHours(newHours);
    }

    public int getCountOfSubject() {
        if (CountOfSubject > 6) {
            System.out.println("One Student only can choose 6 subject.");
        }
        return CountOfSubject;
    }

    private String setSubName(String newSubName) {
        this.SubName = newSubName;// this.SubName = Line 4
        return this.SubName;
    }

    private String setSubCode(String newSubCode) {
        this.SubCode = newSubCode;// this.SubCode = Line 4
        return this.SubCode;
    }

    private int setHours(int newhours) {
        this.hours = newhours;// this.hours = Line 4
        return this.hours;
    }

    public void DisplaySubject() {
        String MSG = getCountOfSubject() + ". " + "Subject Code: " + setSubCode(SubCode) + "\n" + "Subject Name: "
                + setSubName(SubName) + "\n" + "Credit Hours: " + setHours(hours) + "\n";
        System.out.println(MSG);
    }
}
