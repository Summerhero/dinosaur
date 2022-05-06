package com.summer.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @create 2022-05-06 16:08
 * @Description 438. 找到字符串中所有字母异位词
 *              https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 */
public class _438_FindAnagrams {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = method1(s, p);
        System.out.println(result.toString());
        result = method2(s, p);
        System.out.println(result.toString());


    }

    /**
     * 找到字符串S中字符串P的异位词
     * @param s 字符串 s
     * @param p 字符串 p
     * @return  异位词左下标数组
     */

    private static List<Integer> method1(String s, String p){
        // 预定义结果
        List<Integer> list = new ArrayList<>();
        // 参数校验
        if(s.length() < p.length()) return list;
        // 预定义左右坐标位置
        int left = 0;
        int right = p.length();
        // 计算 字符串 P 的字符和
        int sumP = stringSum(p);
        // 遍历
        while (right < s.length()){
            if(sumP == stringSum(s.substring(left,right))) list.add(left);
            left++;
            right++;
        }
        return list;

    }


    /**
     * 找到字符串S中字符串P的异位词
     * @param s 字符串 s
     * @param p 字符串 p
     * @return  异位词左下标数组
     */
    private static List<Integer> method2(String s, String p){
        // 预定义结果
        List<Integer> list = new ArrayList<>();
        // 参数校验
        if(s.length() < p.length()) return list;
        // 预定义左右坐标位置
        int index = 0;
        // 计算 字符串 P 的字符和
        int sumP = stringSum(p);
        // 遍历
        while (index < s.length() - p.length()){
            if(sumP == stringSum(s.substring(index,index+p.length()))) list.add(index);
            index++;
        }
        return list;
    }



    /**
     *  计算字符串的中各个字符的和
     * @param s 字符串
     * @return  字符和
     */
    private static Integer stringSum(String s){
        // 参数校验 略
        // 预定义结果
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
           sum += s.charAt(i) ;
        }
        return sum;
    }

}
