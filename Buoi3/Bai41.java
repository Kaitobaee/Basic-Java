// Bai 41. Tinh S = 1 + 1/(1+2) + 1/(1+2+3) + ... + 1/(1+2+...+n), voi n > 0
import java.util.Scanner;

public class Bai41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("n phai > 0!");
        } else {
            double S = 0;
            int tong = 0;
            
            for (int i = 1; i <= n; i++) {
                tong = tong + i;           // tong = 1 + 2 + ... + i
                S = S + 1.0 / tong;
            }
            
            System.out.println("S = 1 + 1/(1+2) + 1/(1+2+3) + ... = " + S);
        }
        
        scanner.close();
    }
}
