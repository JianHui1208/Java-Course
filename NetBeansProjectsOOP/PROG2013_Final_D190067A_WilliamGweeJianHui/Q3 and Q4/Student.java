package Q3;

import java.util.ArrayList;

public abstract class Student {
    String studentID;
    int Totalcredithour;
    ArrayList<Subject> SubjectList  = new ArrayList<Subject>();
    static final String Cannot = "You are not allowed to enroll in this subject due to your credit hours for this semester is full.";
    static final String Can = "Successfully added!";
    
    public Student(){
    }
    
    public String getID(){
        return studentID;
    }
    
    public void setID(String ID){
        this.studentID = ID;
    }
    
    public void setList(ArrayList<Subject> List){
        this.SubjectList = List;
    }
    
    public int addCreditHour(int hour){
        return hour;
    }
    
    public String toString(){
        String MSG = "Studen ID: " + getID() + "\nList of subject: ";
        return MSG;
    }
    
    public abstract String addSubject(Subject subject);
}
