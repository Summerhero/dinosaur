package com.summer.code;

/**
 * @author summer
 * @create 2022-03-21 14:37
 * @Description https://leetcode-cn.com/problems/add-two-numbers/
 *              2. 两数相加
 *              示例：  243 + 564 = 708
 *
 *              注意：如果链表遍历结束后，有 \textit{carry} > 0carry>0，还需要在答案链表的后面附加一个节点，节点的值为 carry
 *
 */
public class AddTwoNumbers {

    public static void main(String[] args) {


        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l1.next = new ListNode(6);
        l1.next = new ListNode(4);

        ListNode result = method(l1,l2);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }




    static ListNode method(ListNode l1,ListNode l2){
        // 参数校验略
        // 逻辑处理
        // 定义结果 加数1  加数2\
        ListNode result = null;
        // 定义进位
        int  carry = 0;
        // 遍历入参节点
        while (l1 != null || l2 != null){
            // 获取两个加数,当其中一个节点不存在下一个时，值用 0 代替
            int add1 = l1 != null ? l1.val : 0;
            int add2 = l2 != null ? l2.val : 0;

            int sum = add1 + add2 + carry;


            carry = sum > 9 ? 1 : 0 ;

            int currVal = sum > 9 ? sum - 10 : sum;

            if (result == null){
                result = new ListNode(currVal);
            }else{
                result.next = new ListNode(currVal);
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l1.next : null;

        }

        if(carry > 0){
            result.next = new ListNode(1);
        }

        return result;
    }
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