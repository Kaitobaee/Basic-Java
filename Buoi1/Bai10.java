import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.print("Nhap c: ");
        int c = sc.nextInt();

        System.out.print("Nhap d: ");
        int d = sc.nextInt();

        double trungBinh = (a + b + c + d) / 4.0;

        System.out.println("Trung binh cong = " + trungBinh);

        sc.close();
    }
}
