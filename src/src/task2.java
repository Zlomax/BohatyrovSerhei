import java.util.Scanner;

public class task2 {
    public static void  main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of radius:");
        double r = scanner.nextDouble();
        System.out.println("Enter number of high:");
        double h = scanner.nextDouble();
        double pe = 3.1415;
        double S = pe*(r*r)*h;
        System.out.println("Volume of cylinder : "+S);
    }
}
