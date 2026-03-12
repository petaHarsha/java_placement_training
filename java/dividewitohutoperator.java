public class dividewitohutoperator {
    public static void main(String[] args) {
        int n = 31, b = 5;
        int count = 0;
        while (n >= b) {
            n -= b;
            count++;
        }
        System.out.println("Quot= " + count);
        System.out.println("Rem= " + n);
    }
}
