// Bai 28. Kiem tra n co phai la so nguyen to hay khong?
// So nguyen to la so lon hon 1 va chi chia het cho 1 va chinh no
import java.util.Scanner;

public class Bai28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println(n + " KHONG phai so nguyen to!");
        } else {
            int dem = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    dem = dem + 1;
                }
            }
            
            if (dem == 0) {
                System.out.println(n + " LA so nguyen to!");
            } else {
                System.out.println(n + " KHONG phai so nguyen to!");
            }
        }
        
        scanner.close();
    }
}
