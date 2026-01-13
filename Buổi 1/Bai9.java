import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.println("Tong: " + (a + b));
        System.out.println("Hieu: " + (a - b));
        System.out.println("Tich: " + (a * b));

        if (b != 0) {
            double thuong = (double) a / b;
            System.out.println("Thuong: " + thuong);
        } else {
            System.out.println("Khong the chia cho 0");
        }

        sc.close();
    }
}
