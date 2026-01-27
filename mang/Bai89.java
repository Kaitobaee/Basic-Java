import java.util.Scanner;

// Bai 89: Dem so lan xuat hien cua phan tu x trong mang
public class Bai89 {
    
    static int demSoLanXuatHien(int[] a, int n, int x) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) dem++;
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
        
        System.out.print("Nhap x can dem: ");
        int x = sc.nextInt();
        
        System.out.println("So lan xuat hien cua " + x + ": " + demSoLanXuatHien(a, n, x));
        sc.close();
    }
}
