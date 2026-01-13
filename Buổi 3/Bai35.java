// Bai 35. Tinh P = 1 * 3 * 5 * ... * (2n + 1), voi n >= 0
// Tich cac so le tu 1 den (2n + 1)
import java.util.Scanner;

public class Bai35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("n phai >= 0!");
        } else {
            long P = 1;
            int soCuoi = 2 * n + 1;
            
            for (int i = 1; i <= soCuoi; i = i + 2) {
                P = P * i;
            }
            
            System.out.println("P = 1 * 3 * 5 * ... * " + soCuoi + " = " + P);
        }
        
        scanner.close();
    }
}
