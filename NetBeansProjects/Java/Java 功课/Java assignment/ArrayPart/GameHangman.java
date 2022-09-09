/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamehangman;

/**
 *
 * @author William
 */
import java.util.*;
public class GameHangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String [] words = {"words","length","char","array","booblean","happy","random","break","fales","true","repeat","system"};
        String ans;
        
        do{
            int a  = intRandom(0,words.length-1);
            char [] word = words[a].toCharArray();
            boolean [] mask = new boolean[word.length];
            int numberOfCorrectGuess=0;
            int numberOfMisses=0;
            while(numberOfCorrectGuess != word.length){
                System.out.print("(Guess)Enter a letter in word ");
                //display result
                for(int b=0;b<word.length;b++){
                    if(mask[b]){
                        System.out.print(word[b]);
                    }else{
                        System.out.print("*");
                    }
                }
                System.out.print(">");
                char guess = input.next().charAt(0);
                //check
                boolean miss=true;
                boolean repeat=false;
                for(int b=0;b<word.length;b++){
                    if(word[b]==guess){
                        if(mask[b]!=true){
                            mask[b]=true;
                            numberOfCorrectGuess++;
                        }else{
                            repeat=true;
                            break;
                        }miss=false;
                    }
                }
                if(miss){
                    numberOfMisses++;
                }
                if(repeat){
                    System.out.println(guess+" is alreay in the word. ");
                }
            }
                System.out.println("The word is "+ String.valueOf(word)+
                        ". You missed "+numberOfMisses+" time");
                System.out.print("Do you want to guess another word? Enter y or n>");
                ans=input.next();
        }while(ans.charAt(0)!='n');
    }
    public static int intRandom(int lowerBound,int upperBound){
        return (int)(lowerBound+Math.random()*(upperBound-lowerBound+1));
    }
}
