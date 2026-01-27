import java.util.Scanner;

// Bai 68: Xuat cac phan tu am trong mang
public class Bai68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Cac phan tu am: ");
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}
