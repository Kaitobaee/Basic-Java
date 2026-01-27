import java.util.Scanner;

// Bai 106: Sap xep mang giam dan
public class Bai106 {
    
    static void sapXepGiamDan(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
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
        
        sapXepGiamDan(a, n);
        
        System.out.print("Mang sau khi sap xep giam dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
