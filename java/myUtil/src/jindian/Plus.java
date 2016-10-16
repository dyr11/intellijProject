package jindian;

/**
 * Created by dyr on 2016/10/16.
 * 题目描述
 * <p>
 * 有两个用链表表示的整数，每个结点包含一个数位。这些数位是反向存放的，也就是个位排在链表的首部。编写函数对这两个整数求和，并用链表形式返回结果。
 * 给定两个链表ListNode* A，ListNode* B，请返回A+B的结果(ListNode*)。
 * 测试样例：
 * {1,2,3},{3,2,1}
 * 返回：{4,4,4}
 */

import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode head = new ListNode(-1);
        ListNode pre = head, current = null;
        int carry = 0, valA = 0, valB = 0, val = 0;
        while (a != null || b != null) {
            valA = a == null ? 0 : a.val;
            valB = b == null ? 0 : b.val;
            val = valA + valB + carry;
            current = new ListNode(val % 10);
            pre.next = current;
            pre = current;
            carry = val / 10;
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }
        if(carry!=0){
            current=new ListNode(carry);
            pre.next=current;
        }
        return head.next;
    }
}