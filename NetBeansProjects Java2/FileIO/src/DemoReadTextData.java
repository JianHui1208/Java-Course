
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jocelyn
 */
public class DemoReadTextData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            File file = new File("sample.txt");
            Scanner input = new Scanner(file);
            System.out.println(input.next());
            System.out.println(input.nextInt());
            System.out.println(input.nextDouble());
            input.close();
        }catch(FileNotFoundException e){
            System.out.println("File no found");
        }
        
    }
    
}
