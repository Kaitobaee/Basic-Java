import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri a : ");
        int a = sc.nextInt();
        System.out.println("nhap gia tri b : ");
        int b =	sc.nextInt();
        if(a<b)
        	System.out.println("a lon nhat");
        else {
        	System.out.println("b lon nhat");
        }
    }
 }
