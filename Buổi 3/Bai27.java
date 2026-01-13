// Bai 27. Dem so uoc so cua so nguyen duong n.
// Vi du: n = 12 => so uoc so la 6
import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("So khong hop le!");
        } else {
            int dem = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    dem = dem + 1;
                }
            }
            System.out.println("So uoc so cua " + n + " la: " + dem);
        }
        
        scanner.close();
    }
}
