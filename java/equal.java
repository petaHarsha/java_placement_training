public class equal {
public static void main(String[] args){
    int a=123;int sum=0,pro=1;
    while (a>0){
        int rem=a%10;
        sum+=rem;pro*=rem;
        a/=10;
    }
  if (sum==pro){
    System.out.println("Equal");
    }else{
        System.out.println("Not Equal");
    }
  }
}
