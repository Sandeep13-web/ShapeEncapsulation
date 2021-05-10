package org.personal.Q1;

import java.util.Scanner;

abstract class Shape {
    abstract void RectangleArea(double l, double b);
    abstract void SquareArea(double s);
    abstract void CircleArea(double r);
}

class forArea extends Shape{
    @Override
    void RectangleArea(double l, double b){
        double area = l*b;
        System.out.println("Area of Rectangle: "+area);
    }
     
    @Override
    void SquareArea(double s){
        double area = s*s;
        System.out.println("Area of Square: "+area);
    }
     
    @Override
    void CircleArea(double r){
        double area = 3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }
}

class Area {
    public static void main(String args[]){
        double l, b, r, s;
        forArea area = new forArea();
        Scanner get = new Scanner(System.in);
        System.out.println("Please choose a shape to find Area: ");
        System.out.println("1. -> Rectangle");
        System.out.println("2. -> Square");
        System.out.println("3. -> Circle");
        
        int shapechoice = get.nextInt();
        
        switch (shapechoice){
            case 1:
                System.out.println("Enter Length of Rectangle");
                l = get.nextDouble();
                System.out.println("Enter Breadth of Rectangle");
                b = get.nextDouble();
                
                area.RectangleArea(l, b);
                break;
            
            case 2:
                System.out.println("Enter Length of a Square");
                s = get.nextDouble();
                area.SquareArea(s);
                break;
                
            case 3:
                System.out.println("Enter Radius of Circle");
                r = get.nextDouble();
                area.CircleArea(r);
                break;
            default:
                System.out.println("Enter Length of Rectangle");
                l = get.nextDouble();
                System.out.println("Enter Breadth of Rectangle");
                b = get.nextDouble();
                
                area.RectangleArea(l, b);
                
        }
    }
}
