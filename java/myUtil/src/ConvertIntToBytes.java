/**
 * Created by dyr on 2016/7/23.
 */
public class ConvertIntToBytes {
    public static void main(String[] args) {
        Integer integer=8143;
        int newInt=0;
        byte[] bytes=new byte[4];
        for(int i=0;i<4;i++){
            bytes[i]=(byte)(integer>>>(i*8)&0xff);
            System.out.print(bytes[i]+",");
            newInt+=(bytes[i]&0xff)<<i*8;
        }

        System.out.println("\n----------------------------");
        System.out.println(newInt);

    }

}
