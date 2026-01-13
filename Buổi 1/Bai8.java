import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tong so giay: ");
        int tongGiay = sc.nextInt();

        int gio = tongGiay / 3600;
        int phut = (tongGiay % 3600) / 60;
        int giay = tongGiay % 60;

        System.out.println("Thoi gian: " + gio + " gio " + phut + " phut " + giay + " giay");

        sc.close();
    }
}
