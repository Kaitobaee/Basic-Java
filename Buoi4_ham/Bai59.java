import java.util.Scanner;

// Bài 59: Tìm ước số lẻ lớn nhất của n
public class Bai59 {
    
    // Hàm tìm ước số lẻ lớn nhất
    public static int timUocLeLonNhat(int n) {
        int uocLeLonNhat = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                uocLeLonNhat = i;
            }
        }
        return uocLeLonNhat;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương n (0 < k <= 5 chữ số): ");
        int n = sc.nextInt();
        
        if (n <= 0 || n > 99999) {
            System.out.println("Số không hợp lệ!");
        } else {
            System.out.println("Ước số lẻ lớn nhất của " + n + " là: " + timUocLeLonNhat(n));
        }
        
        sc.close();
    }
}
