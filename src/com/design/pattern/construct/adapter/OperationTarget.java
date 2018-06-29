package com.design.pattern.construct.adapter;

/**
 *
 */
public interface OperationTarget {
    int[] sort(int[] arr);
    int search(int[] arr, int key);
}
