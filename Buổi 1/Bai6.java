import java.util.Scanner;

public class Bai6  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap nhiet do Fahrenheit: ");
        double f = sc.nextDouble();

        double c = 5.0 / 9 * (f - 32);

        System.out.println("Nhiet do tuong duong theo Celsius: " + c);

        sc.close();
    }
}
