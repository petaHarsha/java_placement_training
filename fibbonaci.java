public class fibbonaci {
    public static void main(String[] args) {
        int n = 7;
        int n1 = 1, n2 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + " ");
            int nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
    }
}
