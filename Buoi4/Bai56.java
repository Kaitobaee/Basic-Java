import java.util.Scanner;

// Bài 56: Đếm số chữ số chẵn và lẻ trong số n
public class Bai56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương n (0 < k <= 5 chữ số): ");
        int n = sc.nextInt();
        
        if (n <= 0 || n > 99999) {
            System.out.println("Số không hợp lệ!");
        } else {
            int demChan = 0;
            int demLe = 0;
            int temp = n;
            
            while (temp > 0) {
                int chuSo = temp % 10;
                if (chuSo % 2 == 0) {
                    demChan++;
                } else {
                    demLe++;
                }
                temp /= 10;
            }
            
            System.out.println("Số " + n + " có " + demChan + " chữ số chẵn và " + demLe + " chữ số lẻ.");
        }
        
        sc.close();
    }
}
