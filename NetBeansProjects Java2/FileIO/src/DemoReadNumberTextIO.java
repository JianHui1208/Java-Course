
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jocelyn
 */
public class DemoReadNumberTextIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // write 10 number to text file (printWriter)
        // read 10 number from file (scanner)
        // calculate average value
        
        try{
            File file = new File("number.txt");
            PrintWriter output = new PrintWriter(file);
            for(int i=1; i<=10; i++){
                output.print(i + " ");
            }
            output.close();
            
            Scanner input = new Scanner(file);
            double total=0;
            while(input.hasNext()){
                int n = input.nextInt();
                System.out.print(n + " ");
                total += n;
            }
            double average = total / 10;
            System.out.println("Average: " + average);
            input.close();
        }catch(FileNotFoundException ex){
            Logger.getLogger(DemoReadNumberTextIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
