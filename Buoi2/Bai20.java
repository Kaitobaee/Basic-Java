// Bài 20. Nhập vào một số nguyên n gồm ba chữ số. 
// Xuất ra màn hình chữ số lớn nhất ở vị trí nào?
import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen n gom 3 chu so: ");
        int n = scanner.nextInt();
        
        if (n < 100 || n > 999) {
            System.out.println("So khong hop le! Vui long nhap so co 3 chu so.");
        } else {
            // Tach cac chu so
            int donVi = n % 10;
            int chuc = (n / 10) % 10;
            int tram = n / 100;
            
            System.out.println("Chu so hang tram: " + tram);
            System.out.println("Chu so hang chuc: " + chuc);
            System.out.println("Chu so hang don vi: " + donVi);
            
            // Tim chu so lon nhat
            int max = tram;
            String viTri = "hang tram";
            
            if (chuc > max) {
                max = chuc;
                viTri = "hang chuc";
            }
            if (donVi > max) {
                max = donVi;
                viTri = "hang don vi";
            }
            
            System.out.println("Chu so lon nhat la " + max + " nam o " + viTri);
        }
        
        scanner.close();
    }
}
