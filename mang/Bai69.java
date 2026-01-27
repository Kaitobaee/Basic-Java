import java.util.Scanner;

// Bai 69: Xuat cac phan tu le trong mang
public class Bai69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Cac phan tu le: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}
