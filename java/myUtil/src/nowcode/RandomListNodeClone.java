package nowcode;

import java.util.ArrayList;

/**
 * Created by dyr on 2016/9/26.
 */
public class RandomListNodeClone {
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        RandomListNode header = new RandomListNode(-1);
        ArrayList<RandomListNode> OldArrayList = new ArrayList<>();
        ArrayList<RandomListNode> newArrayList = new ArrayList<>();
        RandomListNode pre = header;
        RandomListNode current,random;
        while (true) {
            if (pHead != null) {
                current=nextNode(OldArrayList,newArrayList,pHead);
                random=nextNode(OldArrayList,newArrayList,pHead.random);
                current.random=random;
                pre.next=current;
                pre=current;
                pHead=pHead.next;

            }else{
                break;
            }
        }
        return header.next;
    }
    public RandomListNode nextNode(ArrayList<RandomListNode> OldArrayList,ArrayList<RandomListNode> newArrayList,RandomListNode pHead){
        RandomListNode current;
        if(pHead==null)
            return null;
        if (OldArrayList.indexOf(pHead) != -1) {
            current = newArrayList.get(OldArrayList.indexOf(pHead));
        }else{
            current=new RandomListNode(pHead.label);
            OldArrayList.add(pHead);
            newArrayList.add(current);
        }
        return current;
    }
}