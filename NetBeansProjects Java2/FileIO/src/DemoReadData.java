
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
public class DemoReadData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //record 3 test result from student, keep data in file
        //text io ,binary io
        try{
            File file = new File("score.txt");
            PrintWriter output = new PrintWriter(file);
            Scanner inputFromUser = new Scanner(System.in);
            for(int i=0; i<3; i++){
                System.out.println("Enter score: ");
                double score = inputFromUser.nextDouble();
                output.println(score);
            }
            output.close();
            
            Scanner input = new Scanner(file);
            double total = 0;
            while(input.hasNext()){
                total += input.nextDouble();
            }
            double average = total / 3;
            System.out.println("Average: " + average);
        }catch(FileNotFoundException e){
            System.out.println("File no found");
        }
        //read data from file, calculate average value
        
    }
    
}
