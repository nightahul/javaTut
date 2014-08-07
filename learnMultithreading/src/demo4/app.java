/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo4;

/**
 *
 * @author hoder
 */
public class app {
    public static void main(String[] args)
    {
        System.out.println("Synchronized obj");
        worker w1 = new worker();
        w1.main();
        
        System.out.println("Synchronized methods");
        slowWorker w2 = new slowWorker();
        w2.main();
                
    }
    
}
