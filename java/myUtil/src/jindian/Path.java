package jindian;

/**
 * Created by dyr on 2016/10/16.
 *
 *
 * 题目描述

 对于一个有向图，请实现一个算法，找出两点之间是否存在一条路径。
 给定图中的两个结点的指针UndirectedGraphNode* a,UndirectedGraphNode* b(
 请不要在意数据类型，图是有向图),请返回一个bool，代表两点之间是否存在一条路径(a到b或b到a)。
 */

import java.util.*;


class UndirectedGraphNode {
    int label = 0;
    UndirectedGraphNode left = null;
    UndirectedGraphNode right = null;
    ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

    public UndirectedGraphNode(int label) {
        this.label = label;
    }
}

public class Path {
    public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
        return checkPathSingle(a,b)||checkPathSingle(b,a);
    }
    private boolean checkPathSingle(UndirectedGraphNode a, UndirectedGraphNode b){
        // write code here
        ArrayList<UndirectedGraphNode> arrayList = new ArrayList<>();
        arrayList.add(a);
        int index = 0;
        while (index < arrayList.size()) {
            UndirectedGraphNode node = arrayList.get(index);
            if(node==b){
                return true;
            }
            for (UndirectedGraphNode item : node.neighbors) {
                if(arrayList.indexOf(item)==-1){
                    arrayList.add(item);
                }
            }
            index++;
        }

        return false;
    }

}