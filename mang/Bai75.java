import java.util.Scanner;

// Bai 75: Tim vi tri phan tu nho nhat trong mang
public class Bai75 {
    
    static int timViTriMin(int[] a, int n) {
        int viTri = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[viTri]) {
                viTri = i;
            }
        }
        return viTri;
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
        
        int viTri = timViTriMin(a, n);
        System.out.println("Vi tri phan tu nho nhat: " + viTri);
        System.out.println("Gia tri: " + a[viTri]);
        sc.close();
    }
}
