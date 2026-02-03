import java.util.Scanner;

// Bài 54: Tính tổng nghịch đảo của n giai thừa
// S = 1/1! + 1/2! + 1/3! + ... + 1/n!
public class Bai54 {
    
    // Hàm tính giai thừa
    public static long giaiThua(int n) {
        long gt = 1;
        for (int i = 2; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
        } else {
            double tong = 0;
            for (int i = 1; i <= n; i++) {
                tong += 1.0 / giaiThua(i);
            }
            System.out.println("Tổng nghịch đảo của n giai thừa: " + tong);
        }
        
        sc.close();
    }
}
