/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamescraps;

/**
 *
 * @author William
 */
public class GamesCraps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int roll1 = rollDie();
        int roll2 = rollDie();
        System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + (roll1 + roll2));
        System.out.println(getStats(roll1 + roll2));
    }

    public static String getStats(int n) {

        if (n == 7 || n == 11) return "You win.";
        if (n == 2 || n == 3 || n == 12) return "You lose.";

        return "point is " + n;

    }

    public static int rollDie() {

        return (int) (Math.random() * 6 + 1);
    }
}