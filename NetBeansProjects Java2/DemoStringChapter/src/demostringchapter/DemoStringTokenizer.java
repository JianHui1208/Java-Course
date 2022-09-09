/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostringchapter;

/**
 *
 * @author William
 */
import java.util.Scanner;
import java.util.StringTokenizer;
public class DemoStringTokenizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //by default=> delimeter (spacing), return delimeter(false)
        StringTokenizer s=new StringTokenizer("welcome to java html","me",true);
        //return total number of token
        System.out.println(s.countTokens());
        //display the token?
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
        
        Scanner scanner = new Scanner("welcome to java! java is cool");
        scanner.useDelimiter("java"); //by default => spacing
        while(scanner.hasNext()/*hasNext() return boolean result*/){
            System.out.println(scanner.next());
        }
        
        //string call=>split("delimeter")'
        String msg = "1 2 3 4";
        String [] array = msg.split(" ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
