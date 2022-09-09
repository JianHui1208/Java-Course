/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;
import java.util.*;
/**
 *
 * @author User
 */
public class Main extends Rectangle{
    int length;
    int width;   
    static List<Rectangle>arrRect;
 //step2
    Rectangle rect1 = new Rectangle(length, width);
    Rectangle rect2 = new Rectangle(length, width);
    Rectangle rect3 = new Rectangle(length, width);

//step3
    ArrayList<Rectangle> arrRect = new ArrayList<Rectangle>();

    arrRect.add(rect1);
    arrRect.add(rect2);
    arrRect.add(rect3);
    
    for (int k =0; k<arrRect.size();k++){
        int area = arrRect[k].calcArea();
    }   
}
