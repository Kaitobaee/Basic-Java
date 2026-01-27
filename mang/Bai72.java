import java.util.Scanner;

// Bai 72: Xuat cac so chinh phuong o vi tri le
public class Bai72 {
    
    static boolean laChinhPhuong(int n) {
        if (n < 0) return false;
        int r = (int) Math.sqrt(n);
        return r * r == n;
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
        
        System.out.print("So chinh phuong o vi tri le: ");
        for (int i = 1; i < n; i += 2) {
            if (laChinhPhuong(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}
