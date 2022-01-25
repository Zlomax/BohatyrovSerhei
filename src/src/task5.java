import java.util.Scanner;

public class task5 {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a = scanner.nextDouble();
        System.out.println("Enter number b:");
        double b = scanner.nextDouble();
        System.out.println("Enter number c:");
        double c = scanner.nextDouble();
        double D =b * b - (4 * a * c);
        if (D>0)
        {
            double x1 = (-b + D) / 2 * a;
            double x2 = (-b - D) / 2 * a;
            System.out.println(+x1);
            System.out.println(+x2);
        }
        else{
            System.out.println("ERROR PLEASE ENTER OTHER NUMBERS");
        }
        if(D == 0)
        {
            double xx = (-b + D) / 2 * a;
            System.out.println(xx);
        }
    }
}
