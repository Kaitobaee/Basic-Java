import java.util.Scanner;

// Bài 57: Đếm số chữ số là số nguyên tố trong số n
public class Bai57 {
    
    // Hàm kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương n (0 < k <= 5 chữ số): ");
        int n = sc.nextInt();
        
        if (n <= 0 || n > 99999) {
            System.out.println("Số không hợp lệ!");
        } else {
            int dem = 0;
            int temp = n;
            
            while (temp > 0) {
                int chuSo = temp % 10;
                if (laSoNguyenTo(chuSo)) {
                    dem++;
                }
                temp /= 10;
            }
            
            System.out.println("Số " + n + " có " + dem + " chữ số là số nguyên tố.");
        }
        
        sc.close();
    }
}
