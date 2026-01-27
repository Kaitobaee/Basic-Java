import java.util.Scanner;

// Bai 104: Tinh tong cac phan tu o vi tri chan
public class Bai104 {
    
    static int tinhTongViTriChan(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i += 2) {
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
        
        System.out.println("Tong phan tu o vi tri chan (0, 2, 4,...): " + tinhTongViTriChan(a, n));
        sc.close();
    }
}
