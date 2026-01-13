// Bai 40. Tinh S = (1+2)/2! + (1+2+3)/3! + ... + (1+2+...+n)/n!, voi n > 0
// Tu so: tong tu 1 den i
// Mau so: i!
import java.util.Scanner;

public class Bai40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("n phai > 0!");
        } else {
            double S = 0;
            long giaithua = 1;
            int tong = 0;
            
            for (int i = 1; i <= n; i++) {
                tong = tong + i;           // tong = 1 + 2 + ... + i
                giaithua = giaithua * i;   // giaithua = i!
                
                if (i >= 2) {
                    S = S + (double) tong / giaithua;
                }
            }
            
            System.out.println("S = (1+2)/2! + (1+2+3)/3! + ... + (1+2+...+" + n + ")/" + n + "! = " + S);
        }
        
        scanner.close();
    }
}
