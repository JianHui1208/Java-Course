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
        return Totalcredithour;
    }
    
    @Override
    public String toString(){
        String MSG = "Studen ID: " + getID() + "\nList of subject: ";
        System.out.println(MSG);
        for(int i=0; i < SubjectList.size();i++){
            System.out.println("Subject Code: " + SubjectList.get(i).getCode());
            System.out.println("Credit Hour: " + SubjectList.get(i).getHour());
            this.Totalcredithour += SubjectList.get(i).getHour();
        }
        return "";
    }
    
    public abstract String addSubject(Subject subject);
}
