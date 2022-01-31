package ArraysAndLoops;

import java.util.Scanner;

public class Array1 {
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] a=new int[5];
        System.out.print("Enter 5 numbers to array: ");
        for (int i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("============================================");
        System.out.print("Numbers which can be divided: ");
        for(int i = 0; i<5; i++)
        {
            if(a[i]%3==0 || a[i]%5==0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
