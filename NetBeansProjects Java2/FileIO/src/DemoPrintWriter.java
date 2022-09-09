
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
public class DemoPrintWriter {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
            try{
                File file = new File("sample.txt");
                Scanner input = new Scanner(System.in);
                System.out.println("Enter Name: ");
                String name = input.next();
//        if(file.exists()){
//            System.out.println("file exist");
//        }else{
            //Write data to file
                PrintWriter output = new PrintWriter(file);
            {
                //statement
                //student name, age, score
                output.println(name);
                output.println(200);
                output.println(530.0);
                output.close();
                System.out.println("Record Save");
            }
            }catch(FileNotFoundException ex){
                Logger.getLogger(DemoPrintWriter.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
