package cn.dynamicproxy;

import java.lang.reflect.Proxy;

public class Demo
{
    public static void main(String[] args) {
        CommonInvocationHandler handler = new CommonInvocationHandler();
        
        Foo f = null;        
        handler.setObj(new FooImplement());        
        f = (Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class[]{Foo.class}, handler);
        f.doAction();
        System.out.println("--------------------------------------");
        handler.setObj(new FooImplement2());
        f = (Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class[]{Foo.class}, handler);
        f.doAction();
    }
}
