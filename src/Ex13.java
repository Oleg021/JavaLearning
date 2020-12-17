import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        System.out.println("enter a number of days");
        int a = new Scanner(System.in).nextInt();
        convert(a);
    }
    public static void convert (int days)
    {
        if (days <= 0)
        {
            System.out.println("enter a correct data!!!");

        }
        System.out.println("In "+ days+" days: "+ days*24 + " hours, "+ days*1440 +" minutes, "+ days*86400+" seconds.");
    }
}
