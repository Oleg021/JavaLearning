import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println("Number a: "+a+" bigest then b: "+b);
        }
        else {
            System.out.println("Number b: "+b+" bigest then a: "+a);
        }
    }
}
