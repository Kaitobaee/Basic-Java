import java.util.Scanner;

// Bài 45: Tính diện tích và chu vi hình tròn
public class Bai45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập bán kính: ");
        double banKinh = sc.nextDouble();
        
        double dienTich = Math.PI * banKinh * banKinh;
        double chuVi = 2 * Math.PI * banKinh;
        
        System.out.println("Diện tích hình tròn: " + dienTich);
        System.out.println("Chu vi hình tròn: " + chuVi);
        
        sc.close();
    }
}
