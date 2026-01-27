// Bài 19. Giải và biện luận phương trình: ax^4 + bx^2 + c = 0
// Dat t = x^2, dieu kien t >= 0
// Phuong trinh tro thanh: at^2 + bt + c = 0
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        
        System.out.println("Dat t = x^2 (t >= 0)");
        
        if (a == 0) {
            // Phuong trinh bac nhat theo t: bt + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double t = -c / b;
                if (t < 0) {
                    System.out.println("t = " + t + " < 0");
                    System.out.println("Phuong trinh vo nghiem");
                } else if (t == 0) {
                    System.out.println("t = 0 => x = 0");
                } else {
                    double x1 = Math.sqrt(t);
                    double x2 = -Math.sqrt(t);
                    System.out.println("t = " + t);
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
            }
        } else {
            // Phuong trinh bac hai theo t
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) {
                System.out.println("Delta = " + delta + " < 0");
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double t = -b / (2 * a);
                if (t < 0) {
                    System.out.println("t = " + t + " < 0");
                    System.out.println("Phuong trinh vo nghiem");
                } else if (t == 0) {
                    System.out.println("t = 0 => x = 0");
                } else {
                    double x1 = Math.sqrt(t);
                    double x2 = -Math.sqrt(t);
                    System.out.println("t = " + t);
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
            } else {
                double t1 = (-b + Math.sqrt(delta)) / (2 * a);
                double t2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Delta = " + delta);
                System.out.println("t1 = " + t1 + ", t2 = " + t2);
                
                // Xet t1
                if (t1 > 0) {
                    System.out.println("Voi t1 = " + t1 + ": x = " + Math.sqrt(t1) + " hoac x = " + (-Math.sqrt(t1)));
                } else if (t1 == 0) {
                    System.out.println("Voi t1 = 0: x = 0");
                }
                
                // Xet t2
                if (t2 > 0) {
                    System.out.println("Voi t2 = " + t2 + ": x = " + Math.sqrt(t2) + " hoac x = " + (-Math.sqrt(t2)));
                } else if (t2 == 0) {
                    System.out.println("Voi t2 = 0: x = 0");
                }
                
                // Neu ca hai deu am
                if (t1 < 0 && t2 < 0) {
                    System.out.println("Ca t1 va t2 deu am, phuong trinh vo nghiem");
                }
            }
        }
        
        scanner.close();
    }
}

