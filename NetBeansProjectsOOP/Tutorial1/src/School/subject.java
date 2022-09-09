package School;

import java.util.Arrays;

public class subject extends information{
    String Code[] = new String[5];
    String SubName[] = new String[5];
    int Hour[] = new int[5];

    public subject() {
    }
    
    public subject(String[] newCode, String[] newSubName, int[] newHour) {
        setCode(newCode);
        setSubName(newSubName);
        setHour(newHour);
    }

    public String setCode(String newCode[]) {
        Code = newCode;
        String StrCode = Arrays.toString(Code);
        return StrCode;
    }

    public String setSubName(String newSubName[]) {
        SubName = newSubName;
        String StrSubName = Arrays.toString(SubName);
        return StrSubName;
    }

    public int setHour(int newHour[]) {
        Hour = newHour;
        //Array->String
        String StrHour = Arrays.toString(Hour);
        //String->int
        int IntHour = Integer.parseInt(StrHour);  
        return IntHour;
    }
    
    public String toString(){
        String a2 = this.Result();
        String a1 = super.Result();
        String finalResult = a1 + a2;
        return finalResult;
    }
    
    @Override
    public String Result() {
        String MSG = "List of Subjects: " + "\n" + 
                        "   1. Subject Code: " + setCode(Code) + "\n" + 
                        "   2. Subject Name: " + setSubName(SubName) + "\n" + 
                        "   3. Credit Hours: " + setHour(Hour) + "\n";
        return MSG;
    }
    
    
}
