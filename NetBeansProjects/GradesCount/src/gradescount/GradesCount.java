/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradescount;

/**
 *
 * @author William
 */
import java.util.*;
public class GradesCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int marks=0;
        int total=0;
        int all=0;
        int X=1;
        
        double GradeA=0;
        double GradeB=0;
        double GradeC=0;
        double GradeD=0;
        double GradeF=0;
        do{
            System.out.print("Score for student " + X + " between 0 to 100 or -1 to quit: ");
            marks =input.nextInt();
            if(marks>=90 && marks<=100){
                GradeA++;
            }else if(marks>=80 && marks<=89){
                GradeB++;
            }else if(marks>=70 && marks<=79){
                GradeC++;
            }else if(marks>=60 && marks<=69){
                GradeD++;
            }else{GradeF++;
            }
            total++;
            all+=marks;
            X++;
        }while(marks!=-1);
        double average = (double) (all+1)/(total-1);
        
        System.out.println("Total number of Students = "+(total-1));
        System.out.printf("Average score for %d students is %.2f\n",(total-1),average);
        System.out.printf("Grade A: %.2f%%\n", (GradeA*100)/(total-1) , "%");
        System.out.printf("Grade B: %.2f%%\n", (GradeB*100)/(total-1) , "%");
        System.out.printf("Grade C: %.2f%%\n", (GradeC*100)/(total-1) , "%");
        System.out.printf("Grade D: %.2f%%\n", (GradeD*100)/(total-1) , "%");
        System.out.printf("Grade F: %.2f%%",((GradeF-1)*100/(total-1)));
    }
    
}
