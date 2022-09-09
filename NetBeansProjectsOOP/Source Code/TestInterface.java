
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TestInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Animal());
        list.add(new Chicken());
        list.add(new Tiger());
        list.add(new Fruit());
        list.add(new Apple());
        list.add(new Orange());
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i) instanceof Edible){
                //display the class name
                System.out.print(list.get(i).getClass()+" ");
                Edible o = (Edible) list.get(i);
                System.out.println(o.howToEat());
            }
        }
    }
    
}
