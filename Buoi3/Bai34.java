// Bai 34. Tinh P = n!, voi n >= 0
// n! = 1 * 2 * 3 * ... * n
// 0! = 1
import java.util.Scanner;

public class Bai34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("n phai >= 0!");
        } else {
            long P = 1;
            
            for (int i = 1; i <= n; i++) {
                P = P * i;
            }
            
            System.out.println(n + "! = " + P);
        }
        
        scanner.close();
    }
}
