/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo4;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoder
 */
public class worker {
    
    private Random r = new Random();
    
    private Object lock1 = new Object();
    private Object lock2 = new Object();
   
    private List<Integer> l1 = new ArrayList<>();
    private List<Integer> l2 = new ArrayList<>();
    
    public void stageone()
    {
        synchronized(lock1)
        {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }
            l1.add(r.nextInt(100));
            
        }
    }
    
    public void stagetwo()
    {
        synchronized(lock2)
        {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(worker.class.getName()).log(Level.SEVERE, null, ex);
            }
            l2.add(r.nextInt(100));
            
        }
    }
    
    public void process()
    {
        for(int i =0; i< 1000; i++)
        {
            stageone();
            stagetwo();
        }
    }
    
    public void main()
    {
        System.out.println("Starting ...");
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start));
        System.out.println("List1: " + l1.size() + "; List2: " + l2.size());
    }
    
    
}
