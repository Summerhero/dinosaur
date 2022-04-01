package com.summer.sort;

/**
 * @author summer
 * @create 2022-03-07 16:08
 * @Description 冒泡排序
 * 两相邻元素之前进行交换
 */
public class BubbleSort {

    public static void main(String[] args) {



//        int a = 3;
//        int b = 4;
//        a = a^b;
//        b = a^b;
//        a = a^b;
//        System.out.println(a);
//        System.out.println(b);


        int[] result = method(null);
        result = method(new int[]{});

        for (int num:result) {
            System.out.println(num);
        }
        System.out.println("***********************");

        result = method(new int[]{1,4,3,3,2});
        for (int num:result) {
            System.out.println(num);
        }
        System.out.println("***********************");

        result = method(new int[]{1,3,5,6,7,2,3,5,2});
        for (int num:result) {
            System.out.println(num);
        }
        System.out.println("***********************");

        result = method(new int[]{1,2,4,6,3,3,3,2,8});
        for (int num:result) {
            System.out.println(num);
        }

    }




    /**
     * 冒泡排序，正序排列
     * 两数交换时，采用异或形式
     * @param array 数组
     * @return  排序后数组
     */
    public static int[] method(int[] array) {
        // 参数校验
        if(array == null) return array;
        // 遍历数据
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j <array.length ; j++) {
                if(array[i] > array[j]){
                    // 采用中间量的形式
                    int temp = array[j];
//                    array[j] = array[i];
//                    array[i] = temp;//
//                    // 采用算数运算的形式交换
//                    array[i] = array[i] + array[j];
//                    array[j] = array[i] - array[j];
//                    array[i] = array[i] - array[j];
                    // 用异或的形式，实现两数交换
                    array[i] = array[i]^array[j];
                    array[j] = array[j]^array[i];
                    array[i] = array[i]^array[j];

                }
            }
        }
        return array;
    }

}
