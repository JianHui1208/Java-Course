/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpantten;

/**
 *
 * @author William
 */
public class NUmberPantten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pattern A:");
        for(int a=1; a<=7;a++){
            for(int b=1;b<=a;b++){
                System.out.print(b+" ");
            }
            System.out.println("");
        }
        
        System.out.println("Pattern B:");
        for(int a=1; a<=7;a++){
            for(int b=1;b<=8-a;b++){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        
        System.out.println("Pattern C");
        for(int a=1;a<=7;a++){
            for(int b=1;b<=7-a;b++){
                System.out.print("  ");
            }
            for(int c=a;c>=1;c--){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        
         System.out.println("patten D");
         for(int i = 1; i<=7;i++){
             for(int k=i;k>1;k--){
                 System.out.print("  ");
             }
             for(int j=1; j<=8-i;j++){
                 System.out.print(j+" ");
             }
             System.out.println();
         }
    }
    
}
