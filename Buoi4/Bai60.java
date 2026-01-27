import java.util.Scanner;

// Bài 60: Kiểm tra các chữ số của n có toàn lẻ hay toàn chẵn không
public class Bai60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương n (0 < k <= 5 chữ số): ");
        int n = sc.nextInt();
        
        if (n <= 0 || n > 99999) {
            System.out.println("Số không hợp lệ!");
        } else {
            boolean toanChan = true;
            boolean toanLe = true;
            int temp = n;
            
            while (temp > 0) {
                int chuSo = temp % 10;
                if (chuSo % 2 == 0) {
                    toanLe = false;
                } else {
                    toanChan = false;
                }
                temp /= 10;
            }
            
            if (toanChan) {
                System.out.println("Số " + n + " có tất cả các chữ số đều CHẴN.");
            } else if (toanLe) {
                System.out.println("Số " + n + " có tất cả các chữ số đều LẺ.");
            } else {
                System.out.println("Số " + n + " không có các chữ số toàn chẵn hay toàn lẻ.");
            }
        }
        
        sc.close();
    }
}
