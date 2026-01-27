import java.util.Scanner;

// Bai 115: Xoa phan tu cuoi cung trong mang
public class Bai115 {
    
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
            System.out.println("Phan tu bi xoa: " + a[n - 1]);
            n--;
            
            System.out.print("Mang sau khi xoa phan tu cuoi: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}
