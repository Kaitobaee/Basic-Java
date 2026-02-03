import java.util.Scanner;

// Bài 56: Đếm số chữ số chẵn và lẻ trong số n
public class Bai56 {
    
    // Hàm đếm số chữ số chẵn
    public static int demChuSoChan(int n) {
        int dem = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                dem++;
            }
            n /= 10;
        }
        return dem;
    }
    
    // Hàm đếm số chữ số lẻ
    public static int demChuSoLe(int n) {
        int dem = 0;
        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                dem++;
            }
            n /= 10;
        }
        return dem;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương n (0 < k <= 5 chữ số): ");
        int n = sc.nextInt();
        
        if (n <= 0 || n > 99999) {
            System.out.println("Số không hợp lệ!");
        } else {
            System.out.println("Số " + n + " có " + demChuSoChan(n) + " chữ số chẵn và " + demChuSoLe(n) + " chữ số lẻ.");
        }
        
        sc.close();
    }
}
