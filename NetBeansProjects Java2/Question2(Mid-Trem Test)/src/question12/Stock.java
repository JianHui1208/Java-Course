/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

/**
 *
 * @author William
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Stock extends Question12{
    int Symbol;
    String Name;
    double PreviousClosingPrice;
    double CurrentPrice;
    double Percent;
        public Stock(){
        }
        public Stock(int symbol,String name,double previousClosingPrice,double currentPrice){
            setSymbol(symbol);
            setName(name);
            setpreviousClosingPrice(previousClosingPrice);
            setCurrentPrice(currentPrice);
        }
        public void setSymbol(int symbol){
            Symbol=symbol;
        }
        public void setName(String name){
            Name=name;
        }
        public void setpreviousClosingPrice(double previousClosingPrice){
            PreviousClosingPrice = previousClosingPrice;
        }
        public void setCurrentPrice(double currentPrice){
            CurrentPrice = currentPrice;
        }
        public int getSymbol(){
            return Symbol;
        }
        
        public String getName(){
            return Name;
        }
        
        public double getPreviousClosingPrice(){
            return PreviousClosingPrice;
        }
        
        public double getCurrentPrice(){
            return CurrentPrice;
        }
        
        public double changePercent(){
            return Percent =  ((CurrentPrice - PreviousClosingPrice)/PreviousClosingPrice)*100;
        }
        
    @Override
        public String toString(){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String M = String.format("%.2f", changePercent());
            String MSG= dateFormat.format(date) +"\n"+ getSymbol() + "(" + getName() + ")" +
                    "\nPrevious Closing Price: " + getPreviousClosingPrice()
                    + "\nCurrent Price: " + getCurrentPrice()
                    + "\n"+ M + "%";
            return MSG;
        }
}
