import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class FunctionUsageTrackerTest {
    @Test
    void testCalculateAverage() {
        // Mô phỏng dữ liệu đầu vào
        String input = "3\n1\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Mô phỏng đầu ra
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Gọi phương thức
        FunctionUsageTracker.calculateAverage(new Scanner(System.in));

        // Kiểm tra kết quả
        String output = outputStream.toString();
        Assertions.assertTrue(output.contains("Trung bình cộng của 3 số là: 2.0"));
    }

    @Test
    void testCalculateRectangleArea() {
        // Mô phỏng dữ liệu đầu vào
        String input = "5.0\n3.0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Mô phỏng đầu ra
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Gọi phương thức
        FunctionUsageTracker.calculateRectangleArea(new Scanner(System.in));

        // Kiểm tra kết quả
        String output = outputStream.toString();
        Assertions.assertTrue(output.contains("Diện tích hình chữ nhật là: 15.0"));
    }

    @Test
    void testCalculateCircleArea() {
        // Mô phỏng dữ liệu đầu vào
        String input = "2.5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Mô phỏng đầu ra
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Gọi phương thức
        FunctionUsageTracker.calculateCircleArea(new Scanner(System.in));

        // Kiểm tra kết quả
        String output = outputStream.toString();
        Assertions.assertTrue(output.contains("Diện tích hình tròn là: 19.634954084936207"));
    }
}