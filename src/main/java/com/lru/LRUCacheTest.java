package com.lru;

/**
 * @author lichaoi <br/>
 * @date 2019年08月13日  18:31
 */
public class LRUCacheTest {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<Integer, String>();
        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");
        cache.get(1);
        cache.put(4, "d");
        cache.get(4);
        System.out.println(cache.keySet());
        cache.put(4, "e");
    }
}
