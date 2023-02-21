/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuanhanh.mathutil.core;

/**
 *
 * @author ASUS
 */
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    //21! vuot kieu long - 18 so 0
    //ta se thu nghiem ham n! voi n = 0..20 -> du kieu long
    //n! = 1 x 2 x 3 x 4...x n
    //ko co giai thua am
    //21! tran long, do do n chi ap dung 0..20
    //0! = 1! = 1; qui uoc 0! = 1
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n.n must be between 0..20!");
            
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1;
        for (int i = 2; i < n; i++) //make code wrong
            product *= i;
        
        return product;
        
    }
}
