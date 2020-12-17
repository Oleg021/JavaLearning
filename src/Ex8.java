import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int a = sc.nextInt();
        if (a%2 == 0)
        {
            System.out.println("чётное");
        }else if(a%2 != 0){
            System.out.println("не чётное");
        }
    }
}
