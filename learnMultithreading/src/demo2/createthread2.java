/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoder
 * create thread by extending thread class
 */

class ThreadB extends Thread
{

    @Override
    public void run() {
        for(int i =0;i<10;i++)
        {
            System.out.println(i);
            try {
                
                
                
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadB.class.getName()).log(Level.SEVERE, null, ex);
            }

            
           
        }
    }
    
}
public class createthread2 {
    public static void main(String[] args)
    {
        ThreadB x = new ThreadB();
        ThreadB y = new ThreadB();
        x.start();
        y.start();
    }

}
