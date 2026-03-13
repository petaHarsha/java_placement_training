import java.util.Scanner ;
public class factorial {
 public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("enter a number:");
    int pro=1;
    int n=obj.nextInt();
    for(int i=1;i<=n;i++){
        pro*=i;
        System.out.println(pro);

    }
    System.out.printf("the factorial of %d =%d",n,pro);
  }

}
