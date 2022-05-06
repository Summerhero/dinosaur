package com.summer.structure;

/**
 * @author summer
 * @create 2022-04-08 10:39
 * @Description
 */
public class DynamicArray {

    // 常量
    // 初始容量
    private final int INIT_CAPACITY = 10;


    // 定义数组
    private int[] array;

    // 数组大小
    private int size;

    /**
     * 无参构造，构造数组，默认容量为10
     */
    public DynamicArray(){
        // 默认初始大小为10
        array = new int[INIT_CAPACITY];
    }

    /**
     * 有参构造，指定数组容量
     * @param capacity  数组容量
     */
    public DynamicArray(int capacity){
        // 参数校验
//        if(capacity < 0 || capacity >Integer.MAX_VALUE) {
//            throw new Exception("illegal capacity: "+ capacity);
//        }
        // 实例化数组
        capacity = capacity < INIT_CAPACITY ? INIT_CAPACITY : capacity;
        array = new int[capacity];
    }


    /**
     *  回去数组大小
     * @return
     */
    public int size(){
        return size;
    }

    // 通过下标获取元素

    /**
     * 获取指定下标的元素
     * @param index 下标
     * @return  下标对应元素
     */
    public int getByIndex(int index){
        // index 参数校验
        return array[index];
    }


    /**
     * 判断该元素是否存在数组中
     * @param element   元素
     * @return  true 存在 false 不存在
     */
    public boolean contains(int element){
        // 遍历数组
        for (int ele:array) {
            if (ele == element){
                return true;
            }
        }
        return false;
    }



    /**
     * 在指定位置添加元素
     * @param index 下标
     * @param element 元素
     */
    public void add(int index,int element){

    }



    /**
     * 数组末尾追加元素
     * @param element   元素
     */
    public void append(int element){

    }

    // 修改指定位置元素

    /**
     *
     * @param index
     * @param element
     */
    public void set(int index,int element){

    }

    // 查询元素下标

    // 删除元素

    // 清空数组

    // 打印数组
}
