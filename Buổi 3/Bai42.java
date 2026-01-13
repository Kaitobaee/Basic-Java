// Bai 42. Tinh P = x^y (x mu y)
import java.util.Scanner;

public class Bai42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap x: ");
        int x = scanner.nextInt();
        
        System.out.print("Nhap y: ");
        int y = scanner.nextInt();
        
        if (y < 0) {
            System.out.println("y phai >= 0!");
        } else {
            long P = 1;
            
            for (int i = 1; i <= y; i++) {
                P = P * x;
            }
            
            System.out.println(x + "^" + y + " = " + P);
        }
        
        scanner.close();
    }
}
