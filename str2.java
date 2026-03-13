import java.util.Scanner;

public class str2 {
    static Scanner a = new Scanner(System.in);

    public static void main(String[] args) {
        int n = a.nextInt();
        float sum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
            sum += arr[i];
        }
        System.out.println(sum / n);

    }

}
