import java.util.Scanner;

public class str4 {

    static Scanner inp = new Scanner(System.in);

    static int rev(int a) {

        int re = 0;
        if (a == 0) {
            return 0;
        }
        while (a > 0) {
            int rem = a % 10;
            re = re * 10 + rem;
            a /= 10;

        }

        return re;

    }

    public static void main(String[] args) {
        int n = inp.nextInt();
        if (n % 2 == 0) {
            int arr[] = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = inp.nextInt();

            }
            for (int i = 0; i < n / 2; i++) {
                for (int j = n / 2; j < n; j++) {

                    if (arr[i] == rev(arr[j])) {
                        System.out.println(arr[i]);
                        count++;
                    }
                }

            }
            System.out.println();

            System.out.print(count + " ");
        } else {
            System.out.println("the number is element is odd ");
        }
    }

}
