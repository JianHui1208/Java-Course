package Code;

/**
 * index
 */
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.PrintWriter;
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int count = 0;
        do {
            count++;
            String No = Integer.toString(count);
            if (count < 10) {
                No = "000" + No;
            } else if (count >= 10 && count <= 99) {
                No = "00" + No;
            } else if (count >= 100) {
                No = "0" + No;
            }
            System.out.println(No);
            System.out.print("If you want to finish, please enter 0. If you want to continue, enter 1.");
            number = input.nextInt();
        } while (number != 0);
        input.close();

        // System.out.println("\n");

        // for (int i = 1; i <= 100; i++) {
        // String No = Integer.toString(i);
        // if (i < 10) {
        // System.out.println("000" + No);
        // } else if (i >= 10 && i <= 99) {
        // System.out.println("00" + No);
        // } else if (i >= 100) {
        // System.out.println("0" + No);
        // }
        // }
        // String str = "";
        // str = input.next();
        // char mychar = str.charAt(0);
        // if (mychar == 'Y') {
        // System.out.println("You are a Member.");
        // } else {
        // System.out.println("You are not a Member.");
        // }
        // int[] array = new int[5];
        // int total = 0;
        // for (int i = 0; i < array.length; i++) {
        // array[i] = input.nextInt();
        // total += array[i];
        // }
        // System.out.println(total);
        // int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        // for (int i = 0; i < myNumbers.length; ++i) {
        // System.out.println(myNumbers[i]);
        // for (int j = 0; j < myNumbers[i].length; ++j) {
        // System.out.println("\n");
        // System.out.println(myNumbers[i][j]);
        // }
        // }
    }
}