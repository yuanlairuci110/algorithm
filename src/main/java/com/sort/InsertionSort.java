package com.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * 插入排序
 * <p>
 * 通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 最佳情况：T(n) = O(n)   最坏情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
 *
 * @author lichaoi <br/>
 * @date 2019年07月29日  11:13
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 15, 26, 27, 2, 36, 4, 19, 36, 38, 44, 46, 47, 48, 50};
        for (int i = 1; i < nums.length; i++) {
            int curValue = nums[i];
            int preIndex = i - 1;
            while (preIndex >= 0 && curValue < nums[preIndex]) {
                nums[preIndex + 1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex + 1] = curValue;
        }
        System.out.println(JSONObject.toJSONString(nums));

    }
}
