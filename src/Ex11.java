import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        int a = new Scanner(System.in).nextInt();
        for (int i = 1; i<=10; i++)
        {
            int c = a*i;
            System.out.println(c);
        }
    }
}
