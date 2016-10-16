package jindian;

/**
 * Created by dyr on 2016/10/16.
 *
 * 题目描述

 有家动物收容所只收留猫和狗，但有特殊的收养规则，收养人有两种收养方式，
 第一种为直接收养所有动物中最早进入收容所的，第二种为选择收养的动物类型（猫或狗），并收养该种动物中最早进入收容所的。
 给定一个操作序列int[][2] ope(C++中为vector<vector<int>>)代表所有事件。若第一个元素为1，则代表有动物进入收容所，
 第二个元素为动物的编号，正数代表狗，负数代表猫；若第一个元素为2，则代表有人收养动物，第二个元素若为0，
 则采取第一种收养方式，若为1，则指定收养狗，若为-1则指定收养猫。请按顺序返回收养的序列。若出现不合法的操作，
 即没有可以符合领养要求的动物，则将这次领养操作忽略。
 测试样例：
 [[1,1],[1,-1],[2,0],[2,-1]]
 返回：[1,-1]
 *
 */
import java.util.*;

public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> cat=new ArrayList<>(),dog=new ArrayList<>(),animal=new ArrayList<>(),result=new ArrayList<>();
        for(int i=0;i<ope.length;i++){
            switch (ope[i][0]){
                case 1:
                    if(ope[i][1]>0){
                        dog.add(ope[i][1]);
                    }else{
                        cat.add(ope[i][1]);
                    }
                    animal.add(ope[i][1]);
                    break;
                case 2:
                    if(ope[i][1]==0&&!animal.isEmpty()){
                        cat.remove(animal.get(0));
                        dog.remove(animal.get(0));
                        result.add(animal.get(0));
                        animal.remove(0);
                    }else if(ope[i][1]==1&&!dog.isEmpty()){
                        animal.remove(dog.get(0));
                        result.add(dog.get(0));
                        dog.remove(0);
                    }else if(ope[i][1]==-1&&!cat.isEmpty()){
                        animal.remove(cat.get(0));
                        result.add(cat.get(0));
                        cat.remove(0);
                    }
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CatDogAsylum catDogAsylum=new CatDogAsylum();
        int arr[][]={{1,1},{1,-1},{2,0},{2,-1}};
        ArrayList<Integer> result=catDogAsylum.asylum(arr);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
    }
}