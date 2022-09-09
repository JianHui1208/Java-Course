package TutorialOne;

public class subject {
    String SubCode, SubName = "";
    int hours;
    int CountOfSubject, SubjectNo;

    public subject() {
    }

    public subject(String newSubCode, String newSubName, int newHours, int i) {
        setSubName(newSubName);
        setSubCode(newSubCode);
        setHours(newHours);
        i++;
        CountOfSubject = i;
    }

    public int setCountOfSubject() {
        if (CountOfSubject > 6) {
            System.out.println("One Student only can choose 6 subject.");
        } else {
            SubjectNo = CountOfSubject;
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
        String MSG = setCountOfSubject() + ". " + "Subject Code: " + setSubCode(SubCode) + "\n" + "Subject Name: "
                + setSubName(SubName) + "\n" + "Credit Hours: " + setHours(hours) + "\n";
        System.out.println(MSG);
    }
}
