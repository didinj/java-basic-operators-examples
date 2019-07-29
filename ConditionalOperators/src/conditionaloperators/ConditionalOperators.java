/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionaloperators;

/**
 *
 * @author didin
 */
public class ConditionalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Conditional-AND Operator "&&" */
        int a = 10;
        int b = 20;
        if((a == 10) && (b != 10)) {
            System.out.println(true);
        }
        
        /* Conditional-OR Operator "||" */
        int c = 10;
        int d = 20;
        if((c == 10) || (b == 10)) {
            System.out.println(true);
        }
    }
    
}
