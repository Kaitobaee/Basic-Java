import java.util.Scanner;

// Bai 77: In vi tri cac phan tu nguyen to lon hon 23
public class Bai77 {
    
    static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    static void inViTriNguyenToLonHon23(int[] a, int n) {
        System.out.print("Vi tri cac phan tu nguyen to > 23: ");
        for (int i = 0; i < n; i++) {
            if (laSoNguyenTo(a[i]) && a[i] > 23) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
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
        
        inViTriNguyenToLonHon23(a, n);
        sc.close();
    }
}
