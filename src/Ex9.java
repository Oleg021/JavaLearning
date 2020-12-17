import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        double a = new Scanner(System.in).nextDouble();
        if (a%1==0)
        {
            System.out.println("is integer");
        }
        else
        {
            System.out.println("is not integer");
        }
    }
}
