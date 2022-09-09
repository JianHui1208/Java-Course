
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TestComparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Circle c1 = new Circle(5);
//        Circle c2 = new Circle(10);
//        
//        //c1 = object 1, c2 = object 2
//        System.out.println(c1.compareTo(c2));
        
        ArrayList<Circle> list = new ArrayList<Circle>();
        list.add(new Circle(5));
        list.add(new Circle(10));
        list.add(new Circle(1));
        list.add(new Circle(8));
        list.add(new Circle(2));
        
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getRadius());
        }
    }
    
}
