/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoder
 */
public class keyword_synchronized {
    
    private int count = 0;
    
    private synchronized void increment()
    {
        count++;
    }
    
    public static void main(String[] args)
    {
        keyword_synchronized app = new keyword_synchronized();
        app.doWork();
    }
    
    public void doWork()
    {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0;i<10000;i++)
                    increment();
            }
        });
        
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0;i<10000;i++)
                    increment();
            }
        });
        
        t1.start();
        t2.start();
        
        
        try {
            t1.join();
            t2.join();//When the main thread calls t1.join() it will stop running and wait for the t1 thread to finish.
        } catch (InterruptedException ex) {
            Logger.getLogger(keyword_synchronized.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("count is " + count);
    }
    
}
