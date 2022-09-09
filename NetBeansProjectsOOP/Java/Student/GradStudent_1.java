
package Gradstudent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GradStudent extends Student{
    private String prevUni;
    private double ugCGPA;
    private char Grade;
    private double Points;
    
    public GradStudent(){
        prevUni = null;
        ugCGPA = 0;
    }
    public GradStudent(String prevUni,double ugCGPA){
        super();
        this.prevUni=prevUni;
        this.ugCGPA=ugCGPA;
    }
    public GradStudent GradStudent(GradStudent gs1){
        GradStudent gs2 = gs1;
        return gs2;
    }
    public double calcGPA(String[] grade, int[] credit) {
        double cgpa = 0;
        double Tcredit = 0;
        double Tpoint = 0;
        double[] point = new double[grade.length];
        for (int i = 0; i < grade.length; i++) {
            switch (grade[i]) {
                case ("A"):
                    point[i] = 4.00;
                    break;
                case ("B"):
                    point[i] = 3.00;
                    break;
                case ("C"):
                    point[i] = 2.00;
                    break;
                case ("D"):
                    point[i] = 1.00;
                    break;
                case ("F"):
                    point[i] = 0.00;
                    break;               
                default:
                    System.out.println("Error Input Grade");
            }
        }
        return cgpa;
    }
    public void setPrevUni(String prevUni){
        this.prevUni=prevUni;
    }
    public void setUgCGPA(double ugCGPA){
        this.ugCGPA=ugCGPA;
    }
    public String getPrevUni(){
        return this.prevUni;
    }
    public double getUgCGPA(){
        return this.ugCGPA;
    }
    public String toString(){
        return toString()+prevUni +"\n"+ ugCGPA;
    }
    
    public static void main(String []args){
      
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Student Name : ");
        String name1 = input.nextLine();

        System.out.print("Enter The Student ID : ");
        String I1 = input.nextLine();

        System.out.print("Enter The Student Previous University : ");
        String p1 = input.nextLine();

        System.out.print("Enter The Student Undergraduate CGPA : ");
        double u1 = input.nextDouble();
        
        System.out.println("Enter number of subjects");
        int n=input.nextInt();
        int [] credit=new int[n];
        String [] grade = new String[n];
        
     for(int i=0;i<n;i++)
     {
         System.out.println("Enter credit:");
         credit[i]=input.nextInt();
         System.out.println("Enter grade:");
         grade[i]=input.next();
     }
        Student S1 = new Student(name1,I1);
        GradStudent SG1 = new GradStudent(p1,u1);
        System.out.println(S1.toString());
        System.out.println(S1.calcGPA(grade, credit));

System.out.print("Enter Your Student Name : ");

        String name2 = input.nextLine();
        System.out.print("Enter Your Student ID : ");
        String I2 = input.nextLine();

        System.out.print("Enter Your Student Previous University : ");
        String p2 = input.nextLine();

        System.out.print("Enter Your Student Undergraduate CGPA : ");
        double u2 = input.nextDouble();
        
        System.out.println("Enter number of subjects");
        int n2=input.nextInt();
        int [] credit2=new int[n2];
        String [] grade2 = new String[n2];
        
     for(int i=0;i<n;i++)
     {
         System.out.println("Enter credit:");
         credit[i]=input.nextInt();
         System.out.println("Enter grade:");
         grade[i]=input.next();
     }
        Student S2 = new Student(name2,I2);
        GradStudent SG2 = new GradStudent(p2,u2);
        System.out.println(S2.toString());
        System.out.println(S2.calcGPA(grade, credit));
        
        Student S3 = S2.copy();
    }
}
