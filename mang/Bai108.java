import java.util.Scanner;

// Bai 108: Sap xep cac so le tang dan, so chan giu nguyen vi tri
public class Bai108 {
    
    static void sapXepLeTangDan(int[] a, int n) {
        // Tim va sap xep cac so le
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] % 2 != 0 && a[j] % 2 != 0) {
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
        
        sapXepLeTangDan(a, n);
        
        System.out.print("Mang sau khi sap xep so le tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
