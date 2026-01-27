import java.util.Scanner;

// Bai 63: Nhap xuat mang mot chieu cac so nguyen
public class Bai63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Nhap " + n + " phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
