/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unorderedArray;

/**
 *
 * @author echoC
 */
public class HighArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int maxSize = 100; //array size
        HighArray arr; //ref to array
        arr = new HighArray(maxSize); //create array
        arr.insert(77);  //insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        
        arr.display(); //display items
        
        long searchKey = 35; //search for item
        
        System.out.println(arr.find(searchKey));
        System.out.println();
        
        
        arr.delete(00); //delete 3 items
        arr.delete(55);
        arr.delete(99);
        
        arr.display(); //display items again
    }//end main
}//end class HighArrayApp
