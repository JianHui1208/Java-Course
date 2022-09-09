/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetest;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author William
 */
public class TimeTest {
static int interval;
static Timer timer;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Input Seconds=>: ");
        interval = input.nextInt();
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        System.out.println(interval);
        timer.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {
            System.out.println(setInterval());
        }
        }, delay, period);
}

        static final int setInterval() {
            if (interval == 1)
                timer.cancel();
            return --interval;
        }
}
