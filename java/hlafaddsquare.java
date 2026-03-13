public class hlafaddsquare {
    public static void main(String[] args) {

        int n = 2025;
        int temp = n;
        int count = 0;
        int a=0,b=0,c=0,sum=1;
        while(temp > 0){
            temp /= 10;
            count++;
        }temp=n;System.out.println(count);
        if (count%2==0){
            int div=1;
            for(int i=0;i<count/2;i++){
                div*=10;
            }a=temp%div;b=temp/div;
             System.out.println(a);
            System.out.println(b);
            c=a+b;
            System.out.println(c);
            sum=c*c;
            System.out.println(sum);
            if (sum==n){
                System.out.println("Possible");}
                else{
                    System.out.println("Not possible");
                }
            

        }else{
            System.out.println("Not possible");
            
        }
    }
}
