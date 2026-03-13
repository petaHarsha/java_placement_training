import java.util.Scanner;

public class str1 {

    static Scanner obj = new Scanner(System.in);

    static void dec(int arr[], int index) {
        if (index == arr.length)
            return;

        arr[index] = obj.nextInt();
        System.out.print(arr[index] + " ");

        dec(arr, index + 1);
    }

    public static void main(String[] args) {

        int n = obj.nextInt();
        int arr[] = new int[n];

        dec(arr, 0);
    }
}