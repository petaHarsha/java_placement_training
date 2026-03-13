public class multandaddseries {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0, prod = 1;
        int k = 25;
        int result = 0;

        while (n > 0) {
            System.out.print(k + " ");
            for (int i = 1; i <= n; i++) {
                int a = k % 10;
                int b = k / 10;
                sum = a + b;
                prod = a * b;
                result = sum + prod;

            }
            k = result;
            n--;
        }
    }
}
