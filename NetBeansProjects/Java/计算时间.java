/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Yeow Jing Zhi
 */
import java.util.Date;
import java.util.Scanner;
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int num;
        
        do
        {
            System.out.println("");
            System.out.println("**********************************************");
            System.out.println("1. Time Calculator");
            System.out.println("2. Time Difference Calculator");
            System.out.println("3. Age Calculator");
            System.out.println("4. Exit");
            System.out.println("**********************************************");
            System.out.println("Note: All inputs are set by 'Integer Only'.\n");
            System.out.print("Please select an option that you want: ");
            num = input.nextInt();

            switch (num) 
            {
                case 1:
                    System.out.println("______________________________________________\n");
                    System.out.println("1. Year         2. Month");
                    System.out.println("3. Day          4. Hour");
                    System.out.println("5. Minutes");
                    System.out.println("\nNote: The default month is set to 30 days");
                    System.out.println(" ");
                    System.out.print("Please choose the time unit you want to enter: ");
                    int num2 = input.nextInt();

                    switch (num2)
                    {
                        case 1:
                            System.out.println("______________________________________________");
                            System.out.println(" ");
                            System.out.print("Please enter a number of year: ");
                            int year = input.nextInt();
                            System.out.println(" ");
                            System.out.println("Year : " + year);
                            System.out.println("Month : " + (year*12));
                            System.out.println("Day : " + (year*12*30+5));
                            System.out.println("Hour : " + (year*12*30*24 + 5*24));
                            System.out.println("Minutes : " + (year*12*30*24*60 + 5*24*60));
                            System.out.println("Seconds : " + (year*12*30*24*60*60 + 5*24*60*60));
                            System.out.println("______________________________________________");
                            break;

                        case 2:
                            System.out.println("______________________________________________");
                            System.out.println(" ");
                            System.out.print("Please enter a number of month: ");
                            int month = input.nextInt();
                            System.out.println(" ");
                            System.out.println("Year : " + month/12);
                            System.out.println("Month : " + (month));
                            System.out.println("Day : " + ((month*30)));
                            System.out.println("Hour : " + (month*30*24));
                            System.out.println("Minutes : " + (month*30*24*60));
                            System.out.println("Seconds : " + (month*30*24*60*60));
                            System.out.println("______________________________________________");
                            break;

                        case 3:
                            System.out.println("______________________________________________");
                            System.out.println(" ");
                            System.out.print("Please enter a number of days: ");
                            int day = input.nextInt();
                            System.out.println(" ");
                            System.out.println("Year : " + day/30/12);
                            System.out.println("Month : " + (day/30));
                            System.out.println("Day : " + (day));
                            System.out.println("Hour : " + (day*24));
                            System.out.println("Minutes : " + (day*24*60));
                            System.out.println("Seconds : " + (day*24*60*60));
                            System.out.println("______________________________________________");
                            break;

                        case 4:
                            System.out.println("______________________________________________");
                            System.out.println(" ");
                            System.out.print("Please enter a number of hour: ");
                            int hour = input.nextInt();
                            System.out.println(" ");
                            System.out.println("Year : " + hour/24/30/12);
                            System.out.println("Month : " + (hour/24/30));
                            System.out.println("Day : " + (hour/24));
                            System.out.println("Hour : " + (hour));
                            System.out.println("Minutes : " + (hour*60));
                            System.out.println("Seconds : " + (hour*60*60));
                            System.out.println("______________________________________________");
                            break;

                        case 5:
                            System.out.println("______________________________________________");
                            System.out.println(" ");
                            System.out.print("Please enter a number of minute: ");
                            int min = input.nextInt();
                            System.out.println(" ");
                            System.out.println("Year : " + min/60/24/30/12);
                            System.out.println("Month : " + (min/60/24/30));
                            System.out.println("Day : " + (min/60/24));
                            System.out.println("Hour : " + (min/60));
                            System.out.println("Minutes : " + (min));
                            System.out.println("Seconds : " + (min*60));
                            System.out.println("______________________________________________");
                            break;

                        default:
                            System.out.println("Invalid number");
                            System.out.println("______________________________________________");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("______________________________________________");
                    System.out.println(" ");
                    System.out.println("1. Year         2. Month");
                    System.out.println("3. Day          4. Hour");
                    System.out.println("5. Minutes      6. Seconds");
                    System.out.println("\nNote: The default month is set to 30 days");
                    System.out.println(" ");
                    System.out.print("Please choose the time unit you want to enter: ");
                    int num3 = input.nextInt();

                    switch (num3)
                    {
                        case 1:
                            System.out.println("______________________________________________\n");
                            System.out.print("Enter the first year: ");
                            int year2 = input.nextInt();
                            
                            System.out.print("Enter the second year: ");
                            int year3 = input.nextInt();
                            
                            System.out.println("Substracting biggest number to the smallest number...\n");
                            
                            if(year3 >= year2)
                            {
                                System.out.println("The Year Difference is : " + (year3 - year2));
                                System.out.println("The Month Difference is : " + ((year3 - year2)*12));
                                System.out.println("The Day Difference is : " + ((year3 - year2)*12*30));
                                System.out.println("The Hour Difference is : " + ((year3 - year2)*12*30*24));
                                System.out.println("The Minutes Difference is : " + ((year3 - year2)*12*30*24*60));
                                System.out.println("The Seconds Difference is : " + ((year3 - year2)*12*30*24*60*60));
                                System.out.println("______________________________________________");
                            }
                            else
                            {
                                System.out.println("The Year Difference is : " + (year2 - year3));
                                System.out.println("The Month Difference is : " + ((year2 - year3)*12));
                                System.out.println("The Day Difference is : " + ((year2 - year3)*12*30));
                                System.out.println("The Hour Difference is : " + ((year2 - year3)*12*30*24));
                                System.out.println("The Minutes Difference is : " + ((year2 - year3)*12*30*24*60));
                                System.out.println("The Seconds Difference is : " + ((year2 - year3)*12*30*24*60*60));
                                System.out.println("______________________________________________");
                            }
                            break;
                            
                        case 2:
                            System.out.println("______________________________________________\n");
                            System.out.print("Enter the first month: ");
                            int month2 = input.nextInt();
                            
                            System.out.print("Enter the second month: ");
                            int month3 = input.nextInt();
                            
                            System.out.println("Substracting biggest number to the smallest number...\n");
                            
                            if(month3 >= month2)
                            {
                                System.out.println("The Year Difference is : " + (month3 - month2)/12);
                                System.out.println("The Month Difference is : " + (month3 - month2));
                                System.out.println("The Day Difference is : " + ((month3 - month2)*30));
                                System.out.println("The Hour Difference is : " + ((month3 - month2)*30*24));
                                System.out.println("The Minutes Difference is : " + ((month3 - month2)*30*24*60));
                                System.out.println("The Seconds Difference is : " + ((month3 - month2)*30*24*60*60));
                                System.out.println("______________________________________________");
                            }
                            else
                            {
                                System.out.println("The Year Difference is : " + (month2 - month3)/12);
                                System.out.println("The Month Difference is : " + (month2 - month3));
                                System.out.println("The Day Difference is : " + ((month2 - month3)*30));
                                System.out.println("The Hour Difference is : " + ((month2 - month3)*30*24));
                                System.out.println("The Minutes Difference is : " + ((month2 - month3)*30*24*60));
                                System.out.println("The Seconds Difference is : " + ((month2 - month3)*30*24*60*60));
                                System.out.println("______________________________________________");
                            }
                            break;

                        case 3:
                            System.out.println("______________________________________________\n");
                            System.out.print("Enter the first day: ");
                            int day2 = input.nextInt();
                            
                            System.out.print("Enter the second day: ");
                            int day3 = input.nextInt();
                            
                            System.out.println("Substracting biggest number to the smallest number...\n");
                            
                            if(day3 >= day2)
                            {
                                System.out.println("The Year Difference is : " + (day3 - day2)/30/12);
                                System.out.println("The Month Difference is : " + (day3 - day2)/30);
                                System.out.println("The Day Difference is : " + ((day3 - day2)));
                                System.out.println("The Hour Difference is : " + ((day3 - day2)*24));
                                System.out.println("The Minutes Difference is : " + ((day3 - day2)*24*60));
                                System.out.println("The Seconds Difference is : " + ((day3 - day2)*24*60*60));
                                System.out.println("______________________________________________");
                            }
                            else
                            {
                                System.out.println("The Year Difference is : " + (day2 - day3)/30/12);
                                System.out.println("The Month Difference is : " + (day2 - day3)/30);
                                System.out.println("The Day Difference is : " + ((day2 - day3)));
                                System.out.println("The Hour Difference is : " + ((day2 - day3)*24));
                                System.out.println("The Minutes Difference is : " + ((day2 - day3)*24*60));
                                System.out.println("The Seconds Difference is : " + ((day2 - day3)*24*60*60));
                                System.out.println("______________________________________________");
                            }
                            break;

                        case 4:
                            System.out.println("______________________________________________\n");
                            System.out.print("Enter the first hour: ");
                            int hour2 = input.nextInt();
                            
                            System.out.print("Enter the second hour: ");
                            int hour3 = input.nextInt();
                            
                            System.out.println("Substracting biggest number to the smallest number...\n");
                            
                            if(hour3 >= hour2)
                            {
                                System.out.println("The Year Difference is : " + (hour3 - hour2)/24/30/12);
                                System.out.println("The Month Difference is : " + (hour3 - hour2)/24/30);
                                System.out.println("The Day Difference is : " + ((hour3 - hour2)/24));
                                System.out.println("The Hour Difference is : " + ((hour3 - hour2)));
                                System.out.println("The Minutes Difference is : " + ((hour3 - hour2)*60));
                                System.out.println("The Seconds Difference is : " + ((hour3 - hour2)*60*60));
                                System.out.println("______________________________________________");
                            }
                            else
                            {
                                System.out.println("The Year Difference is : " + (hour2 - hour3)/24/30/12);
                                System.out.println("The Month Difference is : " + (hour2 - hour3)/24/30);
                                System.out.println("The Day Difference is : " + ((hour2 - hour3)/24));
                                System.out.println("The Hour Difference is : " + ((hour2 - hour3)));
                                System.out.println("The Minutes Difference is : " + ((hour2 - hour3)*60));
                                System.out.println("The Seconds Difference is : " + ((hour2 - hour3)*60*60));
                                System.out.println("______________________________________________");
                            }
                            break;

                        case 5:
                            System.out.println("______________________________________________\n");
                            System.out.print("Enter the first minute: ");
                            int min2 = input.nextInt();
                            
                            System.out.print("Enter the second minute: ");
                            int min3 = input.nextInt();
                            
                            System.out.println("Substracting biggest number to the smallest number...\n");
                            
                            if(min3 >= min2)
                            {
                                System.out.println("The Year Difference is : " + (min3 - min2)/60/24/30/12);
                                System.out.println("The Month Difference is : " + (min3 - min2)/60/24/30);
                                System.out.println("The Day Difference is : " + ((min3 - min2)/60/24));
                                System.out.println("The Hour Difference is : " + ((min3 - min2)/60));
                                System.out.println("The Minutes Difference is : " + ((min3 - min2)));
                                System.out.println("The Seconds Difference is : " + ((min3 - min2)*60));
                                System.out.println("______________________________________________");
                            }
                            else
                            {
                                System.out.println("The Year Difference is : " + (min2 - min3)/60/24/30/12);
                                System.out.println("The Month Difference is : " + (min2 - min3)/60/24/30);
                                System.out.println("The Day Difference is : " + ((min2 - min3)/60/24));
                                System.out.println("The Hour Difference is : " + ((min2 - min3)/60));
                                System.out.println("The Minutes Difference is : " + ((min2 - min3)));
                                System.out.println("The Seconds Difference is : " + ((min2 - min3)*60));
                                System.out.println("______________________________________________");
                            }
                            break;

                        case 6:
                            System.out.println("______________________________________________\n");
                            System.out.print("Enter the first second: ");
                            int sec2 = input.nextInt();
                            
                            System.out.print("Enter the second second: ");
                            int sec3 = input.nextInt();
                            
                            System.out.println("Substracting biggest number to the smallest number...\n");
                            
                            if(sec3 >= sec2)
                            {
                                System.out.println("The Year Difference is : " + (sec3 - sec2)/60/60/24/30/12);
                                System.out.println("The Month Difference is : " + (sec3 - sec2)/60/60/24/30);
                                System.out.println("The Day Difference is : " + ((sec3 - sec2)/60/60/24));
                                System.out.println("The Hour Difference is : " + ((sec3 - sec2)/60/60));
                                System.out.println("The Minutes Difference is : " + ((sec3 - sec2)/60));
                                System.out.println("The Seconds Difference is : " + ((sec3 - sec2)));
                                System.out.println("______________________________________________");
                            }
                            else
                            {
                                System.out.println("The Year Difference is : " + (sec2 - sec3)/60/60/24/30/12);
                                System.out.println("The Month Difference is : " + (sec2 - sec3)/60/60/24/30);
                                System.out.println("The Day Difference is : " + ((sec2 - sec3)/60/60/24));
                                System.out.println("The Hour Difference is : " + ((sec2 - sec3)/60/60));
                                System.out.println("The Minutes Difference is : " + ((sec2 - sec3)/60));
                                System.out.println("The Seconds Difference is : " + ((sec2 - sec3)));
                                System.out.println("______________________________________________");
                            }
                            break;

                        default:
                            System.out.println("Invalid number");
                            System.out.println("______________________________________________");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("______________________________________________");
                    
                    int year;
                    int month;
                    int days;
                    Date d = new Date();
                    
                    System.out.print("Enter birth year: "); 
                    int validyear = 0;
                    do
                    {   
                        year = input.nextInt();
                        
                        if(year < 1900)
                        {
                            System.out.print("Invalid year. Reenter birth year: ");
                        }
                        else if(year > (d.getYear() + 1900))
                        {
                            System.out.print("Year not exist! Reenter birth year: ");
                        }
                        else
                        {
                            validyear++;
                        }
                    }
                    while(validyear != 1);
                    
                    System.out.print("Enter birth month: ");
                    int validmonth = 0;
                    do
                    {
                        month = input.nextInt();
                        
                        if(month < 1 || month > 12)
                        {
                            System.out.print("Invalid month. Reenter birth month: ");
                        }
                        else if(year == (d.getYear() + 1900) && month > (d.getMonth() + 1))
                        {
                            System.out.print("Month not exist! Reenter birth month: ");
                        }
                        else
                        {
                            validmonth++;
                        }
                    }
                    while(validmonth != 1);

                    System.out.print("Enter birth day: ");
                    int validday = 0;
                    do
                    {
                        days = input.nextInt();
                         
                        if(year % 4 == 0 && year % 400 == 0)
                        {
                            if(month == 2)
                            {
                                if(year == (d.getYear() + 1900) && month == (d.getMonth() + 1) && days > d.getDate())
                                {
                                    System.out.print("Day not exist! Reenter birth day: ");
                                }
                                else if(days > 0 && days < 30)
                                {
                                    validday++;
                                }
                                else
                                {
                                    System.out.print("Invalid day. Reenter birth day: ");
                                }
                            }
                            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                            {
                                if(year == (d.getYear() + 1900) && month == (d.getMonth() + 1) && days > d.getDate())
                                {
                                    System.out.print("Day not exist! Reenter birth day: ");
                                }
                                else if(days > 0 && days < 32)
                                {
                                    validday++;
                                }
                                else
                                {
                                    System.out.print("Invalid day. Reenter birth day: ");
                                }
                            }
                            if(month == 4 || month == 6 || month == 9 || month == 11)
                            {
                                if(year == (d.getYear() + 1900) && month == (d.getMonth() + 1) && days > d.getDate())
                                {
                                    System.out.print("Day not exist! Reenter birth day: ");
                                }
                                else if(days > 0 && days < 31)
                                {
                                    validday++;
                                }
                                else
                                {
                                    System.out.print("Invalid day. Reenter birth day: ");
                                }
                            }
                        }
                        else if(year % 4 != 0 || year % 400 != 0)
                        {
                            if(month == 2)
                            {
                                if(year == (d.getYear() + 1900) && month == (d.getMonth() + 1) && days > d.getDate())
                                {
                                    System.out.print("Day not exist! Reenter birth day: ");
                                }
                                else if(days > 0 && days < 29)
                                {
                                    validday++;
                                }
                                else
                                {
                                    System.out.print("Invalid day. Reenter birth day: ");
                                }
                            }
                            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                            {
                                if(year == (d.getYear() + 1900) && month == (d.getMonth() + 1) && days > d.getDate())
                                {
                                    System.out.print("Day not exist! Reenter birth day: ");
                                }
                                else if(days > 0 && days < 32)
                                {
                                    validday++;
                                }
                                else
                                {
                                    System.out.print("Invalid day. Reenter birth day: ");
                                }
                            }
                            if(month == 4 || month == 6 || month == 9 || month == 11)
                            {
                                if(year == (d.getYear() + 1900) && month == (d.getMonth() + 1) && days > d.getDate())
                                {
                                    System.out.print("Day not exist! Reenter birth day: ");
                                }
                                else if(days > 0 && days < 31)
                                {
                                    validday++;
                                }
                                else
                                {
                                    System.out.print("Invalid day. Reenter birth day: ");
                                }
                            }
                        }
                    }
                    while(validday != 1);
                        
                    System.out.println("\nDate of Birth: "+days+ "/" +month+ "/" +year);
                    System.out.println("");
                    System.out.println("Current Date: " + d.getDate() + "/" +(d.getMonth() + 1) + "/" +(d.getYear() + 1900));
                    
                    int finalyear;
                    int finalmonth;
                    int finaldays = 0;
                    if(month <= (d.getMonth() + 1))
                    {
                        finalyear = d.getYear() + 1900 - year;
                    }
                    else
                    {
                        finalyear = d.getYear() + 1900 - year - 1;
                    }
                    
                    if(days <= d.getDate())
                    {
                        finalmonth = d.getMonth() + 1 - month;
                    }
                    else
                    {
                        finalmonth = d.getMonth() + 1 - month - 1;
                    }
                    
                    if(days <= d.getDate())
                    {
                        finaldays = d.getDate() - days;
                    }
                    else
                    {
                        if(year % 4 == 0 && year % 400 == 0)
                        {
                            int[] dayinmonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                            finaldays = (dayinmonth[month-1] - days) + d.getDate();
                        }
                        else if(year % 4 != 0 || year % 400 != 0)
                        {
                            int[] dayinmonth2 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                            finaldays = (dayinmonth2[month-1] - days) + d.getDate();
                        }
                    }

                    System.out.println("");
                    System.out.println("Age: " +finalyear+ " years " +finalmonth+ " months " +finaldays+ " days ");
                    System.out.println("______________________________________________");
                    break;


                default:
                    break;
            }
        }
        while(num != 4);
        
        int rate;
        
        do
        {
            System.out.println("Please rate our project(1~5): ");
            rate = input.nextInt();
        }
        while (rate < 1 || rate > 5); 
        
        System.out.println("Thanks for your rating! Bye!");
    }
    
}
