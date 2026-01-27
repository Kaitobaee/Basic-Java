// Bài 14. Nhập vào hai số nguyên a, b. In ra màn hình giá trị lớn nhất.
import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();
        
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        
        System.out.println("Gia tri lon nhat la: " + max);
        
        scanner.close();
    }
}
