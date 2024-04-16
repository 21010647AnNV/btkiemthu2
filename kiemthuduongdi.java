import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

@ExtendWith(MockitoExtension.class)
class FunctionUsageTrackerTest {
    @Test
    void testMainMethodWithValidInput() {
        // Mô phỏng dữ liệu đầu vào
        String input = "1\n3\n1\n2.5\n3\n5.0\n3.0\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Mô phỏng đầu ra
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Gọi phương thức main
        FunctionUsageTracker.main(new String[]{});

        // Kiểm tra kết quả
        String output = outputStream.toString();
        Assertions.assertTrue(output.contains("Trung bình cộng của 3 số là: 2.0"));
        Assertions.assertTrue(output.contains("Diện tích hình tròn là: 19.634954084936207"));
        Assertions.assertTrue(output.contains("Diện tích hình chữ nhật là: 15.0"));
        Assertions.assertTrue(output.contains("Cảm ơn bạn đã sử dụng ứng dụng!"));
    }

    @Test
    void testMainMethodWithInvalidInput() {
        // Mô phỏng dữ liệu đầu vào
        String input = "0\n6\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Mô phỏng đầu ra
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Gọi phương thức main
        FunctionUsageTracker.main(new String[]{});

        // Kiểm tra kết quả
        String output = outputStream.toString();
        Assertions.assertTrue(output.contains("Lựa chọn không hợp lệ. Vui lòng chọn lại."));
    }
}