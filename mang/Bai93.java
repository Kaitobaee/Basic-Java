import java.util.Scanner;

// Bai 93: Dem cac phan tu la so chinh phuong trong mang
public class Bai93 {
    
    static boolean laSoChinhPhuong(int n) {
        if (n < 0) return false;
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
    
    static int demChinhPhuong(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (laSoChinhPhuong(a[i])) dem++;
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
        
        System.out.println("So phan tu chinh phuong: " + demChinhPhuong(a, n));
        sc.close();
    }
}
