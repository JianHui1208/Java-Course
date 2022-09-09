import java.util.*;

public class Sample1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integer: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
        try{
            System.out.println(number1 + " / "+ number2 + "is" +(number1/number2));                
        }catch(ArithmeticException e){
            System.out.println("number 2 can not be zero");
        }catch(InputMismatchException e){
            System.out.println("Number must be numeric");
        }catch(Exception e){
            System.out.println("HaHa,You Noob");
        }finally{
            //error or not error will be come out
            System.out.println("Hi");
        }
    }
}
