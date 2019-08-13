package com.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lichaoi <br/>
 * @date 2019年08月13日  17:01
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private static final int MAX_SIZE = 3;

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_SIZE;
    }

    LRUCache() {
        super(MAX_SIZE, 0.75f, true);
    }
}
