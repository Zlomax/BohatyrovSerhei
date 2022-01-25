import java.util.Scanner;

public class Position {
    public static void  main(String[] args)
    {
     String name, adress;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        name = scanner.nextLine();
        System.out.println("What's your address? "+name+" ?");
        adress = scanner.nextLine();
        System.out.println("Your name is: "+name);
        System.out.println("Your address is: "+adress);
    }
}
