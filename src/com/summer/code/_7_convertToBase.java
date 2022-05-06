package com.summer.code;

/**
 * @author summer
 * @create 2022-03-07 9:50
 * @Description https://leetcode-cn.com/problems/base-7/
 * 给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
 */
public class _7_convertToBase {

    public static void main(String[] args) {
       String result =  test01(1000);
       System.out.println(result);
    }


    public static String test01(int num){
        // 参数校验
        if(num == 0){
            return "0";
        }
        // 若为负数，则取绝对值
        num = num < 0 ? Math.abs(num) : num;
        // 初始化结果字符串
        StringBuffer result = new StringBuffer();
        // 将十进制转换为7进制
        while(num > 0 ){
            result.append(num%7);
            num/=7;
        }
        return result.reverse().toString();
    }
}
