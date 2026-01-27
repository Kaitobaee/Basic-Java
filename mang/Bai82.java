import java.util.Scanner;

// Bai 82: In cac phan tu la boi cua 3 hoac 5
public class Bai82 {
    
    static void inBoiCua3Hoac5(int[] a, int n) {
        System.out.print("Cac phan tu la boi cua 3 hoac 5: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0 || a[i] % 5 == 0) {
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
        
        inBoiCua3Hoac5(a, n);
        sc.close();
    }
}
