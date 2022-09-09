/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionexamscore.ifelse;

/**
 *
 * @author William
 */
import java.util.*;
public class QuestionExamScoreIfelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Score: ");
        double score=input.nextDouble();
        char grade;
        /*if (score >=90)
            grade = 'A';
        else
            if (score >=80)
                grade = 'B';
            else
                if (score >= 70)
                    grade = 'C';
                else
                    if (score >= 60)
                        grade = 'D';
                    else
                        grade = 'F';*/
        
        if(score >=90)
            grade= 'A';
        else if(score>=80)
            grade= 'B';
        else if(score>=70)
            grade= 'C';
        else if(score>=60)
            grade= 'D';
        else 
            grade= 'F';
        
        
        
        System.out.println("Grade is " + grade);
    }
    
}
