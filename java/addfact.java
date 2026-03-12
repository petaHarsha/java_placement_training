public class addfact{
    public static void main(String[] args) {
        int n=145;
        int temp=n,sum=0,prod=1;
         while (temp>0){
                int rem= temp%10;
                temp/=10;
                prod=1;
                for(int i=1;i<=rem;i++){
                    prod*=i;

                }sum+=prod;

            }System.err.println(sum);
        if (n==sum){
            System.err.println("yes");
        }else{
            System.err.println("no");
        }
        }

    }

