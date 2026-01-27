import java.util.Scanner;

// Bai 84: Tim so le lon nhat trong mang
public class Bai84 {
    
    static int timSoLeLonNhat(int[] a, int n) {
        int maxLe = Integer.MIN_VALUE;
        boolean coSoLe = false;
        
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                if (a[i] > maxLe) {
                    maxLe = a[i];
                }
                coSoLe = true;
            }
        }
        
        if (coSoLe) {
            return maxLe;
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
        
        int kq = timSoLeLonNhat(a, n);
        if (kq == -1) {
            System.out.println("Khong co so le trong mang");
        } else {
            System.out.println("So le lon nhat: " + kq);
        }
        sc.close();
    }
}
