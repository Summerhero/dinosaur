package com.summer.code;

/**
 * @author summer
 * @create 2022-03-21 14:37
 * @Description https://leetcode-cn.com/problems/add-two-numbers/
 *              2. 两数相加
 *              示例：  243 + 564 = 708
 */
public class AddTwoNumbers {
}


/**
 * 定义节点类
 */
class ListNode{

    // 节点本身存储的值
    int val;

    // 下一节点信息
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }

}