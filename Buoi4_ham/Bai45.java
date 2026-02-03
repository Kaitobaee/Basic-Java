import java.util.Scanner;

// Bài 45: Tính diện tích và chu vi hình tròn
public class Bai45 {
    
    // Hàm tính diện tích hình tròn
    public static double tinhDienTich(double banKinh) {
        return Math.PI * banKinh * banKinh;
    }
    
    // Hàm tính chu vi hình tròn
    public static double tinhChuVi(double banKinh) {
        return 2 * Math.PI * banKinh;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập bán kính: ");
        double banKinh = sc.nextDouble();
        
        System.out.println("Diện tích hình tròn: " + tinhDienTich(banKinh));
        System.out.println("Chu vi hình tròn: " + tinhChuVi(banKinh));
        
        sc.close();
    }
}
