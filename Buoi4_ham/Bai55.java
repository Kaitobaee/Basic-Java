import java.util.Scanner;

// Bài 55: Hoán vị giá trị 2 số
public class Bai55 {
    
    // Mảng để lưu 2 số (vì Java truyền tham trị)
    public static void hoanVi(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();
        
        System.out.println("Trước khi hoán vị: a = " + a + ", b = " + b);
        
        int[] arr = {a, b};
        hoanVi(arr);
        a = arr[0];
        b = arr[1];
        
        System.out.println("Sau khi hoán vị: a = " + a + ", b = " + b);
        
        sc.close();
    }
}
