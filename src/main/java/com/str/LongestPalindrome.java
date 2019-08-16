package com.str;

/**
 * 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 示例 1：
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * <p>
 * 示例 2：
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * @author lichaoi <br/>
 * @date 2019年08月16日  14:53
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "cbbd";
        String resultStr = longestPalindrome(str);
        System.out.println(resultStr);
    }

    private static String longestPalindrome(String s) {
        int start = 0, end = 0;
        char[] chat = s.toCharArray();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int oneLen = getMax1(i, i, chat);
            int twoLen = getMax1(i, i + 1, chat);

            if (oneLen > max && oneLen > twoLen) {
                max = oneLen;
                start = i - (max - 1) / 2;
                end = i + (max - 1) / 2 + 1;
            } else if (twoLen > max && twoLen > oneLen) {
                max = twoLen;
                start = i - max / 2 + 1;
                end = i + max / 2 + 1;
            }
        }
        return s.substring(start, end);
    }

    private static int getMax1(int indexOne, int indexTwo, char[] chat) {
        int start = indexOne, end = indexTwo, len = 0;
        while (start >= 0 && end < chat.length && chat[start] == chat[end]) {
            len = end - start + 1;
            start--;
            end++;
        }
        return len;

    }
}
