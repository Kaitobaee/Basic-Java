import java.util.Scanner;

// Bài 50: Tính tiền thuê máy Internet
// Điều kiện: 6 <= GBD < GKT <= 21
// Đơn giá: 2500đ/giờ trước 17h, 3000đ/giờ sau 17h
public class Bai50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập giờ bắt đầu thuê (6-20): ");
        int gbd = sc.nextInt();
        
        System.out.print("Nhập giờ kết thúc thuê (7-21): ");
        int gkt = sc.nextInt();
        
        if (gbd < 6 || gkt > 21 || gbd >= gkt) {
            System.out.println("Dữ liệu nhập không hợp lệ!");
        } else {
            int tienThue = 0;
            
            for (int i = gbd; i < gkt; i++) {
                if (i < 17) {
                    tienThue += 2500;
                } else {
                    tienThue += 3000;
                }
            }
            
            System.out.println("Số giờ thuê: " + (gkt - gbd) + " giờ");
            System.out.println("Tiền thuê máy: " + tienThue + " đồng");
        }
        
        sc.close();
    }
}
