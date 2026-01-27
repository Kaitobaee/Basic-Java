import java.util.Scanner;

// Bai 97: Tinh tong cac phan tu duong trong mang
public class Bai97 {
    
    static int tinhTongDuong(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
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
        
        System.out.println("Tong cac phan tu duong: " + tinhTongDuong(a, n));
        sc.close();
    }
}
