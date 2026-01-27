import java.util.Scanner;

// Bai 90: Dem cac phan tu nho hon x trong mang
public class Bai90 {
    
    static int demNhoHonX(int[] a, int n, int x) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < x) dem++;
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
        
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        
        System.out.println("So phan tu nho hon " + x + ": " + demNhoHonX(a, n, x));
        sc.close();
    }
}
