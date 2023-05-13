package com.zyz.demo;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/13 10:20
 * @Description: 定义适配者：具体完成的接口方法、适配器：接口请求转化。抽象目标接口：客户端实际调用接口
 */
/**
 *  抽象成绩操作类：目标接口
 */
interface ScoreOperation {
    public int[] sort(int array[]); //成绩排序
    public int search(int array[],int key); //成绩查找
}


/**
 * 快速排序类：适配者
 */
class QuickSort {
    public int[] quickSort(int array[]) {
        sort(array,0,array.length-1);
        return array;
    }

    public void sort(int array[],int p, int r) {
        int q=0;
        if(p<r) {
            q=partition(array,p,r);
            sort(array,p,q-1);
            sort(array,q+1,r);
        }
    }

    public int partition(int[] a, int p, int r) {
        int x=a[r];
        int j=p-1;
        for (int i=p;i<=r-1;i++) {
            if (a[i]<=x) {
                j++;
                swap(a,j,i);
            }
        }
        swap(a,j+1,r);
        return j+1;
    }

    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

/**
 * 二分查找类：适配者
 */
class BinarySearch {
    public int binarySearch(int array[],int key) {
        int low = 0;
        int high = array.length -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];
            if(midVal < key) {
                low = mid +1;
            }
            else if (midVal > key) {
                high = mid -1;
            }
            else {
                return 1; //找到元素返回1
            }
        }
        return -1;  //未找到元素返回-1
    }
}


/**
 * 适配器
 */
class OperationAdapter implements ScoreOperation{
    private QuickSort sortObj; //定义适配者QuickSort对象
    private  BinarySearch searchObj; //定义适配者BinarySearch对象

    public OperationAdapter(){
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
