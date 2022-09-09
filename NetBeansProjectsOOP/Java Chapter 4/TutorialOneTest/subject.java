package TutorialOneTest;

public class subject {
    String[] subName = new String[99];
    String[] subCode = new String[99];
    int[] hours = new int[99];
    String SubCode, SubName = "";
    int Hours;
    int CountOfSubject, SubjectNo;
    int i;

    public subject() {
    }

    public subject(String newSubCode, String newSubName, int newHours, int newI) {
        subName[i] = setSubName(newSubName);
        subCode[i] = setSubCode(newSubCode);
        hours[i] = setHours(newHours);
        newI++;
        CountOfSubject = newI;
    }

    public int setCountOfSubject() {
        if (CountOfSubject > 6) {
            System.out.println("One Student only can choose 6 subject.");
        } else {
            SubjectNo = CountOfSubject;
        }
        return CountOfSubject;
    }

    public String setSubName(String newSubName) {
        this.SubName = newSubName;// this.SubName = Line 4
        return this.SubName;
    }

    public String setSubCode(String newSubCode) {
        this.SubCode = newSubCode;// this.SubCode = Line 4
        return this.SubCode;
    }

    public int setHours(int newhours) {
        this.Hours = newhours;// this.hours = Line 4
        return this.Hours;
    }

    public void DisplaySubject() {
        String MSG = "";
        MSG = setCountOfSubject() + ". " + "Subject Code: " + setSubCode(subCode[i]) + "\n" + "Subject Name: "
                + setSubName(subName[i]) + "\n" + "Credit Hours: " + setHours(hours[i]) + "\n";

        System.out.println(MSG);
    }
}
