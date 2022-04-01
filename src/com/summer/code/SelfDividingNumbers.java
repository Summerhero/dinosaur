package com.summer.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @create 2022-03-31 13:54
 * @Description https://leetcode-cn.com/problems/self-dividing-numbers/
 *              728. 自除数
 */
public class SelfDividingNumbers {
    public static void main(String[] args) {

        List<Integer> result1 = method(1,22);
        System.out.println(result1.toString());

        List<Integer> result2 = method(47,85);
        System.out.println(result2.toString());


        List<Integer> result3 = method2(1,22);
        System.out.println(result3.toString());

        List<Integer> result4= method2(47,85);
        System.out.println(result4.toString());
    }


    /** 0 不是自除数
     * 给定一个区间的整数，判断其是否是自除数，返回自除数列表
     * @param left 左区间整数
     * @param right 右区间整数
     * @return  自除数列表
     */
    static List<Integer> method(int left, int right) {
        // 定义 自除数结果列表
        List<Integer> result = new ArrayList<>();
        // 遍历给定区间整数
        for (int num = left; num < right + 1; num++) {
            // 标志位
            boolean flag= true;
            // 获取 num 的 每一位数
            int curNum = num;
            while(curNum != 0){
                // 判断能否整除，注意除 0 问题
                if (curNum % 10 == 0 || num % (curNum % 10) != 0){
                    flag= false;
                    break;
                }
                curNum /= 10;
            }
            if(flag) result.add(num);
        }
        return result;
    }


    /**
     *  给定一个区间的整数，判断其是否是自除数，返回自除数列表
     *  0 不是自除数
     * @param left 左区间整数
     * @param right 右区间整数
     * @return 自除数列表
     */
    static List<Integer> method2(int left, int right) {
        // 定义 自除数结果列表
        List<Integer> result = new ArrayList<>();
        // 遍历给定区间整数
        for (int num = left; num < right + 1; num++) {

            if(isSelfDividing(num)) result.add(num);
        }
        return result;
    }


    /**
     *  判断整数num是否自除数，0 不是自除数
     * @param num 整数
     * @return true 自除数 false 非自除数
     */
    static boolean isSelfDividing(int num){
        if(num == 0) return false;
        // 判断是否自除数
        int temp = num;
        while(temp != 0){
            // 判断能否整除，注意除 0 问题
            if (temp % 10 == 0 || num % (temp % 10) != 0){
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
