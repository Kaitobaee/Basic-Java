import java.util.Scanner;

// Bai 117: Xoa cac phan tu trung lap, chi giu lai phan tu duy nhat
public class Bai117 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Mang ban dau: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        // Xoa cac phan tu trung lap
        int i = 0;
        while (i < n) {
            int j = i + 1;
            while (j < n) {
                if (a[j] == a[i]) {
                    // Xoa phan tu tai vi tri j
                    for (int k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    n--;
                } else {
                    j++;
                }
            }
            i++;
        }
        
        System.out.print("Mang sau khi xoa trung lap: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
