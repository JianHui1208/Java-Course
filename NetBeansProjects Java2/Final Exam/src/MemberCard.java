/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class MemberCard {
    String CardNumber;
    String CardHolderName;
    int point;
    public MemberCard(){}
    
        public void setCardNumber(String NewCardNumber){
            CardNumber=NewCardNumber;
        }
        
        public void setCardHolberName(String newCardHolderName){
            CardHolderName=newCardHolderName;
        }
        
        public String getCardNumber(){
            return CardNumber;            
        }
        
        public String getCardHolberName(){
            return CardHolderName;
        }
        
        public int redeemPoint(int Originalpoint,int newPoint){
            int finalPoint = 0;
            if(Originalpoint == 1000){
                finalPoint = 1000 - newPoint;
            }
            if(Originalpoint == 500){
                finalPoint = 500 - newPoint;
            }
            return finalPoint;
        }
        
        public boolean isRedeemPoint(int newPoint){
            String A = "";
                    if(newPoint > 500){
                        A = "false";
                    }else{
                        A = "true";
                    }
                    if(newPoint > 1000){
                        A = "false";
                    }else{
                        A = "true";
                    }
            boolean b = Boolean.parseBoolean(A);
            return b;
        }
}
