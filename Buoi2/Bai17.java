// Bài 17. Giải và biện luận phương trình: ax + b = 0
import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        
        System.out.println("Phuong trinh: " + a + "x + " + b + " = 0");
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem duy nhat: x = " + x);
        }
        
        scanner.close();
    }
}
