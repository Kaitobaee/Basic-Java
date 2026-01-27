import java.util.Scanner;

// Bai 99: Tinh trung binh cong cac phan tu trong mang
public class Bai99 {
    
    static double tinhTrungBinh(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
        }
        return (double) tong / n;
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
        
        System.out.println("Trung binh cong: " + tinhTrungBinh(a, n));
        sc.close();
    }
}
