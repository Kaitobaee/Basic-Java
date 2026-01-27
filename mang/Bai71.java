import java.util.Scanner;

// Bai 71: Xuat cac phan tu la so nguyen to
public class Bai71 {
    
    static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
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
        
        System.out.print("Cac phan tu nguyen to: ");
        for (int i = 0; i < n; i++) {
            if (laSoNguyenTo(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}
