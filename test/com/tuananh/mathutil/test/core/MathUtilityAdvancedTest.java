/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuananh.mathutil.test.core;

import com.tuanhanh.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ASUS
 */

@RunWith(value = Parameterized.class)
//khi run class này thì JUnit sẽ tự sinh ra code để sinh ra thêm
//code để fill data

public class MathUtilityAdvancedTest {
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20};
        
        return new Object[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {5, 120}
          
        };
    }
    
    //map 1 dòng gồm 2 biến n và expected
    @Parameterized.Parameter(value = 0)
    public int n;
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public void testFactorialGivenRightArgumentsRunWell() {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
  
    
    
    
}
