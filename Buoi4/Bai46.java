import java.util.Scanner;

// Bài 46: Liệt kê tất cả các số nguyên tố nhỏ hơn n
public class Bai46 {
    
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
        
        System.out.print("Nhập số nguyên dương n (n > 0): ");
        int n = sc.nextInt();
        
        System.out.print("Các số nguyên tố nhỏ hơn " + n + " là: ");
        for (int i = 2; i < n; i++) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}
