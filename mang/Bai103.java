import java.util.Scanner;

// Bai 103: Tinh tich cac phan tu trong mang
public class Bai103 {
    
    static long tinhTich(int[] a, int n) {
        long tich = 1;
        for (int i = 0; i < n; i++) {
            tich *= a[i];
        }
        return tich;
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
        
        System.out.println("Tich cac phan tu: " + tinhTich(a, n));
        sc.close();
    }
}
