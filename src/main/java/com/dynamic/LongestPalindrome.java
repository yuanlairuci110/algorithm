package com.dynamic;

import com.alibaba.fastjson.JSONObject;

import java.util.Scanner;

/**
 * @author lichaoi <br/>
 * @date 2019年06月27日  18:53
 * <p>
 * 最长回文子串
 * <p>
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 实例：
 * 输入： babad  输出： bab  【注意】："aba" 也是一个有效答案。
 * 输入：cbbd  输出： bb
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(longestPalindrome(str));
    }

    private static String longestPalindrome(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        int start = 0, max = 1;
        // 数组 【对角线为1】
        int[][] dp = new int[str.length()][str.length()];
        for (int i = 0; i < str.length(); i++) {
            dp[i][i] = 1;
        }
        for (int j = 0; j < str.length(); j++) {
            for (int i = j - 1; i >= 0; i--) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (j - i == 1) {
                        dp[i][j] = 2;
                    } else {
                        if (dp[i + 1][j - 1] > 0) {
                            dp[i][j] = dp[i + 1][j - 1] + 2;
                        } else
                            dp[i][j] = 0;
                    }
                } else
                    dp[i][j] = 0;

                if (dp[i][j] > max) {
                    max = dp[i][j];
                    start = i;
                }
            }
        }
//        System.out.println(JSONObject.toJSONString(dp));
//        System.out.println(start + " " + max);
        return str.substring(start, max + start);
    }
}
