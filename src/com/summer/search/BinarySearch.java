package com.summer.search;

/**
 * @author summer
 * @create 2022-03-31 19:19
 * @Description 二分/折半查找
 */
public class BinarySearch {



    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,5,7,8,9,10};
        System.out.println(binarySearch(1,nums));
        System.out.println(binarySearch(5,nums));
        System.out.println(binarySearch(15,nums));

    }

    /**
     * 二分/折半查找法
     * @param num 整数
     * @param nums  有序数组
     * @return  下标
     */
    static int binarySearch(int num,int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int middle;
        while (left <= right){
            middle = (left + right ) / 2;
            if(num < nums[middle]){
                right = middle - 1;
            }else if(num > nums[middle]){
                left = middle + 1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
