
package com.duchoang.mathutil.main;

import com.duchoang.mathutil.core.MathUtil;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("This message comes from main() method");
        System.out.println("This jar file is built based on ANT in co-operating with JUnit");
        System.out.println("Moreover, this message comes from a US-BUILT'S JAR FILE");
        tryTDDFirst();
    }

    // demo minh họa TDD 
    // viết code song song test
    // Test         Driven      Developmet
    // kiểm thử     hướng về    viết code
    public static void tryTDDFirst() {

        // Test case #1: (tình huống xài hàm #1)
        // input n = 0; test 0!
        // expected = 1; (0! = 1)
        // actual = ? (run method)
        long expected = 1; // return 1
        long actual = MathUtil.getFactorial(0);
        // kiểm thử phần mềm là so sánh giữa exp va act
        System.out.println("0! | Status | expected: " + expected
                + " | actual: " + actual);

        // Test case #2
        // test 2! => return 2
        // input n = 2;
        // gọi hàm getFactorial(2)
        // exp = 2
        // act = ?
        System.out.println("2! | Status | expected: 2 | actual: " + MathUtil.getFactorial(2));
        
        // Test case 3
        // n= 5, 5! => 120
        System.out.println("5! | Status | expected: 120 | actual: " + MathUtil.getFactorial(5));
        
        // Test case 4
        // n = -5!, -5! => invalid n
//        System.out.println("-5! | Status | expected: NGOAI LE | actual: " + MathUtil.getFactorial(-5));
//        System.out.println("-5! | Status | expected: NGOAI LE | actual: " );
//        MathUtil.getFactorial(-5);
    }

}

// TỔNG KẾT
// TEST CASE LÀ GÌ??? 
// LÀ NHỮNG TÌNH HUỐNG KIỂM THỬ APP XEM APP CHẠY CÓ ĐÚNG HAY KHÔNG
// TEST-CASE BAO GỒM:
// - DATA ĐƯA VÀO APP, VÍ DỤ 5 ĐƯA VÀO HÀM GIAI THỪA
// - GỌI HÀM ĐỂ XỬ LÝ DATA ĐƯA VÀO
// - GIÁ TRỊ KÌ VỌNG HÀM SẼ TRẢ VỀ EXPECTED VALUE
// - STATUS: HÀM CHẠY ĐÚNG HAY SAI

// MỘT TEST CASE LÀ 1 TÌNH HUỐNG XÀI APP/KIỂM THỬ APP ĐÚNG HAY SAI SO VỚI
// KÌ VỌNG KHI TA ĐƯA DATA VỤ THỂ NÀO ĐÓ VÀO APP
