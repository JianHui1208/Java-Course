/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author William
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Name");
            String name = input.next();
            System.out.println("Enter the Street");
            String street = input.next();
            System.out.println("Enter the City");
            String city = input.next();
            System.out.println("Enter the State");
            String state = input.next();
            System.out.println("Enter the ZipCode");
            int zipcode = input.nextInt();

            FileOutputStream output = new FileOutputStream("address.dat", true);
            DataOutputStream outputData = new DataOutputStream(output);
            outputData.writeUTF(name);
            outputData.writeUTF(street);
            outputData.writeUTF(city);
            outputData.writeUTF(state);
            outputData.writeInt(zipcode);
            outputData.close();

            FileInputStream inputDaa = new FileInputStream("address.dat");
            DataInputStream inputData = new DataInputStream(inputDaa);
            while(inputData.available()> 0){
                System.out.println(inputData.readUTF());
                System.out.println(inputData.readUTF());
                System.out.println(inputData.readUTF());
                System.out.println(inputData.readUTF());
                System.out.println(inputData.readInt());
            }
                inputData.close();
        
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
