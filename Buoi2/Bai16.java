// Bài 16. Cho ba số a, b, c đọc từ bàn phím. Hãy in ra màn hình theo thứ tự tăng dần của các số.
import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();
        
        System.out.print("Nhap so c: ");
        int c = scanner.nextInt();
        
        int temp;
        // Sap xep a, b, c theo thu tu tang dan
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        
        System.out.println("Thu tu tang dan: " + a + " " + b + " " + c);
        
        scanner.close();
    }
}
