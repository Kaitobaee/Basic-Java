import java.util.Scanner;

// Bai 114: Xoa phan tu dau tien trong mang
public class Bai114 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        if (n == 0) {
            System.out.println("Mang rong!");
        } else {
            System.out.println("Phan tu bi xoa: " + a[0]);
            
            // Dich tat ca phan tu sang trai
            for (int i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            n--;
            
            System.out.print("Mang sau khi xoa phan tu dau: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}
