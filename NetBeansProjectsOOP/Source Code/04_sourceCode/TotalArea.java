/**
 * @(#)TotalArea.java
 *
 *
 * @author 
 * @version 1.00 2010/4/11
 */


public class TotalArea {

	public static void main(String[] args){
		//declare circleArray
		Circle[] circleArray;
		
		//create circleArray
		circleArray = createCircleArray();
		
		//print circleArray and total area of the circles
		printCircleArray(circleArray);	
	}
	
	public static Circle[] createCircleArray(){
		Circle[] circleArray = new Circle[10];
		
		for(int i=0; i<circleArray.length; i++){
			circleArray[i] = new Circle(Math.random() * 100);
		}
		
		//return circleArray
		return circleArray;
	}
	
	//print an array of circles and their total area
	public static void printCircleArray(Circle[] circleArray){
		System.out.println("Radius\t\t\t\t"+ "Area");
		for (int i=0; i< circleArray.length; i++){
			System.out.println(circleArray[i].getRadius() + "\t\t" + circleArray[i].findArea() + '\n');
		}	
			
		System.out.println("---------------");
		
		//compute and display the result
		System.out.println("The total areas of circles is \t" + sum(circleArray));
	}
	
	//add circle areas
    public static double sum(Circle[] circleArray) {
    	//initialize sum
    	double sum=0;
    	
    	//add area to sum
    	for (int i=0; i< circleArray.length; i++){
			sum += circleArray[i].findArea();
		}
		
		return sum;
    }
    
}