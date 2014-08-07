/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadTutorial;

import java.util.logging.Level;
import java.util.logging.Logger;

class Runner extends Thread
{

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hello " + i);
            try {
 
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
public class tut1 {

    public static void main(String[] args)
    {
        Runner r1 = new Runner();
        r1.start();
        Runner r2 = new Runner();
        r2.start();
    }
    
}
