package nowcode;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Created by dyr on 2016/9/25.
 */
public class reOrderArray {
    public void OrderArray(int [] array) {
        int[] temp=new int[array.length];
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                temp[count++]=array[i];
            }else{
                array[i-count]=array[i];
            }
        }
        int start=array.length-count;
        for(int i=0;i<count;i++){
            array[start+i]=temp[i];
        }
    }

    public static void main(String[] args) {
        reOrderArray reOrderArray1=new reOrderArray();
        int arr[]={1,2,3,4,5,6,7,8,9};
        reOrderArray1.OrderArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
