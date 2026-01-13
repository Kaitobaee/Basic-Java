// Bài 24. Nhập 3 số nguyên dương. Kiểm tra có lập thành tam giác không?
// Nếu có thì cho biết loại tam giác (cân, vuông, đều, ...)
import java.util.Scanner;

public class Bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap canh a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhap canh b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhap canh c: ");
        double c = scanner.nextDouble();
        
        // Kiem tra so duong
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Cac canh phai la so duong!");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            // Kiem tra dieu kien tam giac
            System.out.println("Ba so nay KHONG lap thanh tam giac!");
        } else {
            System.out.println("Ba so nay lap thanh tam giac!");
            
            // Kiem tra tam giac deu
            if (a == b && b == c) {
                System.out.println("=> Tam giac DEU");
            } 
            // Kiem tra tam giac vuong can
            else if ((a == b && a*a + b*b == c*c) || 
                     (b == c && b*b + c*c == a*a) || 
                     (a == c && a*a + c*c == b*b)) {
                System.out.println("=> Tam giac VUONG CAN");
            }
            // Kiem tra tam giac vuong
            else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                System.out.println("=> Tam giac VUONG");
            }
            // Kiem tra tam giac can
            else if (a == b || b == c || a == c) {
                System.out.println("=> Tam giac CAN");
            }
            // Tam giac thuong
            else {
                System.out.println("=> Tam giac THUONG");
            }
        }
        
        scanner.close();
    }
}
