package cn.annotation;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class SuppressWarningsTest
{
    @SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put("hello", new Date().toLocaleString());
        
        System.out.println(map.get("hello"));
        
    }
}
