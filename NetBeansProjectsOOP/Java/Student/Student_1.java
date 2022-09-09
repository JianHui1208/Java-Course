
package GradStudent;

/**
 *
 * @author User
 */
public class Student {

    private String name;
    private String ID;
    private String grade;
    private double points;

    public Student() {
        name = null;
        ID = null;
    }

    public Student Student(Student s1) {
        Student s2 = s1;
        return s2;
    }

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public void setName() {
        this.name = name;
    }

    public void setID() {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String toString() {
        return this.name + "(" + this.ID + ")";
    }

    public boolean equal() {
        boolean status;
        if ((name == "aa") && (ID == "as")) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public Student copy() {
        Student c = new Student(name, ID);
        return c;
    }

    public double calcGPA(String[] grade, int[] credit) {
        double cgpa = 0;
        double Tcredit = 0;
        double Tpoint = 0;
        double[] point = new double[grade.length];
        for (int i = 0; i < grade.length; i++) {
            switch (grade[i]) {
                case ("A"):
                    point[i] = 4.00;
                    break;
                case ("A-"):
                    point[i] = 3.67;
                    break;
                case ("B+"):
                    point[i] = 3.33;
                    break;
                case ("B"):
                    point[i] = 3.00;
                    break;
                case ("B-"):
                    point[i] = 2.67;
                    break;
                case ("C+"):
                    point[i] = 2.33;
                    break;
                case ("C"):
                    point[i] = 2.00;
                    break;
                case ("D"):
                    point[i] = 1.00;
                    break;
                case ("F"):
                    point[i] = 0.00;
                    break;
                default:
                    System.out.println("Error Input Grade");
            }
        }
        for (int i = 0; i < grade.length; i++) {
            Tcredit += credit[i];
            Tpoint += point[i];
            cgpa += Tcredit / Tpoint;
        }
        return cgpa;
    }

}
