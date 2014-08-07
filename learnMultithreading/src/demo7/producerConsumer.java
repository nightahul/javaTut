/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo7;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoder
 */
public class producerConsumer {
    
    private static BlockingQueue<Integer> q = new ArrayBlockingQueue<>(10);
    
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException ex) {
                    Logger.getLogger(producerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException ex) {
                    Logger.getLogger(producerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(producerConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
      
    
    
    private static void producer() throws InterruptedException
    {
        Random r = new Random();
        
        
        
        while(true)
        {
            q.put(r.nextInt(100));
        }
        
    }
    
    private static void consumer() throws InterruptedException
    {
        Random r = new Random();
        while(true)
        {
            if (r.nextInt(10) == 0) {
                Integer value = q.take();//if queue is empty waits
                System.out.println("Taken value: " + value + "; Queue size is: " + q.size());
            }
        }
    }
    
}
