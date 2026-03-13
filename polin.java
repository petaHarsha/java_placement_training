public class polin {
    static boolean amstrong(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int rev = temp % 10;
            sum += rev * rev * rev;
            temp /= 10;

        }
        return sum == num;
    }

    public static void main(String[] args) {
        int n = 2;
        int h;
        int[] arr = { 120, 153 };
        for (int i = 0; i < n; i++) {
            h = arr[i];
            System.out.print(amstrong(h) + " ");

        }

    }
}