// Bai 37. Tinh S = 1 + 2^2 + 3^3 + ... + n^n, voi n >= 0
// Moi so hang i^i (i mu i)
import java.util.Scanner;

public class Bai37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("n phai >= 0!");
        } else {
            long S = 0;
            
            for (int i = 1; i <= n; i++) {
                // Tinh i^i (i mu i)
                long luythua = 1;
                for (int j = 1; j <= i; j++) {
                    luythua = luythua * i;
                }
                S = S + luythua;
            }
            
            System.out.println("S = 1 + 2^2 + 3^3 + ... + " + n + "^" + n + " = " + S);
        }
        
        scanner.close();
    }
}
