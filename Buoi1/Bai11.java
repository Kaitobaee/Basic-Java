import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Tam giac");
        System.out.println("2. Hinh vuong");
        System.out.println("3. Hinh chu nhat");
        System.out.println("4. Hinh tron");
        System.out.print("Nhap lua chon: ");
        int chon = sc.nextInt();
        
        switch (chon) {
            case 1:
                // TAM GIAC
                System.out.print("Nhap canh a: ");
                double a = sc.nextDouble();
                System.out.print("Nhap canh b: ");
                double b = sc.nextDouble();
                System.out.print("Nhap canh c: ");
                double c = sc.nextDouble();
                double chuViTG = a + b + c;
                double p = chuViTG / 2;
                double dienTichTG = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                System.out.println("Chu vi tam giac: " + chuViTG);
                System.out.println("Dien tich tam giac: " + dienTichTG);
                break;
            case 2:
                // HINH VUONG
                System.out.print("Nhap canh hinh vuong: ");
                double canh = sc.nextDouble();

                double chuViHV = 4 * canh;
                double dienTichHV = canh * canh;

                System.out.println("Chu vi hinh vuong: " + chuViHV);
                System.out.println("Dien tich hinh vuong: " + dienTichHV);
                break;
            case 3:
                // HINH CHU NHAT
                System.out.print("Nhap chieu dai: ");
                double dai = sc.nextDouble();
                System.out.print("Nhap chieu rong: ");
                double rong = sc.nextDouble();

                double chuViHCN = 2 * (dai + rong);
                double dienTichHCN = dai * rong;

                System.out.println("Chu vi hinh chu nhat: " + chuViHCN);
                System.out.println("Dien tich hinh chu nhat: " + dienTichHCN);
                break;
            case 4:
                // HINH TRON
                System.out.print("Nhap ban kinh: ");
                double r = sc.nextDouble();

                double chuViHT = 2 * Math.PI * r;
                double dienTichHT = Math.PI * r * r;

                System.out.println("Chu vi hinh tron: " + chuViHT);
                System.out.println("Dien tich hinh tron: " + dienTichHT);
                break;

            default:
                System.out.println("Lua chon khong hop le!");
        }

        sc.close();
    }
}
