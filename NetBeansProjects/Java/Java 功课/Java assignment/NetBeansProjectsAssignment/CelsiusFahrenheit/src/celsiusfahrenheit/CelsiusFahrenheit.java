/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiusfahrenheit;

/**
 *
 * @author William
 */
public class CelsiusFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Celsius   Fahrenheit   |   Fahrenheit   Celsius\n" + 
                "-----------------------------------------------");
        for (double Celsius = 40.0, Fahrenheit = 120.0;
                Celsius >=31.0; Celsius--,Fahrenheit-=10){
            System.out.printf("\n%-10.1f",Celsius);
            System.out.printf("%-13.1f|",celsiusToFahrenheit(Celsius));
            System.out.printf("     %-13.1f",Fahrenheit);
            System.out.printf("%-7.2f\n",fahrenheitToCelsius(Fahrenheit));
            
        }
    }
    public static double celsiusToFahrenheit(double Celsius){
        return (9.0/5)*(Celsius+32);
    }
    public static double fahrenheitToCelsius(double Fahrenheit){
        return (5.0/9)*(Fahrenheit-32);
    }
}
