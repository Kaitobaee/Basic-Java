// Bài 15. Cho ba số a, b, c đọc từ bàn phím. Hãy tìm giá trị lớn nhất của ba số trên và in ra kết quả.
import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();
        
        System.out.print("Nhap so c: ");
        int c = scanner.nextInt();
        
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        
        System.out.println("Gia tri lon nhat la: " + max);
        
        scanner.close();
    }
}
