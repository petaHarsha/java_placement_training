public class prime10 {
 public static void main(String[] args){
        boolean check = true;
        int n=10;//int count=0;
        int k = 2;//int num=2;
        while(n>0){// for(int num =2;count<7;num++){
            //check=true;
            //for(int i=2;i<num;i++){
               // if(j%i==0){
                //check = false;
                //break;
               //}
            //}
            
            check=true;
            for(int j=2;j<k;j++)
            {
               if(k%j==0){
                check = false;
                break;
               }
            }
            if(check){
                System.out.println(k+"");
                n--;   
            }
            k++;
       }
    
 }
}
