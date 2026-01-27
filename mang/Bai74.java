import java.util.Scanner;

// Bai 74: Tim phan tu nho nhat trong mang
public class Bai74 {
    
    static int timMin(int[] a, int n) {
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
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
        
        System.out.println("Phan tu nho nhat: " + timMin(a, n));
        sc.close();
    }
}
