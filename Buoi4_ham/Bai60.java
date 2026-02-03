import java.util.Scanner;

// Bài 60: Kiểm tra các chữ số của n có toàn lẻ hay toàn chẵn không
public class Bai60 {
    
    // Hàm kiểm tra các chữ số có toàn chẵn không
    public static boolean laToanChan(int n) {
        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
    
    // Hàm kiểm tra các chữ số có toàn lẻ không
    public static boolean laToanLe(int n) {
        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                return false;
            }
            n /= 10;
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
            if (laToanChan(n)) {
                System.out.println("Số " + n + " có tất cả các chữ số đều CHẴN.");
            } else if (laToanLe(n)) {
                System.out.println("Số " + n + " có tất cả các chữ số đều LẺ.");
            } else {
                System.out.println("Số " + n + " không có các chữ số toàn chẵn hay toàn lẻ.");
            }
        }
        
        sc.close();
    }
}
