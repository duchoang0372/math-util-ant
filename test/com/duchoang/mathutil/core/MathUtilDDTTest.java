
package com.duchoang.mathutil.core;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.duchoang.mathutil.core.MathUtil.*;

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    // Chuẩn bị data mảng 2 chiều vì có nhiều cặp (n + exp) đưa vào
    
    @Parameterized.Parameters
    public static Object[][] initData(){
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 0}, 
                     {1, 1}, 
                     {2, 2}, 
                     {6, 3}, 
                     {24, 4}, 
                     {120, 5}, 
                     {720, 6}
                    };
        return new Integer[][] {{1, 0}, 
                                {1, 1}, 
                                {2, 2}, 
                                {6, 3}, 
                                {24, 4}, 
                                {120, 5}, 
                                {720, 6}
                               };
        // Xài Wrapper class nếu chơi số, ví dụ Integer (int), Long (long)
    }
    
    // Sau khi có bộ data qua mảng 2 chiều, JUnit sẽ tự lặp for
    // để lôi ra từng cặp data (1, 0) (1, 1) ...
    // nhồi cặp này vào trong hàm so sánh
    // nhưng nhồi = cách nào, gán value vào  biến nào đó
    // gán vào biến - THAM SỐ HÓA PARAMETERIZED
    // TA SẼ MAP/ÁNH XẠ 2 CỘT ỨNG VỚI 2 BIẾN: CỘT 0 - EXPECTED
    //                                        CỘT 1 - ACTUAL
    
    @Parameterized.Parameter(value = 0)
    public long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n;
    
    // đã có data => test
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(n));
    }
    
}

// CLASS NÀY SẼ CHỨA CODE DÙNG ĐỂ TEST CODE CHÍNH Ở BÊN CLASS MATHUTIL
// CLASS MÀU SẼ CHỨA CODE DÙNG ĐỂ TEST HÀM getF() COI HÀM CHẠY ĐÚNG KO
// CODE viết ra dùng để test code khác (hàm khác/ class khác)
// thì đoạn code này, class này dc gọi tên là : TEST SCRIPT
// Trong test script sẽ có những tình huống xài app, đưa data cụ thể vào và
// chờ xem hàm xử lí kết quả có như exp hay ko
// Một Test Script sẽ chứa nhiều TEST CASES
// mỗi case ứng với một tình huống xài hàm

// Phân tích Test Script cũ
// Trong Test Script cũ xuất hiện BAD SMELL - SỰ TRÙNG LẶP về câu lệnh
// Assert.assertEquals(6, MathUtil.getFactorial(3));
// lệnh so sánh giá trị, lệnh gọi hàm đc lặp đi lặp lại với mỗi bộ test case
// Cũng hàm này, lệnh này nhưng nó phải viết lại cho các bộ
// data sau:

// Expected         n
// 0                0
// 1                1
// 2                2
// 6                3
// 24               4
// 120              5
// [rows][cols]
// Có cách nào thay 2 con số trong lệnh so sánh = ???
// Assert.assertEquals(expected, MathUtil.getFactorial(n));

// Nếu ta tách đc toàn bộ data trong các câu lệnh so sánh ở trên 
// ra 1 chỗ riêng biệt như hàng cột ở trên, sau đó
// ta chỉ việc pick/ lấy data nạp dần vào cái lệnh gọi hàm, ta sẽ đạt đc:
// - Code gọn gàng hơn, ko bị trùng lặp
// - Nhìn tổng quan sẽ biết bao nhiêu test case và liệu rằng có đủ hay chưa

// Kĩ thuật viết test script (câu lệnh test) mà tách biệt data ra khỏi
// lệnh so sánh đc gọi bằng những tên sau:
// - PARAMETERIZED - THAM SỐ HÓA, BIẾN DATA RA 1 CHỖ, ĐẶT CHO CHÚNG CÁI 
// TÊN BIẾN, LÁT HỒI NHỒI CHÚNG TRỞ LẠI LỆNH SO SÁNH

// - DDT (DATA DRIVEN TESTING) - VIẾT CODE KIỂM THỬ THEO STYLE TÁCH DATA
// JUNIT FW HỖ TRỢ SẴN TA VỤ TÁCH DATA, DUYỆT VÒNG FOR TRÊN DATA
// NHỒI VÀO HÀM TƯƠNG ỨNG

// ĐỂ CHƠI VỚI DDT, TA CẦN:
// - Tách data ra 1 chỗ - MẢNG
// - Map cái data này vào các biến tương ứng
// - Nhồi các biến tương ứng này vào câu lệnh so sánh/gọi hàm