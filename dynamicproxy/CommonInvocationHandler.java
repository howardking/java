package cn.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CommonInvocationHandler implements InvocationHandler
{
    private Object obj;
    
    public CommonInvocationHandler(Object target) {
        // TODO Auto-generated constructor stub
        
        this.obj = target;
    }
    
    public CommonInvocationHandler(){}
    
    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // TODO Auto-generated method stub
        return method.invoke(obj, args);
    }

}
