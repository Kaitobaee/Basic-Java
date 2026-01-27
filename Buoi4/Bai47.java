import java.util.Scanner;

// Bài 47: Liệt kê n số nguyên tố đầu tiên
public class Bai47 {
    
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
        
        System.out.print(n + " số nguyên tố đầu tiên là: ");
        int dem = 0;
        int so = 2;
        while (dem < n) {
            if (laSoNguyenTo(so)) {
                System.out.print(so + " ");
                dem++;
            }
            so++;
        }
        
        sc.close();
    }
}
