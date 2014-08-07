/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoder
 */
public class arrayinJava {
    public static void main(String[] args)
    {
        int []arr = {1, 2, 3};
        int []brr = new int[20];
        System.out.println(arr.length);
        System.out.println(brr.length);
        
        for(int i =0;i <arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
        for(int e : arr)
        {
            System.out.println(e);
        }
    }
    
}
