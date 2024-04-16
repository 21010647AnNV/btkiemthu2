import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu chức năng
            System.out.println("Chọn chức năng:");
            System.out.println("1. Tính trung bình cộng");
            System.out.println("2. Tính diện tích hình chữ nhật");
            System.out.println("3. Tính diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự trả về sau khi nhập số

            switch (choice) {
                case 1:
                    calculateAverage(scanner);
                    break;
                case 2:
                    calculateRectangleArea(scanner);
                    break;
                case 3:
                    calculateCircleArea(scanner);
                    break;
                case 4:
                    System.out.println("Cảm ơn bạn đã sử dụng ứng dụng!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);
    }

    // Phương thức tính trung bình cộng
    static void calculateAverage(Scanner scanner) {
        System.out.print("Bạn muốn tính trung bình cộng bao nhiêu số? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            int num = scanner.nextInt();
            scanner.nextLine();
            sum += num;
        }

        double average = (double) sum / n;
        System.out.println("Trung bình cộng của " + n + " số là: " + average);
    }

    // Phương thức tính diện tích hình chữ nhật
    static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double length = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double width = scanner.nextDouble();
        scanner.nextLine();

        double area = length * width;
        System.out.println("Diện tích hình chữ nhật là: " + area);
    }

    // Phương thức tính diện tích hình tròn
    static void calculateCircleArea(Scanner scanner) {
        System.out.print("Nhập bán kính hình tròn: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();

        double area = Math.PI * radius * radius;
        System.out.println("Diện tích hình tròn là: " + area);
    }
}
