package cn.sict;

import java.util.HashMap;

public class MapTest1
{
    public static void main(String[] args) {
        HashMap map = new HashMap();
        
        map.put("a", "zhangsan");
        map.put("b", "lisi");
        map.put("c", "wangwu");
        map.put("a", "zhaoliu");
        
//        System.out.println(map);
        
        String value = (String)map.get("b");
        System.out.println(value);
        System.out.println(map.get("a"));
        System.out.println(map.get("d"));
    }

}
