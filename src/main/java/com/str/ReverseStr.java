package com.str;

import java.util.Scanner;

/**
 * @author lichaoi <br/>
 * @date 2019年06月13日  19:36
 */
public class ReverseStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String reverseStr = getReverseStr(str);
        System.out.println("字符串：" + str);
        System.out.println("倒置后的：" + reverseStr);
        System.out.println("是否回文：" + (str.equals(reverseStr) ? "是" : "否"));
    }

    private static String getReverseStr(String str) {
        if (null == str || "".equals(str)) {
            return null;
        }
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length / 2; i++) {
            char temp = letters[i];
            letters[i] = letters[letters.length - i - 1];
            letters[letters.length - i - 1] = temp;
        }
        return new String(letters);
    }
}
