/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplemath;

/**
 *
 * @author William
 */
public class SampleMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double total=0;
        double Average=0;
        int above = 0;
        int below = 0;
        int[] i =new int[20];//Array
        for(int a=0;a<i.length;a++){
           i[a] +=(Math.random()*100);
           total+=i[a];//Sum all array number
        }
        //Average
        Average=total/i.length;
        //find above and below
        for(int a=0;a<i.length;a++){
        if(i[a]>Average){
            above++;
        }else{
            if(i[a]<Average){
                below++;
            }
        }
        }
        System.out.println("Average Scores: "+ Average);
        System.out.println("Scores above average: "+ above);
        System.out.print("List of Score above average: ");
        for(int a=0;a<i.length;a++){
            if(i[a]>Average){
               System.out.print(i[a]+" ");
            }
        }
        System.out.println("\nScore below average: "+ below);
        System.out.printf("List of below average: ");
        for(int a=0;a<i.length;a++){
            if(i[a]<Average){
                System.out.print(i[a]+" ");
            }
        }
    }
    
}
