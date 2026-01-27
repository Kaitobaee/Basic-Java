import java.util.Scanner;

// Bai 116: Xoa tat ca phan tu co gia tri x trong mang
public class Bai116 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Nhap gia tri x can xoa: ");
        int x = sc.nextInt();
        
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                dem++;
            }
        }
        
        if (dem == 0) {
            System.out.println("Khong tim thay gia tri " + x + " trong mang!");
        } else {
            System.out.println("Da xoa " + dem + " phan tu co gia tri " + x);
            
            // Xoa tat ca phan tu co gia tri x
            int i = 0;
            while (i < n) {
                if (a[i] == x) {
                    for (int j = i; j < n - 1; j++) {
                        a[j] = a[j + 1];
                    }
                    n--;
                } else {
                    i++;
                }
            }
            
            System.out.print("Mang sau khi xoa: ");
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
        sc.close();
    }
}
