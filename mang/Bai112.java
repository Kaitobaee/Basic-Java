import java.util.Scanner;

// Bai 112: Chen phan tu x vao cuoi mang
public class Bai112 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Nhap gia tri x can chen vao cuoi: ");
        int x = sc.nextInt();
        
        a[n] = x;
        n++;
        
        System.out.print("Mang sau khi chen vao cuoi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
