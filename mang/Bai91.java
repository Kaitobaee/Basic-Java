import java.util.Scanner;

// Bai 91: Dem cac phan tu la so nguyen to trong mang
public class Bai91 {
    
    static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    static int demNguyenTo(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (laSoNguyenTo(a[i])) dem++;
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
        
        System.out.println("So phan tu nguyen to: " + demNguyenTo(a, n));
        sc.close();
    }
}
