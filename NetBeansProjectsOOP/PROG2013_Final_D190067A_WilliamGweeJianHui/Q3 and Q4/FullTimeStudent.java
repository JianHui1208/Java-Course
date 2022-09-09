package Q3;

public class FullTimeStudent extends Student{
    public static final int MAX_CREDIT_HOUR = 18;
    
    @Override
    public String addSubject(Subject R1){
        String MSG = "";
        int TotalHour = 0;
        int hour = super.addCreditHour(TotalHour);
        if(hour > MAX_CREDIT_HOUR){
            MSG = this.Cannot;
            return MSG;
        }
        return MSG;
    }
}
