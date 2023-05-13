package com.zyz.demo;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/13 11:06
 * @Description:适配器
 */
public class MyOperationAdapter implements ScoreOperation{
    private QuickSort sortObj; //定义适配者QuickSort对象
    private  BinarySearch searchObj; //定义适配者BinarySearch对象

    public MyOperationAdapter(){
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array,key);
    }
}

