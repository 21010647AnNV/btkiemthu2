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
    void testMainMethodWithExitOption() {
        // Mô phỏng dữ liệu đầu vào
        String input = "4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Mô phỏng đầu ra
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Gọi phương thức main
        FunctionUsageTracker.main(new String[]{});

        // Kiểm tra kết quả
        String output = outputStream.toString();
        Assertions.assertTrue(output.contains("Cảm ơn bạn đã sử dụng ứng dụng!"));
    }
}