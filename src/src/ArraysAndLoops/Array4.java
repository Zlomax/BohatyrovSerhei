package ArraysAndLoops;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int a = sc.nextInt();
        switch (a){
            case 1:
                    System.out.println("January Winter");
                break;
            case 2:
                System.out.println("February Winter");
                break;
            case 3:
                System.out.println("March Spring");
                break;
            case 4:
                System.out.println("April Spring");
                break;
            case 5:
                System.out.println("May Spring");
                break;
            case 6:
                System.out.println("June Summer");
                break;
            case 7:
                System.out.println("July Summer");
                break;
            case 8:
                System.out.println("August Summer");
                break;
            case 9:
                System.out.println("September Autumn");
                break;
            case 10:
                System.out.println("October Autumn");
                break;
            case 11:
                System.out.println("November Autumn");
                break;
            case 12:
                System.out.println("December Winter");
                break;
            default:
                System.out.println("PLEASE ENTER CORRECT NUMBER!");
        }
    }
}
