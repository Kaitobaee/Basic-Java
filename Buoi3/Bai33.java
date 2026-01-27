// Bai 33. Tinh S = 1 - 2 + 3 - 4 + ... + (-1)^(n+1) * n, voi n > 0
// Quy luat: so le thi cong, so chan thi tru
import java.util.Scanner;

public class Bai33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("n phai > 0!");
        } else {
            int S = 0;
            
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    // i le thi cong
                    S = S + i;
                } else {
                    // i chan thi tru
                    S = S - i;
                }
            }
            
            System.out.println("S = 1 - 2 + 3 - 4 + ... = " + S);
        }
        
        scanner.close();
    }
}
