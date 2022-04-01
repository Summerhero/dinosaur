package com.summer.code;



/**
 * @author summer
 * @create 2022-03-31 15:06
 * @Description https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 *              4. 寻找两个正序数组的中位数
 */
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,5,6};
        int[] nums2 = new int[]{4,5,6,7};
//        int[] nums1 = new int[]{1,3};
//        int[] nums2 = new int[]{2};
        System.out.println(method(nums1, nums2));

    }


    /**
     * 给定两个数组，获取中位数
     * @param nums1 数组1
     * @param nums2 数组2
     * @return
     */
    static double method(int[] nums1, int[] nums2){
        // 参数校验 暂略
        int[] nums = new int[nums1.length+nums2.length];
        // 判断nums1数组的最大值是否小于 nums2数组的最小值
        if(nums1[nums1.length - 1] <= nums2[0]) {
            // int[] nums = new int[nums1.length+nums2.length];
            System.arraycopy(nums1,0,nums,0, nums1.length);
            System.arraycopy(nums2,0,nums,nums1.length, nums2.length);
        }else{
            // 计数器，记录几个数 小于 max ,应该在 nums1数组中
            int count = 0 ;
            for (int i = 0; i <nums2.length ; i++) {
                if(nums2[i] >= nums1[nums1.length -1]) {
                    count +=1;
                    break;
                }
                //将小的数据插入 nums1 中
                nums1 = insertSort2(nums2[i],nums1);
            }
            System.arraycopy(nums1,0,nums,0, nums1.length );
            if(nums2.length - nums1.length > 0)System.arraycopy(nums2,count,nums,nums1.length, nums2.length - count);
        }
        // 获取中位 下标
        int position =(nums1.length + nums2.length) / 2;
        int leftIndex = (nums1.length + nums2.length) % 2 == 0 ? position - 1: position ;
        int rightIndex =  position ;
        return (nums[leftIndex] + nums[rightIndex]) / 2;
    }


    /**
     * 将整数 num 插入有序数组，数组依旧有序
     * @param num 整数
     * @param nums 有序数组
     * @return  有序数组
     */
    static int[] insertSort(int num,int[] nums){
        int[] result = new int[nums.length + 1];
        if(num < nums[0]){
            System.arraycopy(nums,0 ,result,1, nums.length);
            result[0] = num;
        }else if(num >= nums[nums.length - 1]){
            System.arraycopy(nums,0 ,result,0, nums.length);
            result[nums.length] = num;
        }else{
            // 遍历数组
            for (int i = 0; i <nums.length; i++) {
                if(num <= nums[i]){
                    // if(i != 0 )  System.arraycopy(nums,0,result,0, i );
                    System.arraycopy(nums,0,result,0, i );
                    System.arraycopy(nums,i ,result,i+1, nums.length - i);
                    result[i] = num;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * 将整数 num 插入有序数组，数组依旧有序
     * @param num   整数
     * @param nums  有序数组
     * @return  有序数组
     */
    static int[] insertSort2(int num,int[] nums){
        int[] result = new int[nums.length + 1];
        // 定义被插入的数在新数组的下标
        int index = nums.length;
        // 遍历数组
        for (int i = 0; i <nums.length; i++) {
            if(num <= nums[i]){
                index = i;
                break;
            }
        }
        if(index != 0 )System.arraycopy(nums,0,result,0, index );
        System.arraycopy(nums,index ,result,index+1, nums.length - index);
        result[index] = num;
        return result;
    }



}
