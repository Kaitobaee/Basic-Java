import java.util.Scanner;

// Bai 109: Sap xep cac so chan giam dan, so le giu nguyen vi tri
public class Bai109 {
    
    static void sapXepChanGiamDan(int[] a, int n) {
        // Tim va sap xep cac so chan giam dan
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] % 2 == 0 && a[j] % 2 == 0) {
                    if (a[i] < a[j]) {
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
        
        sapXepChanGiamDan(a, n);
        
        System.out.print("Mang sau khi sap xep so chan giam dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
