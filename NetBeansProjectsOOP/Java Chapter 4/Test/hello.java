package Test;
// import java.util.*;
public class hello {

    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        // System.out.print("Enter Your Name: ");
        // String Name=input.next();
        // System.out.print("Enter Your Age: ");
        // int Age=input.nextInt();
        // Person c3=new Person(Name,Age);
        // System.out.println(c3.printPerson());
        // input.close();

        String[] str = { "GEEKS", "", "GEEKS" };
        int a = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != "") {
                a++;
            }
        }
        System.out.println("The size of "
                           + "the array is "
                           + a);
    }
}