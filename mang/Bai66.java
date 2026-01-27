import java.util.Scanner;

// Bai 66: Phat sinh ngau nhien mang so nguyen am
public class Bai66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        System.out.print("Nhap gioi han am (VD: 100 tao tu -100 den -1): ");
        int bound = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = -((int)(Math.random() * bound) + 1);
        }
        
        System.out.print("Mang am: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
