import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight");
        double weight = scanner.nextDouble();
        System.out.println("Your weight on the moon: "+weight*0.17);
    }
}
