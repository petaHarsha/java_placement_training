public class narcisistic {
    public static void main(String[] args) {
        int n=89;
        int temp=n,sum=0,prod=1;
        int count=0;
        while (temp>0){
            temp/=10;
            count++;
        }temp=n;
         while (temp>0){
                int rem= temp%10;
                temp/=10;
                prod=1;
                for(int i=1;i<=count;i++){
                    prod*=rem;

                }count--;sum+=prod;

            }System.out.println(sum);
        if (n==sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        }

    }

