/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviecenima2;

import java.util.Scanner;

/**
 *
 * @author William
 */
public class MovieCenima2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] strName = new String[20];
        int [] choose = new int[20];
        Scanner input = new Scanner(System.in);
        int count=0;
        int [] seat={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.print("Press 1 to booking or Press 2 to exit: ");
        int number = input.nextInt();
        do{
        System.out.print("Enter Your Name: ");
        strName[count]=input.next();
        for(int a=0;a<seat.length;a++){
            System.out.print(seat[a]);
            if((a+1)%5 ==0){
                System.out.println();
            }else if(a<10){
                System.out.print("  ");
            }else{
                System.out.print("  ");
            }
        }
            System.out.print("Select Your Seat (1 To 20): ");
            choose[count]= input.nextInt();
            if(choose[count] ==0 || choose[count] >20){
                System.out.println("Not available,try angin.Enter angin: ");
                choose[count]= input.nextInt();
            }
            for(int a=0;a<seat.length;a++){
                if(choose[count] == seat[a]){
                    seat[a]= 0 ;
                }
            }
            System.out.println("Your Name : " +strName[count]+" Your Seat : "+choose[count]);
                        count++;
            System.out.print("Press 1 to booking or Press 2 to receipt,Press 3 to Exit: ");
            number = input.nextInt();
            if(number==2){
                int data=0;
                System.out.print("Enter your name: ");
                String name=input.next();
                for(int a=0;a<count;a++){
                    if(strName[a].equals(name)){
                        data=a;
                    }
                }
                if(strName[data]==null){
                    System.out.println("Your Receipt have no safe.");
                }else{
                    System.out.println("||||||||||||||||||||||||||||||");
                    System.out.println("Your Name: "+strName[data]+ " Your Seat: "+ choose[data]);
                    System.out.println("||||||||||||||||||||||||||||||");
                    System.out.println("Next Customer -->>");
                    System.out.print("Press 1 to booking or Press 2 to receipt,Press 3 to Exit: ");
                    number = input.nextInt();
                }
            }
        }while(number!=3);
        
    }
}
