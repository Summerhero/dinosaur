package com.summer.code;

/**
 * @author summer
 * @create 2022-03-28 9:48
 * @Description https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
 *                    693. 交替位二进制数
 */
public class HasAlternatingBits {
    public static void main(String[] args) {


        System.out.println(method(10));
        System.out.println(method(20));

        System.out.println(method2(10));
        System.out.println(method2(20));

    }

    /**
     * 给定整数n,判断其二进制形式，是否（0/1）交替存在
     * 遍历解决
     * @param n 整数
     * @return  true 交替存在  false 非交替存在
     */
    static boolean method(int n){
        // 遍历除 ,按位比较是否相等
        int prev = 2;
        if(n == 0 ){
            return false;
        }
        while(n!=0){
            int curr = n % 2;
            if(prev == n % 2){
                return false;
            }
            prev = curr;
            n /= 2;
        }
        return true;
    }


    /**
     * 对输入 nn 的二进制表示右移一位后，得到的数字再与 n 按位异或得到 aa。当且仅当输入 n 为交替位二进制数时，aa 的二进制表示全为 1（不包括前导 0）。
     * 这里进行简单证明：当 a 的某一位为 1 时，当且仅当 n 的对应位和其前一位相异。当 a 的每一位为 1 时，当且仅当 n 的所有相邻位相异，即 n 为交替位二进制数。
     *
     * 将 a 与 a + 1 按位与，当且仅当 a 的二进制表示全为 1 时，结果为 0。这里进行简单证明：当且仅当 a 的二进制表示全为 1 时，a + 1 可以进位，
     * 并将原最高位置为 0，按位与的结果为 0。否则，不会产生进位，两个最高位都为 11，相与结果不为 0。
     *
     * 结合上述两步，可以判断输入是否为交替位二进制数。
     *
     */

    /**
     * 给定整数n,判断其二进制形式，是否（0/1）交替存在
     * 位运算解决
     * @param n 整数
     * @return  true 交替存在  false 非交替存在
     */
    static boolean method2(int n){
        int a = n ^ (n >> 1);
        return (a & (a + 1)) == 0;
    }


    /**
     * 将整数 n 转换为 二进制形式
     * @param n
     * @return
     */
    static String covertToBinart(int n){
        // 参数校验
        if(n < 0){
            System.out.println("入参数不能为负数");
            return null;
        }else if(n == 0 ){
            return "0";
        }
        StringBuffer stringBuffer = new StringBuffer();
        // 遍历除 2 ,获取二进制结果
        while(n!=0){
            stringBuffer.append(n % 2);
            n /= 2;
        }
        return new String(stringBuffer.reverse());
    }
}
