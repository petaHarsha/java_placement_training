import java.util.Scanner;
public class compare {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        int result=a>b?a:b;
        System.out.println(result);
    }
}