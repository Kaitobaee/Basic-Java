// Bài 23. Tính tiền cước TAXI
// km dau tien: 16000d
// moi km tiep theo: 15000d
// neu lon hon 30km thi moi km them la 12000d
import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so km da di: ");
        double km = scanner.nextDouble();
        
        double tienCuoc = 0;
        
        if (km <= 0) {
            System.out.println("So km khong hop le!");
        } else if (km <= 1) {
            tienCuoc = 16000;
            System.out.println("Tien cuoc: " + tienCuoc + " dong");
        } else if (km <= 30) {
            tienCuoc = 16000 + (km - 1) * 15000;
            System.out.println("Tien cuoc: " + tienCuoc + " dong");
        } else {
            tienCuoc = 16000 + 29 * 15000 + (km - 30) * 12000;
            System.out.println("Tien cuoc: " + tienCuoc + " dong");
        }
        
        scanner.close();
    }
}
