package SimpleNumbersCondition;

import java.util.Scanner;

public class task3 {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hex;
        System.out.println("Enter hex:");
        hex = scanner.nextLine();
        int decimal=Integer.parseInt(hex,16);
        System.out.println(decimal);
    }
}
