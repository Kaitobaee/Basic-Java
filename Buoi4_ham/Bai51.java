import java.util.Scanner;

// Bài 51: Tính tiền lương ngày cho công nhân
// Giờ vào ca: từ 6h, giờ ra ca: đến 18h
// Tiền: 6000đ/giờ trước 12h, 7500đ/giờ sau 12h
public class Bai51 {
    
    // Hàm kiểm tra dữ liệu hợp lệ
    public static boolean kiemTraHopLe(int gioVao, int gioRa) {
        return gioVao >= 6 && gioRa <= 18 && gioVao < gioRa;
    }
    
    // Hàm tính số giờ làm việc
    public static int tinhSoGioLamViec(int gioVao, int gioRa) {
        return gioRa - gioVao;
    }
    
    // Hàm tính tiền lương ngày
    public static int tinhLuongNgay(int gioVao, int gioRa) {
        int luong = 0;
        for (int i = gioVao; i < gioRa; i++) {
            if (i < 12) {
                luong += 6000;
            } else {
                luong += 7500;
            }
        }
        return luong;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập giờ vào ca (6-17): ");
        int gioVao = sc.nextInt();
        
        System.out.print("Nhập giờ ra ca (7-18): ");
        int gioRa = sc.nextInt();
        
        if (!kiemTraHopLe(gioVao, gioRa)) {
            System.out.println("Dữ liệu nhập không hợp lệ!");
        } else {
            System.out.println("Số giờ làm việc: " + tinhSoGioLamViec(gioVao, gioRa) + " giờ");
            System.out.println("Tiền lương ngày: " + tinhLuongNgay(gioVao, gioRa) + " đồng");
        }
        
        sc.close();
    }
}
