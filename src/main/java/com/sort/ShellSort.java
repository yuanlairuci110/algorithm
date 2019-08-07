package com.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * 希尔排序
 *
 * @author lichaoi <br/>
 * @date 2019年07月29日  11:35
 */
public class ShellSort {
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
