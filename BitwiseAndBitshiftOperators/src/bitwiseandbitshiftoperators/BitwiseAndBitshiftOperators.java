/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwiseandbitshiftoperators;

/**
 *
 * @author didin
 */
public class BitwiseAndBitshiftOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Bitwise AND Operator "&" */
        int a = 13; // 00001101
        int b = 12; // 00001100
        int c = a & b; // 00001101 & 00001100 = 00001100
        System.out.println(c);
        
        /* Bitwise OR Operator "|" */
        int d = 13; // 00001101
        int e = 12; // 00001100
        int f = d | e; // 00001101 | 00001100 = 00001101
        System.out.println(f);
        
        /* Bitwise XOR Operator "^" */
        int g = 13; // 00001101
        int h = 12; // 00001100
        int i = g ^ h; // 00001101 ^ 00001100 = 00000001
        System.out.println(i);
        
        /* Bit Left Shift Operator "<<" */
        int j = 13; // 00001101
        int k = 12; 
        int l = g << h; // Add 12 digits 0 of 00001101 to the right = 00001101000000000000
        System.out.println(l);
        
        /* Bit Right Shift Operator ">>" */
        int m = 8; // 00001000
        int n = 2; 
        int o = m >> n; // Remove 2 digits of 00001000 to the left
        System.out.println(o);
        
        /* Bit Zero Fill Right Shift Operator ">>>" */
        int q = 8; // 1000
        int r = 2; 
        int s = q >>> r; // Remove 2 digits of 00001000 to the left
        System.out.println(s);
    }
    
}
