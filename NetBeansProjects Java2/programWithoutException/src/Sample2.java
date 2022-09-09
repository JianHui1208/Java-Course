import java.util.*;
public class Sample2 {
           
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       int number = 0;
       try{
            number = scanner.nextInt();
            System.out.println("The number entered is "+number);
       }catch(InputMismatchException e){
            System.out.println("Number must be numeric");
       }
            
    }
}
