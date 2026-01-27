import java.util.Scanner;

// Bai 102: Tim cuc tieu dia phuong trong mang
public class Bai102 {
    
    static void timCucTieuDiaPhuong(int[] a, int n) {
        System.out.print("Cac cuc tieu dia phuong: ");
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            boolean laCucTieu = true;
            
            if (i > 0 && a[i] >= a[i - 1]) {
                laCucTieu = false;
            }
            if (i < n - 1 && a[i] >= a[i + 1]) {
                laCucTieu = false;
            }
            
            if (laCucTieu) {
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
        
        timCucTieuDiaPhuong(a, n);
        sc.close();
    }
}
