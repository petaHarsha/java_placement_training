import java.util.Scanner;

public class str3 {
    static int k;
    static Scanner inp = new Scanner(System.in);

    static int count(int a) {
        int ct = 0;
        if (a == 0) {
            return 1;
        }
        while (a > 0) {
            int rem = a % 10;
            if (rem == 0)
                ct++;
            a /= 10;
        }

        return ct;

    }

    public static void main(String[] args) {
        int n = inp.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();

            if (count(arr[i]) == 1) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
