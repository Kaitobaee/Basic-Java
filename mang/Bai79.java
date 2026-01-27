import java.util.Scanner;

// Bai 79: Tim vi tri phan tu am lon nhat
public class Bai79 {
    
    static int timViTriAmLonNhat(int[] a, int n) {
        int viTri = -1;
        int maxAm = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (a[i] < 0 && a[i] > maxAm) {
                maxAm = a[i];
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
        
        int viTri = timViTriAmLonNhat(a, n);
        if (viTri == -1) {
            System.out.println("Khong co phan tu am trong mang");
        } else {
            System.out.println("Vi tri phan tu am lon nhat: " + viTri);
            System.out.println("Gia tri: " + a[viTri]);
        }
        sc.close();
    }
}
