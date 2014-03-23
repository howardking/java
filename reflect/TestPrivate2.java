package cn.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestPrivate2
{
    public static void main(String[] args) throws Exception {
        Private2 p = new Private2();
        Class<?> classType  = p.getClass();
        Method method = classType.getMethod("getName", new Class[]{});
        Field field = classType.getDeclaredField("name");
        field.setAccessible(true);//压制JAVA对访问修饰符的检查
        field.set(p, "lisi");
        String str = (String)method.invoke(p, new Object[]{});
        System.out.println(str);
    }
}
