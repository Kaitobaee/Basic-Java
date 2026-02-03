import java.util.Scanner;

// Bài 50: Tính tiền thuê máy Internet
// Điều kiện: 6 <= GBD < GKT <= 21
// Đơn giá: 2500đ/giờ trước 17h, 3000đ/giờ sau 17h
public class Bai50 {
    
    // Hàm kiểm tra dữ liệu hợp lệ
    public static boolean kiemTraHopLe(int gbd, int gkt) {
        return gbd >= 6 && gkt <= 21 && gbd < gkt;
    }
    
    // Hàm tính số giờ thuê
    public static int tinhSoGioThue(int gbd, int gkt) {
        return gkt - gbd;
    }
    
    // Hàm tính tiền thuê máy
    public static int tinhTienThue(int gbd, int gkt) {
        int tienThue = 0;
        for (int i = gbd; i < gkt; i++) {
            if (i < 17) {
                tienThue += 2500;
            } else {
                tienThue += 3000;
            }
        }
        return tienThue;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập giờ bắt đầu thuê (6-20): ");
        int gbd = sc.nextInt();
        
        System.out.print("Nhập giờ kết thúc thuê (7-21): ");
        int gkt = sc.nextInt();
        
        if (!kiemTraHopLe(gbd, gkt)) {
            System.out.println("Dữ liệu nhập không hợp lệ!");
        } else {
            System.out.println("Số giờ thuê: " + tinhSoGioThue(gbd, gkt) + " giờ");
            System.out.println("Tiền thuê máy: " + tinhTienThue(gbd, gkt) + " đồng");
        }
        
        sc.close();
    }
}
