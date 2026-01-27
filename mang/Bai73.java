import java.util.Scanner;

// Bai 73: Tim vi tri phan tu co gia tri x xuat hien cuoi cung
public class Bai73 {
    
    static int timViTriCuoi(int[] a, int n, int x) {
        int viTri = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
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
        
        System.out.print("Nhap x can tim: ");
        int x = sc.nextInt();
        
        int viTri = timViTriCuoi(a, n, x);
        if (viTri == -1) {
            System.out.println("Khong tim thay " + x + " trong mang");
        } else {
            System.out.println("Vi tri cuoi cung cua " + x + " la: " + viTri);
        }
        sc.close();
    }
}
