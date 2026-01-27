// Bài 21. Nhập vào một số nguyên n gồm ba chữ số. 
// Xuất ra màn hình theo thứ tự tăng dần của các chữ số.
import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen n gom 3 chu so: ");
        int n = scanner.nextInt();
        
        if (n < 100 || n > 999) {
            System.out.println("So khong hop le!");
        } else {
            // Tach cac chu so
            int a = n % 10;
            int b = (n / 10) % 10;
            int c = n / 100;
            
            System.out.println("Cac chu so: " + c + ", " + b + ", " + a);
            
            // Sap xep tang dan
            int temp;
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (a > c) {
                temp = a;
                a = c;
                c = temp;
            }
            if (b > c) {
                temp = b;
                b = c;
                c = temp;
            }
            
            // Ghep lai thanh so moi
            int ketQua = a * 100 + b * 10 + c;
            
            System.out.println("Thu tu tang dan: " + a + ", " + b + ", " + c);
            System.out.println("So moi: " + ketQua);
        }
        
        scanner.close();
    }
}
