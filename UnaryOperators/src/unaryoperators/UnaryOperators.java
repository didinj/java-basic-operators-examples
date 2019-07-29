/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unaryoperators;

/**
 *
 * @author didin
 */
public class UnaryOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Unary Plus Operator */
        int a = +1;
        System.out.println(a);
        
        /* Unary Minus Operator */
        int b = -1;
        System.out.println(b);
        
        /* Unary Increment Operator */
        int c = 10;
        c++;
        System.out.println(c);
        
        /* Unary Decrement Operator */
        int d = 10;
        d--;
        System.out.println(d);
        
        /* Unary Logical Complement Operator */
        boolean status = true;
        System.out.println(!status);
    }
    
}
