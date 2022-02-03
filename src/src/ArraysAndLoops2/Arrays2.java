package ArraysAndLoops2;

public class Arrays2 {
    public static void main(String[] args) {
        int n = 20+3;
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i < n; i++) {
            f[i] = f[i - 3] + f[i - 2] + f[i - 1];
            System.out.print(f[i]+" ");
        }
    }
}