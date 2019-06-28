package com.dynamic;

/**
 * @author lichaoi <br/>
 * @date 2019年06月28日  16:05
 * <p>
 * 最大子序和
 * <p>
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 实例：输入: [-2,1,-3,4,-1,2,1,-5,4], 输出: 6  解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class MaxSubSum {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSub = maxSubArray(nums);
        System.out.println(maxSub);
    }

//    public static int maxSubArray(int[] nums) {
//        int maxSub = nums[0];
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (dp[i - 1] > 0) {
//                dp[i] = dp[i - 1] + nums[i];
//            } else {
//                dp[i] = nums[i];
//            }
//            if (dp[i] > maxSub) {
//                maxSub = dp[i];
//            }
//        }
//        return maxSub;
//    }

    public static int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum > 0) {
                sum = sum + nums[i];
            } else
                sum = nums[i];
            maxSub = Math.max(maxSub, sum);
        }
        return maxSub;
    }
}
