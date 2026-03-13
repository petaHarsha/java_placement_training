public class twistedprime {
    static int prime(int num) {
        int flag = 0;
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {

                flag = 1;
                break;
            }

        }
        return flag;
    }

    static int reverse(int num) {
        int sum = 0;
        while (num > 0) {
            int rev = num % 10;
            sum = sum * 10 + rev;
            num /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int n = 31;
        // int k = prime(n);

        // int r = reverse(n);

        // int b = prime(r);
        if (prime(n) == prime(reverse(n))) {// (b == k) {
            System.out.print("yes");
        } else {
            System.out.print("no");

        }
    }
}
