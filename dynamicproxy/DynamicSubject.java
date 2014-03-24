package cn.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler
{
    private Object sub;
    
    public DynamicSubject(Object obj){
        this.sub = obj;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("Before calling: " + method);
        
        method.invoke(sub, args);
        //((RealSubject)sub).request();
        
        System.out.println("After calling: " + method);
        
        return null;
    }

}
