import java.util.Scanner;

// Bai 88: Dem cac phan tu chan va le trong mang
public class Bai88 {
    
    static int demChan(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) dem++;
        }
        return dem;
    }
    
    static int demLe(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) dem++;
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
        
        System.out.println("So phan tu chan: " + demChan(a, n));
        System.out.println("So phan tu le: " + demLe(a, n));
        sc.close();
    }
}
