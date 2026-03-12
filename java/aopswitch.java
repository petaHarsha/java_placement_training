import java.util.Scanner;
public class aopswitch{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        System.out.print("enter a valid operator(+,-.*,/): ");
        char k=obj.next().charAt(0);
        switch(k){
            case '+': System.out.printf("%d+ %d= %d",a,b,a+b);break;
            case '-': System.out.printf("%d+ %d= %d",a,b,a-b);break;
            case '*': System.out.printf("%d+ %d= %d",a,b,a*b);break;
            case '/': System.out.printf("%d+ %d= %d",a,b,a/b);break;
        default:
            System.out.println("enter valid oprator ");
        }
    }
}
