/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoder
 */
public class ExceptionTut {
    public static void main(String[] args)
    {
        try
        {
            int []arr = new int[10];
            System.out.println(arr[100]);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
