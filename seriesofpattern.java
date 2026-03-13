public class seriesofpattern {
    public static void main(String[] args) {
        // 2,6,13,24,41,68.113
        int n = 7;
        int sq = 1;
        int _2n = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print((sq * sq) + _2n + " ");
            n--;
            _2n += _2n;
        }
    }
}
