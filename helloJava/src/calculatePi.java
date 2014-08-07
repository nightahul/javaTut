/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoder
 */
public class calculatePi {
    
    
    public static void main(String []args)
    {
        double mypi = 4;
        double d = 3.0;
        double i = 1;
        while(i <= 999)
        {
            mypi += Math.pow(-1, i) * 4/d;
            System.err.println(mypi);
            d+=2;
            i+=1;
        }
        System.out.println("value of pi is " + mypi);
    }
    
}
