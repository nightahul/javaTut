/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoder
 */
public class functions {

    private static void wrongSwap(String s1, String s2) {
        
        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println(s1);
        System.out.println(s2);
    }
    //when passing parameters to a function, primitive content is copied but objects are not copied and are passed by reference
    
    public static void main(String[] args)
    {
        System.out.println(addthem(5, 3));
        String s1 = "Rahul";
        String s2 = "Yum";
        wrongSwap(s1, s2);
        System.out.println(s1);
        System.out.println(s2);
        
    }
    
    public static int addthem(int a, int b)
    {
        return a+b;
    }
    
}
