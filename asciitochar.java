import java.util.Scanner;
public class asciitochar {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int sc1=s.nextInt();
        if (sc1>=65 && sc1<=90){
            System.out.println((char)sc1);
            System.out.printf("upper case'%c' ",(char)sc1); 
        }
        else if (sc1>=97 && sc1<=122){
            System.out.println((char)sc1);
            System.out.printf("lower case'%c' ",(char)sc1); 

        }
        else{
            System.out.println("Invalid input");
        }
    }
}
