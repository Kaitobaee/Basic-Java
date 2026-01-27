// Bài 22. Nhập vào giờ, phút, giây. Kiểm tra xem có hợp lệ hay không?
import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap gio: ");
        int gio = scanner.nextInt();
        
        System.out.print("Nhap phut: ");
        int phut = scanner.nextInt();
        
        System.out.print("Nhap giay: ");
        int giay = scanner.nextInt();
        
        System.out.println("Thoi gian nhap vao: " + gio + ":" + phut + ":" + giay);
        
        if (gio >= 0 && gio <= 23 && phut >= 0 && phut <= 59 && giay >= 0 && giay <= 59) {
            System.out.println("Thoi gian HOP LE!");
        } else {
            System.out.println("Thoi gian KHONG HOP LE!");
            if (gio < 0 || gio > 23) {
                System.out.println("- Gio phai tu 0 den 23");
            }
            if (phut < 0 || phut > 59) {
                System.out.println("- Phut phai tu 0 den 59");
            }
            if (giay < 0 || giay > 59) {
                System.out.println("- Giay phai tu 0 den 59");
            }
        }
        
        scanner.close();
    }
}
