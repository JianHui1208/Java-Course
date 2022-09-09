package Q3;

import java.util.ArrayList;

public class index {

    public static void main(String[] args) {
        Student s1 = new FullTimeStudent();
        Subject subject = new Subject();        
        s1.setID("D123456");
        ArrayList<Subject> SubjectList  = new ArrayList<>();
        SubjectList.add(new Subject(3,"PROG1103"));
        SubjectList.add(new Subject(3,"CSIS2033"));
        SubjectList.add(new Subject(4,"PROG2114"));
        s1.setList(SubjectList);
        System.out.println(s1.toString());
        System.out.println("Total Credit Hour: " + s1.addCreditHour(0));
        System.out.println(s1.addSubject(subject));
    }
    
}
