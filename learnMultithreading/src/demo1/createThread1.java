/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo1;

/**
 *
 * @author hoder
 */
//create thread by implementing a runnable
public class createThread1 {
    
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0;i<100000;i++)
                    System.out.println(i);//To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i=0;i<10;i++)
                    System.out.println(i);//To change body of generated methods, choose Tools | Templates.
            }
        });
        
        t1.start();
        t2.start();
        
    }
}
