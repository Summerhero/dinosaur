package com.summer.code;

/**
 * @author summer
 * @create 2022-04-07 10:34
 * @Description https://leetcode-cn.com/problems/rotate-string/
 *              796. 旋转字符串
 */
public class RotateString {

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s,goal));
        goal = "abced";
        System.out.println(rotateString(s,goal));
    }


    /**
     * 由于每次旋转操作都是将最左侧字符移动到最右侧，因此如果 goal 可由 s 经过多步旋转而来，
     * 那么 goal 必然会出现在 s + s 中，即满足 (s + s).contains(goal)，同时为了 s 本身过长导致的结果成立，我们需要先确保两字符串长度相等。
     *
     * @param s 原字符串
     * @param goal  目标字符串
     * @return  true 满足 false 不满足
     */
    static boolean rotateString(String s, String goal) {

        return s.length() == goal.length() && (s + s ).contains(goal);

    }
}
