
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class DemoNullPointerArrayException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Date d = null;
            System.out.println(d.toString());
            String[] Array = null;
            System.out.println(Array[0]);
            
            //Array out of bound exception
            String[] Array1 = new String[2];
            System.out.println(Array[2]);
            //ArrayIndexOutOfBoundsException
        }catch(NullPointerException A){
            System.out.println(A.getMessage());
        }
    }
    
}
