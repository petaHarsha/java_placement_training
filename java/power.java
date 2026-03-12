import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the base:");
        int base = obj.nextInt();
        System.out.print("enter the exponent:");

        int exponent = obj.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
          
        }
        System.out.println(result);
    }
}
