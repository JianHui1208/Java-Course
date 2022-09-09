/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpplp;

/**
 *
 * @author William
 */
import java.util.*;
public class TestPPLP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int marks;
        int total = 0;
        int all=0;
        int X = 1;
        int Y = 1;
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double f = 0;
        
        do{
            System.out.print("Score for student " + Y + " between 0 to 100 or -1 to quit: ");
            marks = input.nextInt();
            if(marks>=90 && marks<=100){
                a++;
            }else if(marks>=80 && marks<=89){
                b++;
            }else if(marks>=70 && marks<=79){
                c++;
            }else if(marks>=60 && marks<=69){
                d++;
            }else{f++;}
            total++;
            all+=marks;
            X++;
            
            }while(marks!=-1);
        
            double average = (all+1)/(total-1);
            
            System.out.println("Total number of Student=" + (total - 1));
            System.out.println("Average score for " + (total-1) + "students is " + average);
            System.out.println("Grade A: " + (a*100)/(total-1) + "%");
            System.out.println("Grade B: " +(b*100)/(total-1) +  "%");
            System.out.println("Grade C: " + (c*100)/(total-1) + "%");
            System.out.println("Grade D:" + (d*100)/(total-1) + "%");
            System.out.printf("Grade F: %.2f%%" , ((f-1)*100/(total-1)));
        }
    }
    

