import java.util.Scanner;

// Bài 44: Tính diện tích và chu vi hình chữ nhật
public class Bai44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập chiều dài: ");
        double chieuDai = sc.nextDouble();
        
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = sc.nextDouble();
        
        double dienTich = chieuDai * chieuRong;
        double chuVi = 2 * (chieuDai + chieuRong);
        
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        
        sc.close();
    }
}
