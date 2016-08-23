/**
 * Created by dyr on 2016/7/23.
 */
public class radix {
    public static void main(String[] args) {
        int testInt = 125;
        String binaryString = Integer.toBinaryString(testInt);
        String octalString = Integer.toOctalString(testInt);
        String hexString = Integer.toHexString(testInt);

        System.out.println("binary ：" + binaryString);
        System.out.println("octal ：" + octalString);
        System.out.println("hex ：" + hexString);

        System.out.println("--------------------" );
        System.out.println("ten ：" + Integer.parseInt(binaryString,2));
        System.out.println("ten ：" + Integer.parseInt(octalString,8));
        System.out.println("ten ：" + Integer.parseInt(hexString,16));
    }
}
