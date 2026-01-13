// Bai 32. Tinh S = 1 + 3 + 5 + ... + (2n + 1), voi n >= 0
// Day cac so le tu 1 den (2n + 1)
import java.util.Scanner;

public class Bai32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("n phai >= 0!");
        } else {
            int S = 0;
            int soCuoi = 2 * n + 1;
            
            for (int i = 1; i <= soCuoi; i = i + 2) {
                S = S + i;
            }
            
            System.out.println("S = 1 + 3 + 5 + ... + " + soCuoi + " = " + S);
        }
        
        scanner.close();
    }
}
