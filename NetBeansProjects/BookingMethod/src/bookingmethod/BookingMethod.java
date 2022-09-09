/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingmethod;

/**
 *
 * @author William
 */
import java.util.*;
public class BookingMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] availableSeat={20,20,20,20};
        Scanner input = new Scanner(System.in);
        int number=0;
        do{
        System.out.println("***************************");
        System.out.println("** SUC BUS BOOKING SYSTEM**");
        System.out.println("***************************");
        System.out.println("[1] Book");
        System.out.println("[2] View");
        System.out.println("[3] Exit");
        System.out.println("***************************");
        System.out.print("Enter Choice: ");
        number=input.nextInt();
        switch(number){
            case 1:bookTicket(availableSeat);break;
            case 2:viewAvailableSeat(availableSeat);break;
            case 3:System.out.println("Thank You!Come angin.");
                    System.exit(0);break;
        }
        }while(number!=3);
    }
    public static int []bookTicket(int[] availableSeat){
        int count=0;
        int me=20;
        int kl=35;
        int ip=70;
        int pe=80;
        
        System.out.println("*************************************");
        System.out.println("**DESTINATION  |    FARE   |   SEAT**");
        System.out.println("*************************************");
        System.out.println("**1.)MELAKA    |    RM20   |   20  **");
        System.out.println("**2.)KL        |    RM35   |   20  **");
        System.out.println("**3.)IPOH      |    RM70   |   20  **");
        System.out.println("**4.)PENENG    |    RM80   |   20  **");
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println();
        System.out.println("**STUDENT & SENIOR CITIZEN with 20% DISCOUNT");
        
        Scanner input =new Scanner(System.in);
        System.out.print("ENTER PASSENGER'S NAME: ");
        String strName=input.next();
        System.out.print("ENTER DESTINATION (ENTER NUMBER): ");
        int des = input.nextInt();
        System.out.print("HOW MANY PASSENGERS ARE YOU; ");
        availableSeat[count] = input.nextInt();
        System.out.print("HOW MANY PASSENGERS HAVE DISCOUNT: ");
        int dis = input.nextInt();
        
        System.out.println("********************************************");
        System.out.println("**         PASSENGER'S DETAILS            **");
        System.out.println("********************************************");
        System.out.println("*****PASSENGER'S NAME: "+strName);
        System.out.println("*****DESTINATION:"+des);
        if(des==1){
            System.out.println("*****RARE PRICE:"+me);
        }else if(des==2){
            System.out.println("*****RARE PRICE:"+kl);
        }else if(des==3){
            System.out.println("*****RARE PRICE:"+ip);
        }else if(des==4){
            System.out.println("*****RARE PRICE:"+pe);
        }
        System.out.println("*****NO.OF PASSENGERS: "+availableSeat[count]);
        System.out.println("*****NO.OF PASSENGERS WITH DISCOUNT: "+dis);
        System.out.println("********************************************");
        System.out.println("*********************************************");
        System.out.println();
        System.out.println();
        if(des==1){
            System.out.println("PASSENGER'S TOTAL FARE: "+(me*availableSeat[count])*80/100);
        }else if(des==2){
            System.out.println("PASSENGER'S TOTAL FARE: "+(kl*availableSeat[count])*80/100);
        }else if(des==3){
            System.out.println("PASSENGER'S TOTAL FARE: "+(ip*availableSeat[count])*80/100);
        }else if(des==4){
            System.out.println("PASSENGER'S TOTAL FARE: "+(pe*availableSeat[count])*80/100);
        }
        System.out.print("ENTER AMOUNT TO PAY: ");
        int pay = input.nextInt();
        if(me==20){
            System.out.println("CHANGE: "+ ((pay-((me*availableSeat[count]))*80/100)));
        }else if(kl==35){
            System.out.println("CHANGE: "+ ((pay-((kl*availableSeat[count]))*80/100)));
        }else if(ip==70){
            System.out.println("CHANGE: "+((pay-((ip*availableSeat[count]))*80/100)));
        }else if(pe==80){
            System.out.println("CHANGE: "+((pay-((pe*availableSeat[count]))*80/100)));
        }
        System.out.println();
        count++;
        return availableSeat;
    }
    public static int viewAvailableSeat(int[] availableSeat){
        int count=0;
        System.out.println("*************************************");
        System.out.println("**DESTINATION  |    FARE   |   SEAT**");
        System.out.println("*************************************");
        System.out.println("**1.)MELAKA    |    RM20   |   "+(20-availableSeat[count])+"  **");
        System.out.println("**2.)KL        |    RM35   |   "+(20-availableSeat[count])+"  **");
        System.out.println("**3.)IPOH      |    RM70   |   "+(20-availableSeat[count])+"  **");
        System.out.println("**4.)PENENG    |    RM80   |   "+(20-availableSeat[count])+"  **");
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println();
        System.out.println("**STUDENT & SENIOR CITIZEN with 20% DISCOUNT");
        count++;
        return 0;
    }
}

