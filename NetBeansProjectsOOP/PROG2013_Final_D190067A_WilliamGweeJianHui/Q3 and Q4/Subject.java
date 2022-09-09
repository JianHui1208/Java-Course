package Q3;

public class Subject{
    int creditHour;
    String SubjectCode;
    
    public Subject(int credithour, String SubjectCode){
        this.creditHour = credithour;
        this.SubjectCode = SubjectCode;
    }
    
    public int getHour(){
        return creditHour;
    }
    
    public void setHour(int credithour){
        this.creditHour = credithour;
    }
    
    public String getCode(){
        return SubjectCode;
    }
    
    public void setCode(String SubjectCode){
        this.SubjectCode = SubjectCode;
    }
    
    public String toString(){
        String MSG = "";
        MSG = "Subject Code: " + getCode() + 
                "\nCredit Hour: " + getHour();
        return MSG;
    }
    
    
}
