import java.util.Scanner;

// Bài 53: Tìm ƯCLN và BCNN của 2 số nguyên dương
public class Bai53 {
    
    // Hàm tính ƯCLN bằng thuật toán Euclid
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // Hàm tính BCNN
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương a: ");
        int a = sc.nextInt();
        
        System.out.print("Nhập số nguyên dương b: ");
        int b = sc.nextInt();
        
        if (a <= 0 || b <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
        } else {
            System.out.println("ƯCLN(" + a + ", " + b + ") = " + UCLN(a, b));
            System.out.println("BCNN(" + a + ", " + b + ") = " + BCNN(a, b));
        }
        
        sc.close();
    }
}
