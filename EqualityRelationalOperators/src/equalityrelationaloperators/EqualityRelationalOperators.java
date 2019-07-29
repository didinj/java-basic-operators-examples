/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalityrelationaloperators;

/**
 *
 * @author didin
 */
public class EqualityRelationalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Greater Than Operator */
        int a = 20;
        int b = 10;
        if (a > b)
            System.out.println(true);
        
        /* Greater Than or Equal Operator */
        int c = 20;
        int d = 20;
        if (c >= d)
            System.out.println(true);
        
        /* Less Than Operator */
        int e = 10;
        int f = 20;
        if (e < f)
            System.out.println(true);
        
        /* Less Than or Equal Operator */
        int g = 20;
        int h = 20;
        if (g <= h)
            System.out.println(true);
        
        /* Equal Operator */
        int i = 20;
        int j = 20;
        if (i == j)
            System.out.println(true);
        
        /* Not Equal Operator */
        int k = 20;
        int l = 10;
        if (k != l)
            System.out.println(true);
    }
    
}
