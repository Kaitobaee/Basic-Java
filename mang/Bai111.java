import java.util.Scanner;

// Bai 111: Chen phan tu x vao dau mang
public class Bai111 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Nhap gia tri x can chen vao dau: ");
        int x = sc.nextInt();
        
        // Dich tat ca phan tu sang phai
        for (int i = n; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = x;
        n++;
        
        System.out.print("Mang sau khi chen vao dau: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
