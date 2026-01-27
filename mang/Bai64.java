import java.util.Scanner;

// Bai 64: Khoi tao mang n phan tu toan 0
public class Bai64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Mang khoi tao: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
