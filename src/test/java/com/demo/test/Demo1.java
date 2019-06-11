package com.demo.test;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Test;

/**
 * @author lichaoi <br/>
 * @date 2019年06月11日  10:00
 */
public class Demo1 {

    @Test
    public void test_demo() {
        System.out.println("aaaaaaaa");
        System.out.println(JSONObject.toJSONString("aa", SerializerFeature.WriteMapNullValue));
    }

}
