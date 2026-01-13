// Bài 18. Giải và biện luận phương trình: ax² + bx + c = 0
import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            // Phuong trinh bac nhat: bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("Phuong trinh bac nhat co nghiem: x = " + x);
            }
        } else {
            // Phuong trinh bac hai
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) {
                System.out.println("Delta = " + delta + " < 0");
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Delta = 0");
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Delta = " + delta + " > 0");
                System.out.println("Phuong trinh co 2 nghiem:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        
        scanner.close();
    }
}
