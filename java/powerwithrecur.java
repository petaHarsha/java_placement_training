public class powerwithrecur {
    static int cal(int a, int b) {
        if (a == 0)
            return 0;
        if (b == 0)
            return 1;
        return a * cal(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 5, b = 9;
        System.out.print(cal(a, b));
    }
}
