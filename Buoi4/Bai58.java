import java.util.Scanner;

// Bài 58: Tính tổng các ước số của n
public class Bai58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương n (0 < k <= 5 chữ số): ");
        int n = sc.nextInt();
        
        if (n <= 0 || n > 99999) {
            System.out.println("Số không hợp lệ!");
        } else {
            int tong = 0;
            System.out.print("Các ước số của " + n + " là: ");
            
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    tong += i;
                }
            }
            
            System.out.println();
            System.out.println("Tổng các ước số của " + n + " là: " + tong);
        }
        
        sc.close();
    }
}
