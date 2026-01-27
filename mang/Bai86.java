import java.util.Scanner;

// Bai 86: In cac phan tu co gia tri tu 1 den X
public class Bai86 {
    
    static void inPhanTuTu1DenX(int[] a, int n, int x) {
        System.out.print("Cac phan tu tu 1 den " + x + ": ");
        for (int i = 0; i < n; i++) {
            if (a[i] >= 1 && a[i] <= x) {
                System.out.print(a[i] + " ");
            }
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
        
        System.out.print("Nhap X: ");
        int x = sc.nextInt();
        
        inPhanTuTu1DenX(a, n, x);
        sc.close();
    }
}
