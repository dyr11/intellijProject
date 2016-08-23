//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()) {//注意while处理多个case
//            int h = in.nextInt();
//            int result=(int)(Math.sqrt(1+4*h)-1)/2;
//            System.out.println(result);
//        }
//    }
//}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            String str=in.next();
            int length=str.length();
            int[] left=new int[length+1];
            int[] right=new int[length+1];
            int sum=0;
            left[0]=right[length]=0;
            for(int i=0;i<length;i++){
                sum+=str.charAt(i)=='0'?-1:1;
                if(sum<0){
                    left[i+1]=left[i]+1;
                }else{
                    sum=0;
                    left[i+1]=0;
                }
            }
            sum=0;
            for(int i=length-1;i>=0;i--){
                sum+=str.charAt(i)=='0'?-1:1;
                if(sum>0){
                    right[i]=right[i+1]+1;
                }else{
                    sum=0;
                    right[i]=0;
                }
            }
            int max=0;
            for(int i=0;i<length;i++){
                if(left[i+1]>0&&right[i+1]>0&&(left[i+1]+right[i+1]>max)){
                    max=left[i+1]+right[i+1];
                }
            }
            System.out.println(max);
        }
    }
}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String str=in.next();
//            int length=str.length();
//            int num=length*(length-1)/2;
//            for(int i=0;i<length-2;i++){
//                if(str.charAt(i)==str.charAt(i+2)){
//                    num--;
//                }
//            }
//            for(int i=0;i<length-1;i++){
//                if(str.charAt(i)==str.charAt(i+1)){
//                    num-=length-2;
//                }
//            }
//            System.out.println(num);
//        }
//    }
//}