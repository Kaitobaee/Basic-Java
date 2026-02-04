import java.util.Scanner;

public class btkt {

    // Bai 80: Tim vi tri phan tu duong dau tien
    static int timViTriDuongDauTien(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                return i;
            }
        }
        return -1;
    }

    // Bai 81: Tim vi tri phan tu duong be nhat
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

        int chon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tim vi tri so duong dau tien");
            System.out.println("2. Tim vi tri so duong be nhat");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    int vt1 = timViTriDuongDauTien(a, n);
                    if (vt1 == -1)
                        System.out.println("Khong co phan tu duong trong mang");
                    else
                        System.out.println("Vi tri duong dau tien: " + vt1);
                    break;

                case 2:
                    int vt2 = timViTriDuongBeNhat(a, n);
                    if (vt2 == -1)
                        System.out.println("Khong co phan tu duong trong mang");
                    else {
                        System.out.println("Vi tri duong be nhat: " + vt2);
                        System.out.println("Gia tri: " + a[vt2]);
                    }
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}
