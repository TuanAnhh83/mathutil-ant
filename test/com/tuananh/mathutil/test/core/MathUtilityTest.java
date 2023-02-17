/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuananh.mathutil.test.core;


import com.tuanhanh.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //ngtac của kiểm thử là so sánh giữa expected vs actual
        //test getF() n < 0
        //JUnit 4 không có hàm assert()Exception
        MathUtility.getFactorial(-5);
        //nếu chỉ viết lệnh này alone ==> chưa đo lường, so sánh rằng có ngoại lệ như kì vọng hay ko?
        
        
    }
    //@ là dấu hiệu framework
    @Test
    public void testRedGreenSignal() {
        //so sánh expected vs actual
        Assert.assertEquals(6789, 6789);
    }
    
    @Test
    public void testFactorialGiveRightArgumentReturnWell() {
        //test case 1: test getF() with n = 0;
        //expected: 1
        //test hàm getF() với n = 0
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        //test case 2: test getF() with n = 1;
        //expected: 1
        //test hàm getF() với n = 1, hy vọng trả về 1, tức là 1! = 1
        Assert.assertEquals(1, MathUtility.getFactorial(1));
        
        //test case 3: test getF() with n = 6;
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        Assert.assertEquals(120, MathUtility.getFactorial(5));
    }
    //viết Assertequals(expected, actual)
    //lặp đi lặp lại ==> Bad Smell
    //nghịch lí thuốc trừ sâu ==> có knăng xuất hiện
    //fix = kĩ thuật mới DDT
    
}
