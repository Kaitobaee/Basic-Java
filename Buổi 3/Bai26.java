// Bai 26. Liet ke cac uoc so cua so nguyen duong n.
// Vi du: n = 12 => cac uoc so la 1, 2, 3, 4, 6, 12
import java.util.Scanner;

public class Bai26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("So khong hop le!");
        } else {
            System.out.print("Cac uoc so cua " + n + " la: ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        
        scanner.close();
    }
}
