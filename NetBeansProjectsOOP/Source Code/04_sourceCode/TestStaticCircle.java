/**
 * @(#)Text2.java
 *
 *
 * @author 
 * @version 1.00 2010/4/16
 */


public class TestStaticCircle {   
   
    public static void main(String[] args) {
       StaticCircle c1 = new StaticCircle(5.0);
       System.out.println("c1.getNumberOfObjects():"
       	+ c1.getNumberOfObjects());  
       StaticCircle c2 = new StaticCircle();
       System.out.println("c2.getNumberOfObjects():"
       	+ c2.getNumberOfObjects());  
       StaticCircle c3 = new StaticCircle();
       System.out.println("c3.getNumberOfObjects():"
       	+ c3.getNumberOfObjects());  
       
       System.out.println("Number of circle object created:"
       	+ StaticCircle.getNumberOfObjects());  
       	
       	System.out.println("Show the numberOfObject for each circle object after"+
       		" we have created three instance for it:");  	
       	System.out.println("c1.getNumberOfObjects():"
       	+ c1.getNumberOfObjects());  
       	System.out.println("c2.getNumberOfObjects():"
       	+ c2.getNumberOfObjects());  
       	System.out.println("c3.getNumberOfObjects():"
       	+ c3.getNumberOfObjects());  
       		
      StaticCircle c4 = new StaticCircle();
      System.out.println("c4.getNumberOfObjects():"
       	+ StaticCircle.getNumberOfObjects());  
    }    
    
}

