
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jocelyn
 */
public class DemoFileOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        try{
            //binary io -> binary file (dat)
            FileOutputStream output = new FileOutputStream("sample.dat");
            //name, age, salary
            output.write("ali".getBytes());//must at binary.io only if the data is string must add the .getBytes()
            output.write(10);
            output.write(1000);
            output.close();
            
            FileInputStream input = new FileInputStream("sample.dat");
            System.out.println((char)input.read());
            System.out.println((char)input.read());
            System.out.println((char)input.read());
            System.out.println((int)input.read());
            System.out.println(input.read());
            input.close();
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
