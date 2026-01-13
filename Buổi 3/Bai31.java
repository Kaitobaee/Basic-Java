// Bai 31. Tinh S = 1 + 2 + 3 + ... + n, voi n >= 0
import java.util.Scanner;

public class Bai31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("n phai >= 0!");
        } else {
            int S = 0;
            for (int i = 1; i <= n; i++) {
                S = S + i;
            }
            
            System.out.println("S = 1 + 2 + 3 + ... + " + n + " = " + S);
        }
        
        scanner.close();
    }
}
