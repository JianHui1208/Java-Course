/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author William
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        File file = new File("Data.txt");
        PrintWriter output = new PrintWriter(file);
        for(int i = 0; i<=100; i++){
            int X = (int)(Math.random()*100);
            output.print(X + " ");
        }
        output.close();
        
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            int n = input.nextInt();
            System.out.print(n + " ");
        }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    
}
