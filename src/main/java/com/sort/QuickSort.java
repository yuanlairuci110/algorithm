package com.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * 快速排序
 * <p>
 * 通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序。
 *
 * 先排右边，再排左边
 *
 * @author lichao
 * @date 2019年07月29 19:17
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 15, 26, 27, 2, 36, 4, 19, 36, 38, 44, 46, 47, 48, 50};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(JSONObject.toJSONString(nums));
    }

    private static void quickSort(int[] nums, int start, int end) {
        if (nums.length < 1 || start < 0 || end > nums.length || start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int temp = nums[start];
        while (i < j) {
            while (nums[j] >= temp && i < j) {
                j--;
            }
            while (nums[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        nums[start] = nums[i];
        nums[i] = temp;
        quickSort(nums, start, i - 1);
        quickSort(nums, i + 1, end);
    }
}
