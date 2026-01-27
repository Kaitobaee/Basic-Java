import java.util.Scanner;

// Bai 101: Tim cuc dai dia phuong trong mang
public class Bai101 {
    
    static void timCucDaiDiaPhuong(int[] a, int n) {
        System.out.print("Cac cuc dai dia phuong: ");
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            boolean laCucDai = true;
            
            if (i > 0 && a[i] <= a[i - 1]) {
                laCucDai = false;
            }
            if (i < n - 1 && a[i] <= a[i + 1]) {
                laCucDai = false;
            }
            
            if (laCucDai) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.print("Khong co");
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
        
        timCucDaiDiaPhuong(a, n);
        sc.close();
    }
}
