import java.util.Scanner;

// Bai 85: Doi cho phan tu lon nhat voi phan tu nho nhat
public class Bai85 {
    
    static int timViTriMax(int[] a, int n) {
        int viTri = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[viTri]) {
                viTri = i;
            }
        }
        return viTri;
    }
    
    static int timViTriMin(int[] a, int n) {
        int viTri = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[viTri]) {
                viTri = i;
            }
        }
        return viTri;
    }
    
    static void doiCho(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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
        
        int viTriMax = timViTriMax(a, n);
        int viTriMin = timViTriMin(a, n);
        
        System.out.println("Max = " + a[viTriMax] + " tai vi tri " + viTriMax);
        System.out.println("Min = " + a[viTriMin] + " tai vi tri " + viTriMin);
        
        doiCho(a, viTriMax, viTriMin);
        
        System.out.print("Mang sau khi doi cho: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
