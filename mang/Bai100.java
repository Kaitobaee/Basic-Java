import java.util.Scanner;

// Bai 100: Tinh trung binh cong cac phan tu nguyen to trong mang
public class Bai100 {
    
    static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    static double tinhTrungBinhNguyenTo(int[] a, int n) {
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (laSoNguyenTo(a[i])) {
                tong += a[i];
                dem++;
            }
        }
        if (dem == 0) return 0;
        return (double) tong / dem;
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
        
        double tb = tinhTrungBinhNguyenTo(a, n);
        if (tb == 0) {
            System.out.println("Khong co so nguyen to trong mang");
        } else {
            System.out.println("Trung binh cong cac so nguyen to: " + tb);
        }
        sc.close();
    }
}
