import java.util.Scanner;

// Bai 92: Dem cac phan tu la so hoan thien trong mang
public class Bai92 {
    
    static boolean laSoHoanThien(int n) {
        if (n < 2) return false;
        int tong = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) tong += i;
        }
        return tong == n;
    }
    
    static int demHoanThien(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (laSoHoanThien(a[i])) dem++;
        }
        return dem;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("So phan tu hoan thien: " + demHoanThien(a, n));
        sc.close();
    }
}
