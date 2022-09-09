
import java.io.DataInputStream;
import java.io.DataOutputStream;
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
public class DemoDataOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            //binary io -> binary file (dat)
            //specify the file (location of file..)
            //true => append
            FileOutputStream output = new FileOutputStream("sample.dat", true);
            //accept outputstream object , cannot be text
            DataOutputStream outputData = new DataOutputStream(output);
            //name, age, salary
            outputData.writeUTF("ASXAXS");
            outputData.writeInt(10);
            outputData.writeDouble(1000);
            outputData.close();
            
            
            FileInputStream input = new FileInputStream("sample.dat");
            DataInputStream inputData = new DataInputStream(input);
            while(inputData.available()> 0){
                System.out.println(inputData.readUTF());
                System.out.println(inputData.readInt());
                System.out.println(inputData.readDouble());
            }
            inputData.close();
            
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
