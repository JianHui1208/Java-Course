/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigngrades;

/**
 *
 * @author William
 */
import java.util.*;
public class AssignGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int [] score = new int[input.nextInt()];
        char [] grade = new char[score.length];
        
        System.out.print("Enter " +score.length +" score: ");
        for(int i =0;i<score.length;i++){
            score[i] = input.nextInt();
        }
        
        //call methods
        getGrades(score,grade);
        
        for(int i=0;i<score.length;i++){
            System.out.println("Student " + i + "scors is " + score[i] +" and grade is " + grade[i]);
        }
        
        
    }
    public static int max(int[] array){
           int max = array[0];
           for(int i=1; i<array.length;i++){
               if(array[i]>max)
                   max=array[i];
           }
           return max;
        }
    
    public static void getGrades(int[] score,char[] grade){
        int best = max(score);
        for(int i=0;i<score.length;i++){
            if(score[i] >=best -10){
                grade[i]='A';
            }else if(score[i]>=best -20){
                grade[i]='B';
            }else if(score[i]>=best -30){
                grade[i]='C';
            }else if(score[i]>=best -40){
                grade[i]='D';
            }else{
                grade[i]='f';
            }
        }
    }
}
