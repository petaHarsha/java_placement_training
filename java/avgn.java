import java.util.Scanner;
public class avgn{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter a valid char(c,r,s,t): ");
        char k=obj.next().charAt(0);
        int a=obj.nextInt(),b=obj.nextInt();
        if (k=='r') System.out.println(a*b);
        else if (k=='s') System.out.println(a*a);
        else if (k=='t') System.out.println(0.5*(a*b));
        else if (k=='c') System.out.println(3.14*(a*a));
        else System.out.println("invalid input");
        
    }
}
