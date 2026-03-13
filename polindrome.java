public class polindrome {
public static void main(String[] args){
    int a=12321;
    int temp=a,sum=0;
    while (temp>0){
        int rem=temp%10;
        sum=rem+sum*10;
        temp/=10;
    }
   if (sum==a){
    System.out.println("polindrome");
    }else{
        System.out.println("Not polindrome");
    }
  }
}
