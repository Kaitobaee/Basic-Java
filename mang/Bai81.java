import java.util.Scanner;

// Bai 81: Tim vi tri phan tu duong be nhat
public class Bai81 {
    
    static int timViTriDuongBeNhat(int[] a, int n) {
        int viTri = -1;
        int minDuong = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (a[i] > 0 && a[i] < minDuong) {
                minDuong = a[i];
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
        
        int viTri = timViTriDuongBeNhat(a, n);
        if (viTri == -1) {
            System.out.println("Khong co phan tu duong trong mang");
        } else {
            System.out.println("Vi tri phan tu duong be nhat: " + viTri);
            System.out.println("Gia tri: " + a[viTri]);
        }
        sc.close();
    }
}
