import java.util.Scanner;

// Bai 67: Phat sinh ngau nhien mang tang dan (khong sap xep)
public class Bai67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        int current = (int)(Math.random() * 10);
        for (int i = 0; i < n; i++) {
            a[i] = current;
            current += (int)(Math.random() * 10) + 1;
        }
        
        System.out.print("Mang tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
