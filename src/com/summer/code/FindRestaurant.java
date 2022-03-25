package com.summer.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @create 2022-03-14 14:33
 * @Description https://leetcode-cn.com/problems/minimum-index-sum-of-two-lists/
 *              两个列表的最小索引总和
 */
public class FindRestaurant {


    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] result = findRestaurant(list1, list2);
        for (String str:result) {
            System.out.println(str);
        }

    }


    public static String[] findRestaurant(String[] list1, String[] list2) {

//      参数校验
        if (list1 == null || list2 == null || list1.length == 0 || list1.length == 0){
            return null;
        }
//      定义存储结果的列表
        List<String> list = new ArrayList<>();
//        定义最小下标和
        int minIndexSum = Integer.MAX_VALUE;
        // 遍历数组
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if(list1[i] == list2[j]){
                    minIndexSum = addResultArray(minIndexSum,(i+ j),list2[j],list);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }

    /**
     *
     * @param oldSum
     * @param newSum
     * @param element
     * @param list
     * @return 当前的最小下标和
     */
    public static int addResultArray(int oldSum,int newSum,String element,List<String> list){

//        参数校验略
//        逻辑处理
        if(oldSum == newSum){
            list.add(element);
            oldSum = newSum;
        }
        if (oldSum > newSum ){
            list.clear();
            list.add(element);
            oldSum = newSum;
        }
//        结果返回
        return oldSum ;
    }





}
