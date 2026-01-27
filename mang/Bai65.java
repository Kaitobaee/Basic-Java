import java.util.Scanner;

// Bai 65: Phat sinh ngau nhien mang so nguyen
public class Bai65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        System.out.print("Nhap gia tri min: ");
        int min = sc.nextInt();
        System.out.print("Nhap gia tri max: ");
        int max = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = min + (int)(Math.random() * (max - min + 1));
        }
        
        System.out.print("Mang ngau nhien: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
