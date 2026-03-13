public class proadd {
    public static void main(String[] args){

        int n = 120345;
        int sum = 0, prod = 1;
        boolean zero = false;

        while(n > 0){
            int rem = n % 10;
            n/=10;
            if(rem == 0){
                zero = true;
                continue;
            }
            if(zero){
                 prod*= rem;
            }
            else{
                sum += rem;
            }      

        }
        System.out.println(sum + " " + prod);
          
    }
}