import java.util.Scanner;

// Bài 49: Nhập số nguyên dương n (0 <= n < 1000) và in ra cách đọc của n
public class Bai49 {
    
    public static String docSo(int n) {
        String[] donVi = {"", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        String[] chuc = {"", "muoi", "hai muoi", "ba muoi", "bon muoi", "nam muoi", 
                         "sau muoi", "bay muoi", "tam muoi", "chin muoi"};
        
        if (n == 0) return "Khong";
        
        StringBuilder kq = new StringBuilder();
        
        // Xử lý hàng trăm
        int hangTram = n / 100;
        int hangChuc = (n % 100) / 10;
        int hangDonVi = n % 10;
        
        if (hangTram > 0) {
            kq.append(donVi[hangTram]).append(" tram");
            if (hangChuc == 0 && hangDonVi > 0) {
                kq.append(" le");
            }
        }
        
        // Xử lý hàng chục
        if (hangChuc > 0) {
            if (kq.length() > 0) kq.append(" ");
            if (hangChuc == 1) {
                kq.append("muoi");
            } else {
                kq.append(donVi[hangChuc]).append(" muoi");
            }
        }
        
        // Xử lý hàng đơn vị
        if (hangDonVi > 0) {
            if (kq.length() > 0) kq.append(" ");
            if (hangChuc > 0 && hangDonVi == 1) {
                kq.append("mot");
            } else if (hangChuc > 0 && hangDonVi == 5) {
                kq.append("lam");
            } else {
                kq.append(donVi[hangDonVi]);
            }
        }
        
        // Viết hoa chữ cái đầu
        String result = kq.toString();
        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên dương n (0 <= n < 1000): ");
        int n = sc.nextInt();
        
        if (n < 0 || n >= 1000) {
            System.out.println("Số không hợp lệ!");
        } else {
            System.out.println("Cách đọc: " + docSo(n));
        }
        
        sc.close();
    }
}
