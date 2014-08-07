/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo4;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

/**
 *
 * @author hoder
 */
public class slowWorker {
    
    private List<Integer> l1 = new ArrayList<>();
    private List<Integer> l2 = new ArrayList<>();
    private Random r = new Random();
    public synchronized void stageone()
    {
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(slowWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        l1.add(r.nextInt(100));
        
    }
    
    public synchronized void stagetwo()
    {
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(slowWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        l2.add(r.nextInt(100));
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