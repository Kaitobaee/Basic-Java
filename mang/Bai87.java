import java.util.Scanner;

// Bai 87: Dem cac phan tu am va duong trong mang
public class Bai87 {
    
    static int demAm(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) dem++;
        }
        return dem;
    }
    
    static int demDuong(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) dem++;
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
        
        System.out.println("So phan tu am: " + demAm(a, n));
        System.out.println("So phan tu duong: " + demDuong(a, n));
        sc.close();
    }
}
