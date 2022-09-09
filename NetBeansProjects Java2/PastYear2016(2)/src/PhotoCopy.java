/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class PhotoCopy {
    String Name;
    char code;
    int numOfPages;
    String Type;
    public PhotoCopy(){}
    
    public void setName(String newName){
        Name = newName;
    }

    public void setPages(int newPages){
        numOfPages = newPages;
    }
    
    public String getName(){
        return Name;
    }
    
    public int getPages(){
        return numOfPages;
    }
    
    public char getCode(String newType){
        Type = newType;
        char [] Array = Type.toCharArray();
        for(int i = 0; i < Array.length; i++){
            if(Array[i] == 'C'){
            code = 'C';
            }else if(Array[i] == 'B'){
            code = 'B';
            }
        }
        return code;
    }
    
    public String getType(){
        String StrType = "";
        if(code == 'C'){
            StrType = "Color";
        }else if(code == 'B'){
            StrType = "Black";
        }
        return StrType;
    }
    
    public double calculatePrintingCost(){
        double price = 0;
        
        if(code == 'C'){
            if(numOfPages >=1 || numOfPages <=10){
                price = numOfPages*0.5;
            }else if(numOfPages >=11 || numOfPages <=20){
                price = numOfPages*0.4;
            }else if(numOfPages >20){
                price = numOfPages*0.3;
            }
        }
        
        if(code == 'B'){
            if(numOfPages >=1 || numOfPages <=100){
                price = numOfPages*0.05;
            }else if(numOfPages >=101 || numOfPages <=200){
                price = numOfPages*0.04;
            }else if(numOfPages >200){
                price = numOfPages*0.03;
            }
        }
        return price;
    }
    
    @Override
    public String toString(){
        String MSG = "Name: " + getName() + "\n" +
                "Type of printing: " + getType() + "\n" +
                "Number of pages: " + getPages() + "\n" +
                "Printing cost: $" + calculatePrintingCost();
        return MSG;
    }
}
