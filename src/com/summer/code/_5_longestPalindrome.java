package com.summer.code;

/**
 * @author summer
 * @create 2022-05-06 13:39
 * @Description 5. 最长回文子串
 *              https://leetcode-cn.com/problems/longest-palindromic-substring/
 *
 */
public class _5_longestPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("aa"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abaa"));

    }

    /**
     * 判断给出字符串是否是回文字符串
     * @param str  待判定字符串
     * @return      true 是 false 不是
     */
    private static boolean isPalindrome(String str){
        // if (str.isEmpty() || str.trim().length() < 2) return false;
        if (str.length() < 2) return false;
        // 获取中间位置下标
        //int midIndex = str.length() / 2;
        if(str.length() % 2 == 0) return str.substring(0,str.length() / 2).equals(str.substring(str.length() / 2));
        return str.substring(0,str.length() / 2).equals(str.substring(str.length() / 2 + 1));
    }


}


