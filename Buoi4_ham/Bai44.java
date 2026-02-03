import java.util.Scanner;

// Bài 44: Tính diện tích và chu vi hình chữ nhật
public class Bai44 {
    
    // Hàm tính diện tích hình chữ nhật
    public static double tinhDienTich(double chieuDai, double chieuRong) {
        return chieuDai * chieuRong;
    }
    
    // Hàm tính chu vi hình chữ nhật
    public static double tinhChuVi(double chieuDai, double chieuRong) {
        return 2 * (chieuDai + chieuRong);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập chiều dài: ");
        double chieuDai = sc.nextDouble();
        
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = sc.nextDouble();
        
        System.out.println("Diện tích hình chữ nhật: " + tinhDienTich(chieuDai, chieuRong));
        System.out.println("Chu vi hình chữ nhật: " + tinhChuVi(chieuDai, chieuRong));
        
        sc.close();
    }
}
