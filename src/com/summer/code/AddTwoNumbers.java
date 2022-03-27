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
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = method(l1,l2);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }




    static ListNode method(ListNode l1,ListNode l2){
        // 参数校验略
        // 逻辑处理
        // 定义头节点以及尾节点
        ListNode head = null;
        ListNode tail = null;
        // 定义进位
        int  carry = 0;
        // 遍历入参节点
        while (l1 != null || l2 != null){
            // 获取两个加数,当其中一个节点不存在下一个时，值用 0 代替
            int add1 = l1 != null ? l1.val : 0;
            int add2 = l2 != null ? l2.val : 0;
            //  计算当前位的加和结果
            int sum = add1 + add2 + carry;
            // 获取当前位的值
            // int currVal = sum > 9 ? sum - 10 : sum;
             int currVal = sum % 10;
            if (head == null){
                head = tail = new ListNode(currVal);
            }else{
                tail.next = new ListNode(currVal);
                tail = tail.next;
            }
            // 获取进位值
            // carry = sum > 9 ? 1 : 0 ;
            carry = sum / 10 ;
            // 下一节点
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        // 判断最后是否需要进位
        if(carry > 0){
            tail.next = new ListNode(1);
        }
        return head;
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