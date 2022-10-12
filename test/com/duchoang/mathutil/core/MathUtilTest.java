
package com.duchoang.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    
    
    // Kiểm thử tình huống cà chớn đưa data vào cà chớn thì nhận về cú tát EXCEPTION
    // hàm getFactorial() đc thiết kể để:
    // - nếu n tử tế 0...20 -> ra màu xanh
    // - nếu n < 0 || n>20 : NÉM EXCEPTION/ ILLEGALARGUMENTEXCEPTION
    // Nếu n = -5 => throw ngoại lệ
    // THẦY NGOẠI LỆ NHƯ EXP => MÀU XANH
    @Test(expected = Exception.class) 
    public void testFactorialGivenWrongArgumentThrowsException(){
        
        // Test case #6
        // n = 5; 5! => exp throw EXCEPTION
        // act = ?
        // ko xài asserEquals() vì dùng để so sánh các giá trị số
        // còn exception là 1 thứ đo lương = cách xuất hiện hay ko
        
        MathUtil.getFactorial(-5); // => throw exception
        
    }
    
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){ 
        
        // Test case #4
        // n = 3; 3! exp = 6
        // act = ?
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        
        // Test case #5
        // n = 4; 4! exp = 24
        // act = ?
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        
        // Test case #6
        // n = 5; 5! exp = 120
        // act = ?
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        
        
        
    }
    
    @Test
    public void tryAssertion(){
        Assert.assertEquals(69, 69);
    }
    
    @Test 
    // quy tắc đặt tên hàm kiểm thử phải mang ý nghĩa của 
    // các test case mình muốn test - Coding convention
    
    // Test Factorial Given Right Argument Returns Well
    public void testFactorialGivenRightArgumentReturnsWell2(){ 
        // Test cae #1 - tình huống kiểm thử xài hàm getF() đầu tiên
        // n = 0, 0! exp =1 ; act = ?
        // exp == act => Màu xanh/đúng
        //     !=     => Màu đỏ/sai
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        // compare 2 value => use framwork
        Assert.assertEquals(expected, actual);
        
        
        // Test case #2
        // n = 1; 1! exp = 1
        // act = ?
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        
        
        // Test case #3
        // n = 2; 2! exp = 2
        // act = ?
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        
        
    }
}

// TRONG CLASS NÀY CHỨA GÌ??
// CLASS NÀY CHỨA CÁC ĐOẠN CODE ĐỂ TEST CODE CHÍNH Ở BÊN THƯ MỤC SOURCE PACKAGES
// CÁC ĐOẠN CODE Ở ĐÂY SẼ DÙNG ĐỂ TEST HÀM GETFACTORIAL ()
// VIẾT CODE ĐỂ TEST CODE
// NHỮNG ĐOẠN CODE Ở TRONG NÀY DO DEV VIẾT RA DÙNG ĐỂ TEST CHÍNH CÁI CODE Ở BÊN
// THƯ MỤC SOURCE ĐỂ ĐẢM BẢO RẰNG HÀM/CLASS VIẾT RA PHẢI CHẠY ĐÚNG
// ĐOẠN CODE DÙNG ĐỂ TEST CODE THÌ ĐC GỌI LÀ TEST SCRIPT

// CÁC TEST SCRIPT NÀY SẼ CÓ LỆNH CƠ BẢN: SO SÁNH GIỮA EXP VÀ ACT
// NHƯ BÊN HÀM MAIN() ĐÃ LÀM THỬ!!!

// NHỮNG ĐOẠN CODE NÀY KO DÙNG LỆNH SOUT() TRUYỀN THỐNG MÀ DÙNG NHỮNG THƯ VIỆN
// ĐẶC BIỆT ĐỂ : 
// Khi làm hàm sai, khi exp ko giống như act, thì nó ném ra MÀU ĐỎ
// Khi hàm chạy đúng, exp == act, thì nó ném ra MÀU XANH
// Các thư viện giúp thảy ra màu xanh đỏ, tự so sánh giùm exp và act để kết luận hàm đúng sai
// 2 MÀU XANH ĐỎ, KO CẦN XEM CHI TIẾT CÁC DÙNG SO SÁNH BÊN MAIN()
// BỘ THƯ VIỆN NÀY CÒN GỌI LÀ UNIT TEST FRAMEWORK
// MÕI NGÔN NGỮ LẬP TRÌNH ĐỀU CÓ VÀI BỘ THƯ VIỆN THẢY RA MÀU XANH ĐỎ
// GIÚP CÁC DEV TEST HÀM CỦA MÌNH
// VÍ DỤ:
// java : JUnit, TestNG
// C# : xUnit, NUnit, MSTest
// PHP : phpUnit
// JavaScript : ...
// Python :
// Google : Unit Test Framework for ... NNLT tên

// @Test đc gọi là 1 flag - ANNOTATION
// báo hiệu cho thư viện Junit biết cần GENERATE HÀM ĐI KÈM @TEST
// BIẾN HÀM NÀY THÀNH HÀM MAIN() VÀ GỬI MAIN() NÀY CHO JVM - JAVA VIRTUAL MACHINE
// BIẾT ĐỂ CHẠY, KHI CHẠY THÌ SO SÁNH 2 ĐỨA EXP VÀ ACT, COI NẾU CHÚNG == NHAU, THẤY MÀU XANH
//                                                                     !=     , THẤY MÀU ĐOE
// NẾU KO CÓ @TEST, NO RUNABLE TEST MAIN
// VIỆC XÀI THƯ VIỆN MÀ BỊ ÉP PHẢI LÀM NHỮNG GÌ ĐÓ, THEO QUY TẮC NÀO ĐÓ GỌI LÀ FRAMEWORK



// CHỐT DEAL XANH ĐỎ
// NẾU VC CHẠY BỘ TEST CASE RA MÀU XANH, <=> TẤT CẢ ĐỀU XANH
// XANH: KH TẤT CẢ CÁC TEST CASE CÙNG XANH
// XANH: KHI TẤT CẢ CÁC VIỆC SO SÁNH EXP ĐỀU == ACT

// ĐỎ: CHỈ CẦN 1 THẰNG TRONG ĐÁM TEST CASE ĐỎ, => ALL ĐỎ
// DỎ: CHỈ CẦN 1 VC SO SÁNH EXP !=  ACT XUẤT HIỆN => ALL ĐỎ

// LOGIC: HÀM NẾU ĐÃ ĐÚNG, THÌ PHẢI ĐÚNG VỚI TẤT CẢ CÁ CASE ĐÃ ĐC LIỆT KÊ RA
// HÀM NGON VỚI CÁC CASE ĐÃ TEST
// CỐ GẮNG LIỆT KÊ ĐC ĐỦ CASE LÀ TỐT NHẤT!!! => NGUYÊN LÝ SỐ 2

// CHỐT DEAL 2
// KHI RA MÀU XANH TỔNG, HÀM ỔN VỚI CÁC TEST CASE
// KHI RA ĐỎ, NGHĨA LÀ CÓ ÍT NHẤT 1 VC SO SÁNH EXP != ACT
// ĐỎ VÌ LÍ DO :
// -  DO ACT TRẢ VỀ != EXP => BUG
// - DO EXP TÍNH TOÁN KHÔNG ĐÚNG!!! LỖI QC

