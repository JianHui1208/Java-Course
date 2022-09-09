/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedayoftheweek;

/**
 *
 * @author William
 */
import java.util.*;
public class TheDayOfTheWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = input.nextInt();
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        System.out.print("Enter the date of this month: ");
        int date = input.nextInt();
        
        if ((month==1)||(month==2)){
        month+=12; year--;} //+= 是input + 等于后面的号码 -- 
        
        int q = date;
        int m = month;
        int k = (year%100);
        int j = (year/100);
        int h = (q + (int)((26*(m+1))/10.0)+ k +(int)(k/4.0)+(int)(j/4.0)+(5*j))%7;
        
        System.out.print("Day of the week is ");
        switch(h)
        {   case 0:System.out.println("Saturday");break;
            case 1:System.out.println("Sunday");break;
            case 2:System.out.println("Monday");break;
            case 3:System.out.println("Tuesday");break;
            case 4:System.out.println("Wednesday");break;
            case 5:System.out.println("Thursday");break;
            case 6:System.out.println("Friday");break;
        }
    }
    
}
