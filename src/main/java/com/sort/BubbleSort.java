package com.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * 冒泡排序
 *
 * 算法描述: 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 最佳情况：T(n) = O(n)   最差情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
 *
 * @author lichaoi <br/>
 * @date 2019年07月29日  9:31
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 15, 26, 27, 2, 36, 4, 19, 36, 38, 44, 46, 47, 48, 50};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(JSONObject.toJSONString(nums));
    }
}
