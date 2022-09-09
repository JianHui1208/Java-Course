/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingparemeters;

/**
 *
 * @author William
 */
public class PassingParemeters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nPrintln("Computer Science",15);
        ali();
        System.out.println(abu());
        System.out.println(akau("abu"));
    }
    public static void nPrintln(String message,int n) {
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }
    
    public static void ali(){
    System.out.println("Hello Ali");
    }
    
    public static String abu(){
    return "hello abu abu";
    }
    
    public static String akau(String a){
        return a+"akau";
    }
}
