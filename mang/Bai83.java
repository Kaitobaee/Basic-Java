import java.util.Scanner;

// Bai 83: Tim so chan cuoi cung trong mang
public class Bai83 {
    
    static int timSoChanCuoi(int[] a, int n) {
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                return a[i];
            }
        }
        return -1;
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
        
        int kq = timSoChanCuoi(a, n);
        if (kq == -1) {
            System.out.println("Khong co so chan trong mang");
        } else {
            System.out.println("So chan cuoi cung: " + kq);
        }
        sc.close();
    }
}
