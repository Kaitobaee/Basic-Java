import java.util.Scanner;

// Bai 98: Tinh tong cac phan tu am trong mang
public class Bai98 {
    
    static int tinhTongAm(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
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
        
        System.out.println("Tong cac phan tu am: " + tinhTongAm(a, n));
        sc.close();
    }
}
