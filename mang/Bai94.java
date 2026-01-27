import java.util.Scanner;

// Bai 94: Tinh tong cac phan tu trong mang
public class Bai94 {
    
    static int tinhTong(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
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
        
        System.out.println("Tong cac phan tu: " + tinhTong(a, n));
        sc.close();
    }
}
