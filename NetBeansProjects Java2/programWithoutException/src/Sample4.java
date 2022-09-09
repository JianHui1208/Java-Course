import java.util.*;
public class Sample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integer: ");
        try{
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();   
        int result = quotient(number1,number2);
       	System.out.println(number1 + " / "+ number2 + " is " + result);       
        }catch(ArithmeticException a){
        System.out.println(a.getMessage());
        }
    }
    public static int quotient(int number1, int number2)throws ArithmeticException{
        int result;
        if(number2 == 0){ 
            System.out.println("number 2 can not be zero");
            throw new ArithmeticException("OPOP");
        }else{
            result = number1 / number2;
        }
        return result;
    }
}


