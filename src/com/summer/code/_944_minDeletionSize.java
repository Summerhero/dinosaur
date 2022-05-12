package com.summer.code;

/**
 * @author summer
 * @create 2022-05-12 14:56
 * @Description 944. 删列造序
 *              https://leetcode.cn/problems/delete-columns-to-make-sorted/
 */
public class _944_minDeletionSize {

    public static void main(String[] args) {

        String[] strs = new String[]{"adc","bce","cae"};
        System.out.println(method(strs));
        strs = new String[]{"a","b"};
        System.out.println(method(strs));
        strs = new String[]{"zyx","wvu","tsr"};
        System.out.println(method(strs));

    }


    /**
     * 获取不是按字典序升序排列的的列总数
     * @param strs  字符串数组
     * @return  列总数
     */
    public static int method (String[] strs) {
        // 预定义结果
        int count = 0;
        // 参数校验
        if(strs == null || strs.length == 0) return count;
        // 遍历字符
        for (int i = 0; i < strs[0].length() ; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if(strs[j].charAt(i) > strs[j + 1].charAt(i)) count ++; break;
            }
        }
        return count;
    }

}
