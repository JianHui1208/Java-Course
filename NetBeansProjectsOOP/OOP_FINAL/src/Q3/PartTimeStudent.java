package Q3;

public class PartTimeStudent extends Student{
    public static final int MAX_CREDIT_HOUR = 9;
    
    @Override
    public String addSubject(Subject R1){
        String MSG = "";
        int TotalHour = 0;
        int hour = super.addCreditHour(TotalHour);
        if(hour < MAX_CREDIT_HOUR){
            MSG = PartTimeStudent.Can;
            return MSG;
        }else{
            MSG = PartTimeStudent.Cannot;
            return MSG;
        }
    }
}
