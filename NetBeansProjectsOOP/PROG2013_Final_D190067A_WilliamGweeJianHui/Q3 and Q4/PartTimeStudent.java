package Q3;

public class PartTimeStudent extends Student{
    public static final int MAX_CREDIT_HOUR = 9;
    
    @Override
    public String addSubject(Subject R1){
        String MSG = "";
        int TotalHour = 12;
        int hour = super.addCreditHour(TotalHour);
        if(hour <= MAX_CREDIT_HOUR){
            return "Successfully added!";
        }else{
            return "You are not allowed to enroll in this subject due to your credit hours for this semester is full.";
        }
        
    }
}
