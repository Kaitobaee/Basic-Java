import java.util.Scanner;

// Bài 52: Kiểm tra 3 cạnh tam giác và tính diện tích, đường cao
public class Bai52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();
        
        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();
        
        // Kiểm tra điều kiện tạo thành tam giác
        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && c + a > b) {
            System.out.println("Ba số a, b, c có thể tạo thành tam giác.");
            
            // Tính nửa chu vi
            double p = (a + b + c) / 2;
            
            // Tính diện tích theo công thức Heron
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            
            // Tính đường cao
            double ha = 2 * dienTich / a;
            double hb = 2 * dienTich / b;
            double hc = 2 * dienTich / c;
            
            System.out.println("Diện tích tam giác: " + dienTich);
            System.out.println("Đường cao ha: " + ha);
            System.out.println("Đường cao hb: " + hb);
            System.out.println("Đường cao hc: " + hc);
        } else {
            System.out.println("Ba số a, b, c không thể tạo thành tam giác.");
        }
        
        sc.close();
    }
}
