package com.summer.code;

/**
 * @author summer
 * @create 2022-05-05 16:35
 * @Description 713. 乘积小于 K 的子数组
 *              https://leetcode-cn.com/problems/subarray-product-less-than-k/
 */
public class _731_numSubarrayProductLessThanK {

    public static void main(String[] args) {

        int[] nums = new int[]{10,5,2,6};
        int result = method1(nums,100);
        System.out.println(result);

    }


    /**
     * 乘积小于 K 的子数组
     * @param nums  数组
     * @param k     乘积阈值
     * @return      子数组数量
     */
    private static int method1(int[] nums, int k){
        // 预定义结果
        int count = 0;
        // 参数判断
        if(k < 1 || nums.length == 0) return count;
        //遍历数组
        // 预定义乘积
        int product ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k) break;
            // 小于k值,计数加一
            count += 1;
            //复制乘积
            product = nums[i];
            // 遍历后续数组元素
            for (int j = i+1; j < nums.length; j++) {
                product *= nums[j];
                if (product >= k) break;
                count += 1;
            }
        }
        return count;
    }

}
