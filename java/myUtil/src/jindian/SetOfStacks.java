package jindian;

/**
 * Created by dyr on 2016/10/16.
 * 题目描述

 请实现一种数据结构SetOfStacks，由多个栈组成，其中每个栈的大小为size，当前一个栈填满时，新建一个栈。
 该数据结构应支持与普通栈相同的push和pop操作。
 给定一个操作序列int[][2] ope(C++为vector<vector<int>>)，每个操作的第一个数代表操作类型，
 若为1，则为push操作，后一个数为应push的数字；
 若为2，则为pop操作，后一个数无意义。请返回一个int[][](C++为vector<vector<int>>)，
 为完成所有操作后的SetOfStacks，顺序应为从下到上，默认初始的SetOfStacks为空。保证数据合法

 */
import java.util.*;

public class SetOfStacks {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> current=new ArrayList<>();
        result.add(current);
        for(int i=0;i<ope.length;i++){
            switch (ope[i][0]){
                case 1:
                    if(current.size()>=size){
                        current=new ArrayList<>();
                        result.add(current);
                    }
                    current.add(ope[i][1]);
                    break;
                case 2:
                    if(current.isEmpty()){
                        result.remove(current);
                        current=result.get(result.size()-1);
                    }
                    current.remove(current.size()-1);
                    break;
            }
        }
        return result;
    }
}