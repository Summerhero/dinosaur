package com.summer.code;

/**
 * @author summer
 * @create 2022-03-25 15:05
 * @Description https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 *              172. 阶乘后的零
 */
public class TrailingZeroes {

    public static void main(String[] args) {

        System.out.println("factorial:result = " + factorial(2));
        System.out.println("method:result = " + method(2));
        System.out.println("method:result = " + method(3));
        System.out.println();

        System.out.println("factorial:result = " + factorial(5));
        System.out.println("method:result = " + method(5));
        System.out.println("method:result = " + method(5));
        System.out.println();

        System.out.println("factorial:result = " + factorial(10));
        System.out.println("method:result = " + method(10));
        System.out.println("method:result = " + method(10));
        System.out.println();

        System.out.println("factorial:result = " + factorial(15));
        System.out.println("method:result = " + method(15));
        System.out.println("method:result = " + method(15));


    }


    /**
     * 遍历的形式
     * 计算给定整数的阶乘结果
     * @param n 整数
     * @return  阶乘结果
     */
    static Long factorial(int n){

        Long result = 1L;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        return result;
    }



    /**
     *  循环实现
     * 给定一个整数 n ，返回 n! 结果中尾随零的数量
     * @param n 整数 n
     * @return 尾随零的数量
     */
    static int method(int n){
        // 参数校验
        // 逻辑处理
        // 定于计数器
        int count = 0;
        for (int i = 5; i <= n; i += 5) {
            if(i%5 == 0){
                count += 1;
            }
        }
        return count;
    }


    /**
     * 递归实现
     * 给定一个整数 n ，返回 n! 结果中尾随零的数量
     * @param n 整数 n
     * @return  尾随零的数量
     */
    static int method2(int n){
        return n == 0 ? 0 : n / 5 + method2(n / 5);
    }
}
