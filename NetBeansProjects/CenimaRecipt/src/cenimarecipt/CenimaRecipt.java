/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cenimarecipt;

/**
 *
 * @author William
 */
import java.util.*;
public class CenimaRecipt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lobby();
    }
    public static void Lobby(){
        int count=0;
        int number=0;
        String [] strName = new String[20];
        int [] choose = new int[20];
        Scanner input=new Scanner(System.in);
        
        do{
            System.out.print("Press 1 to booking,Press 2 to see receipt,Press 3 to exit: ");
            number = input.nextInt();
            switch(number){
                case 1:order(strName,count,choose);break;
                case 2:receipt(strName,count,choose);break;
                case 3:System.exit(0);break;
            }
        }while(number!=3);
    }
    
    public static void order(String [] strName,int count,int [] choose){
        int number=0;
        int [] seat={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Scanner input = new Scanner(System.in);
        while(choose[count]!=30){
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
            choose[count] = input.nextInt();
            if(choose[count] ==0 || choose[count] >20){
                System.out.println("Not availble,Try enter angin.");
                System.out.print("Your Seat: ");
                choose[count] = input.nextInt();
            }
            for(int a=0;a<seat.length;a++){
                if(choose[count] == seat[a]){
                    seat[a]=0;
                }
            }
            System.out.println("Your Name : " +strName[count]+" Your Seat : "+choose[count]);
            System.out.print("Enter 1 go Loddy,Enter 2 go receipt");
            int number3=input.nextInt();
            if(number3==1){
                Lobby();
            }else if(number3==2){
                receipt(strName,count,choose);
            }
        }
    }
    public static void receipt(String [] strName,int count,int [] choose){
        int data=0;
        Scanner input = new Scanner(System.in);
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
            System.out.println("Your Name: "+strName[data]+ " Your Seat: "+ choose[data]);
        }
        
    }
}
