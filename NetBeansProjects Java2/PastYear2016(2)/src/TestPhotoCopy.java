
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class TestPhotoCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhotoCopy A = new PhotoCopy();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = input.next();
        System.out.println("Enter the Type of printing: ");
        String Type = input.next();
        System.out.println("Enter the Number of Pages: ");
        int pages = input.nextInt();
        A.setName(name);
        A.getCode(Type);
        A.setPages(pages);
        System.out.println(A.toString());
    }
    
}
