/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hellojava;

/**
 *
 * @author hoder */
class Shape
{
    public double area()
    {
        return 0;
    }
}

class Circle extends Shape
{
    private static double Pi = 3.14;
    private double diameter;
    
    public Circle(double diameter)
    {
        this.diameter = diameter;
    }
    
    public double area()
    {
        return Pi * (diameter/2)*(diameter/2);
    }
    
}

class Rectangle extends Shape
{
    private double l;
    private double b;
    
    public Rectangle(double l, double b)
    {
        this.l = l;
        this.b = b;
    }
    
    public double area()
    {
        return l*b;
    }
}
public class Main {
    public static void main(String[] args)
    {
        Shape s1 = new Circle(5);
        Rectangle s2 = new Rectangle(4, 3);
        System.out.println(s1.area());
        System.out.println(s2.area());
    }    
}
