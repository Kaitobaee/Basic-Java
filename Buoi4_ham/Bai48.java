import java.util.Scanner;

// Bài 48: Đếm số hoàn thiện nhỏ hơn n
// Số hoàn thiện là số bằng tổng các ước số của nó (không kể chính nó)
// Ví dụ: 6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14
public class Bai48 {
    
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
        
        System.out.print("Nhập số nguyên dương n (n > 0): ");
        int n = sc.nextInt();
        
        int dem = 0;
        for (int i = 2; i < n; i++) {
            if (laSoHoanThien(i)) {
                dem++;
            }
        }
        
        System.out.println("Số lượng số hoàn thiện nhỏ hơn " + n + " là: " + dem);
        
        sc.close();
    }
}
