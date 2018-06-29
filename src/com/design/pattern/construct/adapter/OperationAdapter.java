package com.design.pattern.construct.adapter;
// 适配器
public class OperationAdapter implements OperationTarget {

    private QuickSortAdaptee sortAdaptee;

    private BinarySearchAdaptee searchAdaptee;

    public OperationAdapter() {
        sortAdaptee = new QuickSortAdaptee();
        searchAdaptee = new BinarySearchAdaptee();
    }

    @Override
    public int[] sort(int[] arr) {
        return sortAdaptee.sort(arr);
    }

    @Override
    public int search(int[] arr, int key) {
        return searchAdaptee.binarySearch(arr, key);
    }
}
