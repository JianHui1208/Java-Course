/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test123;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author William
 */
public final class Stock extends Test123{
    int Symbol;
    String Name;
    double PreviousClosingPrice;
    double CurrentPrice;
    double ChangePercent;
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
            return ChangePercent =  ((CurrentPrice - PreviousClosingPrice)/PreviousClosingPrice)*100;
        }
        
        public String toString(){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String MSG= dateFormat.format(date) +"\n"+ getSymbol() + "(" + getName() + ")" +
                    "\nPrevious Closing Price: " + getPreviousClosingPrice()
                    + "\nCurrent Price: " + getCurrentPrice()
                    + "\n" + changePercent();
            return MSG;
        }
}
