package cn.reflect;

import java.lang.reflect.Array;

public class ArrayTester1
{
    public static void main(String[] args) throws Exception {
        Class<?> classtype = Class.forName("java.lang.String");
        Object array = Array.newInstance(classtype, 10);
        Array.set(array, 5, "hello");
        String str = (String)Array.get(array, 5);
        System.out.println(str);
    }
}
