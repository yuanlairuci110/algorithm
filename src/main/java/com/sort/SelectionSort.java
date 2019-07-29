package com.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * 选择排序
 * <p>
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 *
 * 最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)
 *
 * @author lichaoi <br/>
 * @date 2019年07月29日  10:50
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 15, 26, 27, 2, 36, 4, 19, 36, 38, 44, 46, 47, 48, 50};
        for (int i = 0; i < nums.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = nums[i];
                nums[i] = nums[maxIndex];
                nums[maxIndex] = temp;
            }
        }
        System.out.println(JSONObject.toJSONString(nums));
    }
}
