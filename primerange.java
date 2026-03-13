public class primerange {
    public static void main(String[] args){
        boolean check = true;
         for(int i=1;i<=20;i++){
            check=true;
            for(int j=2;j<i;j++){
               if(i%j==0){
                check = false;
                break;
               }
            }
            if(check){
                System.out.println(i);
            }
       }
}
}
