import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap gio: ");
        int gio = sc.nextInt();

        System.out.print("Nhap phut: ");
        int phut = sc.nextInt();

        System.out.print("Nhap giay: ");
        int giay = sc.nextInt();

        int tongGiay = gio * 3600 + phut * 60 + giay;

        System.out.println("Tong so giay la: " + tongGiay);

        sc.close();
    }
}
