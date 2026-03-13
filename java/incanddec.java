public class incanddec {
   public static void main(String [] args){ 
    int num = 6;
    int n = 1;
    int k = 0;
    while(n>0){
        System.out.print(n + " ");
        if(n == 6){
            k = 1;
        }
        if(k == 1){
            n--;
        }
        else{
            n++;
        }
    }
 } 
}
