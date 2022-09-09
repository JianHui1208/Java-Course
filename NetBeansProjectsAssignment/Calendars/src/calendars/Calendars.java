/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendars;

/**
 *
 * @author William
 */
import java.util.*;
public class Calendars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //has two method inside(dowhlie and for)
        // TODO code application logic here
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter Years: ");
        int year = input.nextInt();
        System.out.print("Enter Frist day of the years: ");
        int day = input.nextInt(); 
        
        String header;
        System.out.println();
        for(int month=1;month<=12;month++){
            header=" ";
            switch(month){
                    case 1 : header += "January "; break;
                    case 2 : header += "February "; break;
                    case 3 : header += "March "; break;
                    case 4 : header += "April "; break;
                    case 5 : header += "May "; break;
                    case 6 : header += "June "; break;
                    case 7 : header += "July "; break;
                    case 8 : header += "August "; break;
                    case 9 : header += "September "; break;
                    case 10: header += "October "; break;
                    case 11: header += "November "; break;
                    case 12: header += "December "; break;
                    }
            header += year + " ";
            
            for(int b=0;b<23-(header.length()/2);b++){
                System.out.print(" ");
            }
            
            System.out.println(
                header + "\n-----------------------------------------------\n " +
		"Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            
            day%= 7;
            for(int b=0;b<=day*7;b++){
                System.out.print(" ");
            }
            
            int lastDay = 0;
            if(month==1 || month==3 || month==5 || month==7 || month==10 || month==12){
                lastDay +=31;
            }else if(month==4 || month==6 || month==8 || month==9 || month==11){
                lastDay +=30;
            }else{
                if(((year %4 ==0)&&(year %100 !=0))|| (year %400==0)){
                    lastDay +=29;
                }else{
                    lastDay +=28;
                }
            }
            
            for(int d=1;d<=lastDay;d++){
                if(d<10){
                    System.out.print(" ");
                }
                if(day %7 ==6){
                    System.out.print(d + "\n ");
                }else{
                    System.out.print(d + "     ");
                }if(d == lastDay){
                    System.out.println();
                }
                day++;
            }
            System.out.println();
        }*/
        
                Scanner input = new Scanner(System.in);
                System.out.print("Enter year: ");
                int year = input.nextInt();
                System.out.print("Enter first day of the year: ");
                int day = input.nextInt();
                int totalday=0;
                int month=1;
                do{
                switch(month){
                    case 1: System.out.println("\n\t\tJanuary "+year);totalday=31;break;
                    case 2: System.out.println("\n\t\tFebruary "+year);
                            /* if((year%4==0 && year%100!=0)|| year%400==0){
                                totalday=29;
                            }else{
                                totalday=28;
                            }*/
                            totalday=(year%4==0 && year%100!=0)|| year%400==0?29:28;
                            break;

                    case 3: System.out.println("\n\t\tMarch "+year);totalday=31;break;
                    case 4: System.out.println("\n\t\tApril "+year);totalday=30;break;
                    case 5: System.out.println("\n\t\tMay "+year);totalday=31;break;
                    case 6: System.out.println("\n\t\tJune "+year);totalday=30;break;
                    case 7: System.out.println("\n\t\tJuly "+year);totalday=31;break;
                    case 8: System.out.println("\n\t\tAugust "+year);totalday=31;break;
                    case 9: System.out.println("\n\t\tSeptember "+year);totalday=30;break;
                    case 10: System.out.println("\n\t\tOctober "+year);totalday=31;break;
                    case 11: System.out.println("\n\t\tNovember "+year);totalday=30;break;
                    case 12: System.out.println("\n\t\tDecember "+year);totalday=31;break;
                }

                System.out.println("_________________________________________");
                System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
                for(int a=1;a<=totalday;a++){
                    if(a==1){
                        for(int b=1;b<=day;b++){
                            System.out.print("\t");
                        }
                    }
                    System.out.print(a+"\t");
                    day++;
                    if(day%7==0){
                        day=0;
                        System.out.println();
                    }
                }
                month++;
                }while(month<=12);
	}
}