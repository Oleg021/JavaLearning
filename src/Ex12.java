import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Введите расстояние в метрах: ");
        double s = new Scanner(System.in).nextDouble();
        System.out.println("Введите время в секундах: ");
        double t = new Scanner(System.in).nextDouble();
        double v = s/t;
        System.out.println(v+" м/с");
    }
}
