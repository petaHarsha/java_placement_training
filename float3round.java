public class float3round{
    public static void main(String[] args){
        float f=1.234567f;
        f=((int)(f*1000))/1000f;
        System.out.println(f);
    }
}
