package com.by.zgit.plugin.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("a", 1);
        if(map.containsKey("a")) {
            System.out.println("a存在");
            System.out.println(map.containsKey("b"));
        } else {
            System.out.println("a不存在");
            System.out.println(map.containsKey("b"));
        }
    }
    
}
