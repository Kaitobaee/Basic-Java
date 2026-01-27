// Bài 25. Nhập số nguyên dương n. Kiểm tra n có phải số chính phương không?
// Số chính phương là số khi lấy căn bậc 2 có kết quả là số nguyên.
import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("So khong hop le! Vui long nhap so nguyen duong.");
        } else {
            // Tinh can bac 2
            int canBac2 = (int) Math.sqrt(n);
            
            // Kiem tra xem can bac 2 co phai la so nguyen khong
            if (canBac2 * canBac2 == n) {
                System.out.println(n + " LA so chinh phuong!");
                System.out.println("Vi " + n + " = " + canBac2 + " * " + canBac2);
            } else {
                System.out.println(n + " KHONG PHAI la so chinh phuong!");
            }
        }
        
        scanner.close();
    }
}
