/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hellojava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoder
 */
public class listInJava {
    
    private static List<Integer> l1 = new ArrayList<Integer>();
    
    public static void main(String[] args)
    {
        l1.add(23);
        l1.add(1);
        for(Integer i: l1)
        {
            System.out.println(i);
        }
        
        
    }
    
}
