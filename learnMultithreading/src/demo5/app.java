/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo5;//thread pool

import java.awt.BorderLayout;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoder
 */

class Processor implements Runnable
{
    private int id;
    
    Processor(int id)
    {
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("starting "+ id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Processor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("completed "+ id);
        
    }
    
}
public class app {
    public static void main(String[] args)
    {
        ExecutorService exec = Executors.newFixedThreadPool(4);
        System.out.println("Submitting tasks");
        for(int i=0;i<5;i++)
        {
            exec.submit(new Processor(i));
        }
        
        exec.shutdown();
        
        try {
            exec.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Tasks completed");
        
        
    }
}
