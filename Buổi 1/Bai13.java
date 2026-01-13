import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // if_else 
        /* Giải và biện luận phương trình: ax2 + bx + c = 0 */
        double a,b,c ;
        // hằng số dùng final
        final double pi= 3.14159 ;
        System.out.println("Nhap vao gia tri A : ");
        a=sc.nextInt();
        System.out.println("Nhap vao gia tri B : ");
        b=sc.nextInt();
        System.out.println("Nhap vao gia tri C : ");
        c=sc.nextInt();
        // math.pow luôn luôn trả về double nên lưu ý khai báo biến double
        // a == 0 → phương trình bậc nhất
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("Phuong trinh co 1 nghiem:");
                System.out.println("X = " + x);
            }
        }
        // a != 0 → phương trình bậc 2
        else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep:");
                System.out.println("X = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem:");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }
    }
}