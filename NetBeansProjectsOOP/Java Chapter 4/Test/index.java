package Test;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] array = new String[5];
        String[] array1 = new String[5];
        int[] array2 = new int[5];
        int a = 0;
        int b = 0;
        System.out.println("Please enter 5 names to sort");

        for (int i = 0; i < array.length; i++) {
            System.out.print("\nEnter String 1 value: ");
            array[i] = s.next();
            System.out.print("\nEnter String 2 value: ");
            array1[i] = s.next();
            System.out.print("\nEnter int value: ");
            array2[i] = s.nextInt();
            System.out.print("\n");
            System.out.print("If Enter 1, Stop Input: ");
            a = s.nextInt();
            if (a == 1) {
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array2[i] != 0) {
                b++;
            }
        }

        //Just to test
        for (int i = 0; i < b; i++) {
            System.out.println(
                    "String Value 1: " + array[i] + "\nString Value 2: " + array1[i] + "\nInt Value: " + array2[i]);
        }
        System.out.println(b);
        s.close();
    }
}
