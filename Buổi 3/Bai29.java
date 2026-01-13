// Bai 29. Tim UCLN va BCNN cua hai so nguyen duong a va b.
// UCLN: Uoc chung lon nhat
// BCNN: Boi chung nho nhat = (a * b) / UCLN
import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();
        
        if (a <= 0 || b <= 0) {
            System.out.println("Vui long nhap so nguyen duong!");
        } else {
            // Luu gia tri ban dau de tinh BCNN
            int soA = a;
            int soB = b;
            
            // Tim UCLN bang thuat toan Euclid
            while (b != 0) {
                int du = a % b;
                a = b;
                b = du;
            }
            int ucln = a;
            
            // Tinh BCNN
            int bcnn = (soA * soB) / ucln;
            
            System.out.println("UCLN cua " + soA + " va " + soB + " la: " + ucln);
            System.out.println("BCNN cua " + soA + " va " + soB + " la: " + bcnn);
        }
        
        scanner.close();
    }
}
