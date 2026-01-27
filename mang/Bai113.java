import java.util.Scanner;

// Bai 113: Xoa phan tu tai vi tri k trong mang
public class Bai113 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Nhap vi tri k can xoa (0 den " + (n - 1) + "): ");
        int k = sc.nextInt();
        
        if (k < 0 || k >= n) {
            System.out.println("Vi tri khong hop le!");
        } else {
            // Dich cac phan tu tu k+1 den cuoi sang trai 1 vi tri
            for (int i = k; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            n--;
            
            System.out.print("Mang sau khi xoa: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}
