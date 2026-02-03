import java.util.Scanner;

// Bài 52: Kiểm tra 3 cạnh tam giác và tính diện tích, đường cao
public class Bai52 {
    
    // Hàm kiểm tra có tạo thành tam giác không
    public static boolean laTamGiac(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && c + a > b;
    }
    
    // Hàm tính nửa chu vi
    public static double tinhNuaChuVi(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    
    // Hàm tính diện tích tam giác theo công thức Heron
    public static double tinhDienTich(double a, double b, double c) {
        double p = tinhNuaChuVi(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    // Hàm tính đường cao
    public static double tinhDuongCao(double dienTich, double canh) {
        return 2 * dienTich / canh;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();
        
        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();
        
        if (laTamGiac(a, b, c)) {
            System.out.println("Ba số a, b, c có thể tạo thành tam giác.");
            
            double dienTich = tinhDienTich(a, b, c);
            
            System.out.println("Diện tích tam giác: " + dienTich);
            System.out.println("Đường cao ha: " + tinhDuongCao(dienTich, a));
            System.out.println("Đường cao hb: " + tinhDuongCao(dienTich, b));
            System.out.println("Đường cao hc: " + tinhDuongCao(dienTich, c));
        } else {
            System.out.println("Ba số a, b, c không thể tạo thành tam giác.");
        }
        
        sc.close();
    }
}
