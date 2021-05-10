package org.personal.Q2;

public class ExceptionDemo {
    public static void main(String[] args) {
        //for nullpointer exception
        try{
           String name = null; 
            System.out.println("Uppercase" + name.toUpperCase());
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException is handeled!!"+ " --> " + e);
        }
        System.out.println("----------------------------------------");
        
        
        //for arithmetic exception
        try
        {
            int a= 5/0;
            System.out.println("Equals: " + a);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException is handeled!!" + " --> " + e);
        }
        System.out.println("----------------------------------------");
        
        
        //for Array out of bounds exception
        try{
            int a[]=new int[8];
            //Array has only 10 elements
            a[10] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println ("ArrayIndexOutOfBounds is handeled!!" + " --> " + e);
        }

    }
    
}
