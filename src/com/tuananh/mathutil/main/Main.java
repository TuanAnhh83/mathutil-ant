/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuananh.mathutil.main;

import com.tuanhanh.mathutil.core.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    
    public static void main(String[] args) {
        testFactorialGivenRightArgumentReturnsWell();
        testFactorialGivenWrongArgumentThrownException();
            
    }
    
    //dân dev phải có trách nhiệm với những hàm/method mình đã viết ra
    //tức là đảm bảo hàm chạy đúng như thiết kế
    //hàm getFactorial() đc thiết kế rằng:
    //nếu đưa n < 0 hoặc n > 20 sẽ ném ra loại lệ
    //nếu đưa n = 0...20 --> tính đúng n!
    //TA - dân Dev sẽ kiểm thử hàm đúng như thiết kế
    //Kiểm thử - dùng thử - mô phỏng các tình huống - case
    //Hàm sẽ đc dùng theo 2 cách dựa theo thiết kế
    //đưa n tử tế từ 0..20
    //đưa data cà chớn n < 0 hoặc n > 20
    
    public static void testFactorialGivenRightArgumentReturnsWell() {
        //case 1: test getF() with n = 0
        //Expected value: 1;
        //kiểm thử coi có đúng hay ko
        //1 test case
        
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);//gọi hàm tính giai thừa, xem kết quả trả về
        //so sánh ex và ac
        System.out.println("Test " + n + "! | expected: " + expectedValue
                                    + " | actual: " + actualValue);
    //case 2: test getF() with n = 1;
    //expected value = 1
    //kiểm thử xem 1! có đúng = 1?
    n = 1;
    expectedValue = 1;
    actualValue = MathUtility.getFactorial(n);
    System.out.println("Test " + n + "! | expected: " + expectedValue
                                    + " | actual: " + actualValue);
    
    //test case 3: test getF() n = 2;
    
    }
    
    public static void testFactorialGivenWrongArgumentThrownException(){
        //test case 6: test getF() with n < -1;
        //expected value: an Illegal Argument Exception is thrown
        //nếu đưa n = -1 thì hàm sẽ đập vào mặt user
        //hàm 1 ngoại lệ
        System.out.println("Test -1! | expected: Illegal Argument Exception is thrown!!!"
                                    + " | actual: ???");
        MathUtility.getFactorial(-1);
    }
    
    
    
}
