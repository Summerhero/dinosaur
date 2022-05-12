package com.summer.code;

/**
 * @author summer
 * @create 2022-05-09 15:24
 * @Description 942. 增减字符串匹配
 *              https://leetcode.cn/problems/di-string-match/
 *              心得：整数n 可以看作是一个有序得长度为 n+1 得数组
 *                   字符串I 对应当前最小值 D 对应当前最大值
 */
public class _942_diStringMatch {
    public static void main(String[] args) {
        // int[] result = method("IDID");
        // int[] result = method("III");
        // int[] result = method("DDD");
        int[] result = method("DDI");
        for (int num:result) {
            System.out.println(num);
        }
    }



    /*
        由范围 [0,n] 内所有整数组成的 n + 1 个整数的排列序列可以表示为长度为 n 的字符串 s ，其中:
        如果 perm[i] < perm[i + 1] ，那么 s[i] == 'I' 
        如果 perm[i] > perm[i + 1] ，那么 s[i] == 'D' 
     */

    /**
     *  根据规则返回字符串对应得数组排列结果
     * @param s 字符串
     * @return  数组排列结果
     */
    public static int[] method(String s) {
        // 参数校验 略
        // 预定义结果
        int[] result = new int[s.length()+1];
        // 预定义当前最大以及最小值
        int min = 0,max = s.length();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == 'I'){
               result[i] = min;
               min ++;
            }else{
                result[i] = max;
                max --;
            }
        }
        result[s.length()] = max;
        return result;
    }
}
