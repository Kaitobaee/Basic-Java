import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        // Toán tử 
        /* Viết chương trình nhập vào 2 số nguyên a, b. Tính tổng, hiệu, tích, thương của 2 số trên và in kết quả ra màn hình. */
        Scanner sc = new Scanner(System.in); 
        System.out.println(" Nhap gia tri A : ");
        int a = sc.nextInt();
        System.out.println("Nhap gia tri B : ");
        int b = sc.nextInt();
        System.out.println("Tong : "+ (a+b));
        System.out.println("Hieu : "+ (a-b));
        System.out.println("Tich : "+ (a*b));
        System.out.println("Thuong : "+ ((float)a/b));

    }
}
