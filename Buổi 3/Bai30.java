// Bai 30. Kiem tra n co phai la so hoan thien hay khong?
// So hoan thien la so co tong cac uoc (khong ke no) bang chinh no.
// Vi du: 6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14
import java.util.Scanner;

public class Bai30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("So khong hop le!");
        } else {
            int tong = 0;
            
            // Tinh tong cac uoc so (khong ke n)
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    tong = tong + i;
                }
            }
            
            System.out.print("Cac uoc so cua " + n + " (khong ke " + n + "): ");
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("Tong cac uoc: " + tong);
            
            if (tong == n) {
                System.out.println(n + " LA so hoan thien!");
            } else {
                System.out.println(n + " KHONG phai so hoan thien!");
            }
        }
        
        scanner.close();
    }
}
