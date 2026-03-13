public class count {
    public static void main(String[] args) {

        int n = 12345;
        int temp = n;
        int count = 0;

        // Count digits
        while(temp > 0){
            temp /= 10;
            count++;
        }

        // Move to middle position
        int mid = count / 2;

        for(int i = 0; i < mid; i++){
            n /= 10;
        }

        int midDigit = n % 10;

        System.out.println("Middle digit: " + midDigit);
    }
}