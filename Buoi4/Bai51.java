import java.util.Scanner;

// Bài 51: Tính tiền lương ngày cho công nhân
// Giờ vào ca: từ 6h, giờ ra ca: đến 18h
// Tiền: 6000đ/giờ trước 12h, 7500đ/giờ sau 12h
public class Bai51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập giờ vào ca (6-17): ");
        int gioVao = sc.nextInt();
        
        System.out.print("Nhập giờ ra ca (7-18): ");
        int gioRa = sc.nextInt();
        
        if (gioVao < 6 || gioRa > 18 || gioVao >= gioRa) {
            System.out.println("Dữ liệu nhập không hợp lệ!");
        } else {
            int luong = 0;
            
            for (int i = gioVao; i < gioRa; i++) {
                if (i < 12) {
                    luong += 6000;
                } else {
                    luong += 7500;
                }
            }
            
            System.out.println("Số giờ làm việc: " + (gioRa - gioVao) + " giờ");
            System.out.println("Tiền lương ngày: " + luong + " đồng");
        }
        
        sc.close();
    }
}
