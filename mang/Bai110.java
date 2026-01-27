import java.util.Scanner;

// Bai 110: Chen phan tu x vao vi tri k trong mang
public class Bai110 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Nhap gia tri x can chen: ");
        int x = sc.nextInt();
        
        System.out.print("Nhap vi tri k (0 den " + n + "): ");
        int k = sc.nextInt();
        
        if (k < 0 || k > n) {
            System.out.println("Vi tri khong hop le!");
        } else {
            // Dich cac phan tu tu k den cuoi sang phai 1 vi tri
            for (int i = n; i > k; i--) {
                a[i] = a[i - 1];
            }
            a[k] = x;
            n++;
            
            System.out.print("Mang sau khi chen: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}
