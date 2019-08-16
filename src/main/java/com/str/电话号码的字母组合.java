package com.str;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * 方法：回溯
 * 回溯是一种通过穷举所有可能情况来找到所有解的算法。如果一个候选解最后被发现并不是可行解，回溯算法会舍弃它，并在前面的一些步骤做出一些修改，并重新尝试找到可行解。
 * 给出如下回溯函数 backtrack(combination, next_digits) ，它将一个目前已经产生的组合 combination 和接下来准备要输入的数字 next_digits 作为参数。
 * 如果没有更多的数字需要被输入，那意味着当前的组合已经产生好了。
 * 如果还有数字需要被输入：
 * 遍历下一个数字所对应的所有映射的字母。
 * 将当前的字母添加到组合最后，也就是 combination = combination + letter 。
 * 重复这个过程，输入剩下的数字： backtrack(combination + letter, next_digits[1:]) 。
 *
 * @author lichaoi <br/>
 * @date 2019年08月16日  15:44
 */
public class 电话号码的字母组合 {

    public static void main(String[] args) {
        String s = "72347";
        List<String> list = letterCombinations(s);
        System.out.println(JSONObject.toJSONString(list));
    }

    static Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    static List<String> ret = new ArrayList<String>();

    private static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() < 1) {
            return null;
        }
        backData("", digits);
        return ret;
    }

    public static void backData(String combination, String next_digits) {
        if (next_digits.length() == 0) {
            ret.add(combination);
        }
        else {
            String digit = next_digits.substring(0, 1);
            String letters = phone.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = phone.get(digit).substring(i, i + 1);
                backData(combination + letter, next_digits.substring(1));
            }
        }
    }
}
