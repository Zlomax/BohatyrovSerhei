import java.util.Scanner;

public class task1 {
    public static void  main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a = scanner.nextDouble();
        System.out.println("Enter number b:");
        double b = scanner.nextDouble();
        double c = a/b;
        System.out.println("Result of divide: "+c);

    }
}
