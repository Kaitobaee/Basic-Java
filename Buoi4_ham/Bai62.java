import java.util.Scanner;

// Bài 62: In ra các số hoàn thiện nhỏ hơn n
public class Bai62 {
    
    // Hàm kiểm tra số hoàn thiện
    public static boolean laSoHoanThien(int n) {
        if (n < 2) return false;
        int tong = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong == n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
        } else {
            System.out.print("Các số hoàn thiện nhỏ hơn " + n + " là: ");
            boolean coSoHoanThien = false;
            
            for (int i = 2; i < n; i++) {
                if (laSoHoanThien(i)) {
                    System.out.print(i + " ");
                    coSoHoanThien = true;
                }
            }
            
            if (!coSoHoanThien) {
                System.out.print("Không có số hoàn thiện nào nhỏ hơn " + n);
            }
        }
        
        sc.close();
    }
}
