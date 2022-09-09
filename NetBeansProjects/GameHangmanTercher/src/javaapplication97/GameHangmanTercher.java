/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication97;

/**
 *
 * @author William
 */
import java.util.*;
public class GameHangmanTercher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean correct=true;
        //library for hangman game
        String [] words ={"that","write","program"};
        char n;                                          
        do{
            int missCount=0;
            //random the question for quess
            int index = (int)(Math.random()*words.length); //index=1
            String word=words[index]; //word=w r i t e
            char [] wordss=new char[word.length()]; //word.length()=5 
            //wordss[0]='' wordss[1]='' wordss[2]='' wordss[3]='' wordss[4]=''
            for(int a=0;a<wordss.length;a++){
                wordss[a]=word.charAt(a);
            }
            //wordss[0]='w' wordss[1]='r' wordss[2]='i' wordss[3]='t' wordss[4]='e'
            char [] asWord=new char[wordss.length];
            for(int a=0;a<asWord.length;a++){
                asWord[a]='*';
            }
            //asWord[0]='*' asWord[1]='*' asWord[2]='*' asWord[3]='*' asWord[4]='*'
            do{
                boolean miss=true;
            	boolean repeat=false;
                correct=true;
                System.out.print(" (Guess) Enter a letter in word ");
                for(int a=0;a<asWord.length;a++){
                    System.out.print(asWord[a]);
                }
                System.out.print(" > ");
                String answer= input.next();
                char ans=answer.charAt(0);

                for(int a=0;a<asWord.length;a++){
                    if(wordss[a]==ans){
			if(asWord[a]==ans){
				repeat=true;
			}else{
				asWord[a]=ans;
			}
                       asWord[a]=ans; 
                       miss=false;
                    }
                    if(asWord[a]=='*'){
                        correct=false;
                    }
                }
                if(miss){
                    System.out.println("\t"+ans+" is not in the word ");
                    missCount++;
                }
		if(repeat){
                    System.out.print("\t" +ans+" is already in the word "+"\n");
                    missCount++;
		}
            }while(correct!=true);
            System.out.println("The word is "+word +". You missed "+ missCount+" time");
            System.out.println("Do you want to guess another word? Enter y or n>");
            String y=input.next();
            n=y.charAt(0);
        }while(n!='n');
    }
        
    }