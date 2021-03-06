package jindian;

/**
 * Created by dyr on 2016/10/16.
 *
 * 题目描述

 有两个32位整数n和m，请编写算法将m的二进制数位插入到n的二进制的第j到第i位,其中二进制的位数从低位数到高位且以0开始。
 给定两个数int n和int m，同时给定int j和int i，意义如题所述，请返回操作后的数，
 保证n的第j到第i位均为零，且m的二进制位数小于等于i-j+1。
 测试样例：
 1024，19，2，6
 返回：1100
 */
import java.util.*;

public class BinInsert {
    public int binInsert(int n, int m, int j, int i) {
        // write code here
        m<<=j;
        n^=m;
        return n;
    }

    public static void main(String[] args) {
        BinInsert binInsert=new BinInsert();
        System.out.print(binInsert.binInsert(1024,19,2,6));
    }
}
