/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpassword.byteacher;

/**
 *
 * @author William
 */
import java.util.*;
public class CheckPasswordBYteacher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = input.nextLine();
        if(checkPassword(password)){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }
    }
    public static boolean checkPassword (String password){
        int countDigit=0;
        int countletter=0;
        if(password.length()>8){
            return false;
        }else{
            for(int a=0;a<password.length();a++){
            if(Character.isDigit(password.charAt(a))){
                countDigit++;
            }else if(Character.isLetter(password.charAt(a))){
                countletter++;
            }else{
                return false;
            }
        }
            if(countDigit<2){
                return false;
            }
        }
            return true;
    }
}
