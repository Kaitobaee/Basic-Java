import java.util.Scanner;

// Bai 96: Tinh tong cac phan tu le trong mang
public class Bai96 {
    
    static int tinhTongLe(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                tong += a[i];
            }
        }
        return tong;
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
        
        System.out.println("Tong cac phan tu le: " + tinhTongLe(a, n));
        sc.close();
    }
}
