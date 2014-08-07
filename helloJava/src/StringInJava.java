/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoder
 */
public class StringInJava {
    
    public static void main(String[] args)
    {
        String s1 = "rahul ";
        String s2 = "nangia";
        System.out.println(s1+s2);
        
        int me = 94;
        
        System.out.println(s1+ me);
        
        equalsTutorial();
        
    }
    
    public static void equalsTutorial()
    {
        String s1;
        s1 = "Rahul";
        String s2 = new String("Rahul");
        
        String s3 = s1;
        
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s2));
        
    }
    
}
