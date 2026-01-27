// Bai 36. Tinh S = 1^2 + 2^2 + 3^2 + ... + n^2, voi n > 0
// Tong cac binh phuong tu 1 den n
import java.util.Scanner;

public class Bai36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("n phai > 0!");
        } else {
            long S = 0;
            
            for (int i = 1; i <= n; i++) {
                S = S + i * i;
            }
            
            System.out.println("S = 1^2 + 2^2 + 3^2 + ... + " + n + "^2 = " + S);
        }
        
        scanner.close();
    }
}
