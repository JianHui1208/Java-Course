package Q3;

import java.util.ArrayList;

public class index {

    public static void main(String[] args) {
        Student s1 = new FullTimeStudent();
        s1.setID("D190067A");
        System.out.println(s1.toString());
        ArrayList<Subject> SubjectList  = new ArrayList<Subject>();
        SubjectList.add(new Subject(2,"PROG2020"));
        SubjectList.add(new Subject(3,"PROG1515"));
        SubjectList.add(new Subject(4,"PROG6262"));
        s1.setList(SubjectList);
        
        Subject R1 = new Subject(3, "PROG2020");
        Subject R2 = new Subject(4, "PROG1616");
        Subject R3 = new Subject(5, "PROG7171");
        System.out.println(R1.toString());
        System.out.println(R2.toString());
        System.out.println(R3.toString());
        s1.addCreditHour(12);
        System.out.println(s1.addSubject(R3));
    }
    
}
