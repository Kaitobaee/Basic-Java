import java.util.Scanner;

// Bai 107: Sap xep cac so nguyen to trong mang tang dan
public class Bai107 {
    
    static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    static void sapXepNguyenToTangDan(int[] a, int n) {
        // Sap xep cac so nguyen to tang dan, giu nguyen vi tri tuong doi
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (laSoNguyenTo(a[i]) && laSoNguyenTo(a[j])) {
                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
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
        
        System.out.print("Cac so nguyen to: ");
        for (int i = 0; i < n; i++) {
            if (laSoNguyenTo(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        
        sapXepNguyenToTangDan(a, n);
        
        System.out.print("Mang sau khi sap xep nguyen to tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
