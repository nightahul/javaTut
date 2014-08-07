/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hoder
 */

//constructor in Java
class Point {
    private double x;
    private double y;
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void print()
    {
        System.out.println("(" + x + "," + y + ")");
    }
    
    public void scale()
    {
        x = x/2;
        y = y/2;
    }
    
}
public class Main {
    public static void main(String[] args)
    {
        Point p = new Point(32, 32);
        p.print();
        p.scale();
        p.print();
    }
}
