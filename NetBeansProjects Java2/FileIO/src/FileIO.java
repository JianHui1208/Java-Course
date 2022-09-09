
import java.io.File;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //absolute path => exact location
        //File file = new File("D:\\PROG1103\\FileIO");
        
        //relative path
//        File file = new File("file/a.pdf");
//        File file = new File("number.txt");
//        System.out.println(file.exists());
//        
//        System.out.println("You are Member. Get 20% Discount!!🙂");
//        System.out.println("Does it exist? " + file.exists());
//        System.out.println("The file has " + file.length() + " bytes");
//        System.out.println("Can it be read? " + file.canRead());
//        System.out.println("Can it be written? " + file.canWrite());
//        System.out.println("Is it a directory? " + file.isDirectory());
//        System.out.println("Is it a file? " + file.isFile());
//        System.out.println("Is it absolute? " + file.isAbsolute());
//        System.out.println("Is it hidden? " + file.isHidden());
//        System.out.println("Absolute path is " +
//        file.getAbsolutePath());
//        System.out.println("Last modified on " +
//        new java.util.Date(file.lastModified()));
//        System.out.println();
//        int TotalPrice = 0;
//        int alltotal = 30;
//        boolean ControlKeyword = false;
//        
//        if(ControlKeyword){
//            TotalPrice = alltotal * 80/100;
//        }else{
//            TotalPrice = alltotal;
//        }
//        
//        System.out.println(TotalPrice);
            int[] array = {1,2,2,8,64,765};
            for(int i=0;i<array.length;i++){
                if(array[i]!=0){
                    array[i] = 0;
                }
                System.out.println(array[i]);
            }
    }
    
}
