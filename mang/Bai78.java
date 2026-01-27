import java.util.Scanner;

// Bai 78: Tim vi tri phan tu am dau tien
public class Bai78 {
    
    static int timViTriAmDauTien(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                return i;
            }
        }
        return -1;
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
        
        int viTri = timViTriAmDauTien(a, n);
        if (viTri == -1) {
            System.out.println("Khong co phan tu am trong mang");
        } else {
            System.out.println("Vi tri phan tu am dau tien: " + viTri);
        }
        sc.close();
    }
}
