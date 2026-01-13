// Bai 38. Tinh S = 1 + 1*2 + 1*2*3 + ... + 1*2*3*...*n, voi n > 0
// S = 1! + 2! + 3! + ... + n!
import java.util.Scanner;

public class Bai38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("n phai > 0!");
        } else {
            long S = 0;
            long giaithua = 1;
            
            for (int i = 1; i <= n; i++) {
                giaithua = giaithua * i;  // Tinh i!
                S = S + giaithua;
            }
            
            System.out.println("S = 1! + 2! + 3! + ... + " + n + "! = " + S);
        }
        
        scanner.close();
    }
}
