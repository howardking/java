package cn.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection
{
    public static void main(String[] args) throws Exception{
        MyTest myTest = new MyTest();
        Class<?> classType = myTest.getClass();
        Method method = classType.getMethod("output", new Class[]{});
        if (method.isAnnotationPresent(MyAnnotation.class)){
            method.invoke(myTest, new Object[]{});
            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            String hello = myAnnotation.hello();
            String world = myAnnotation.world();
            System.out.println(hello);
            System.out.println(world);
        }
        
        Annotation[] annotation = method.getAnnotations(); 
        for (Annotation ann : annotation){
            System.out.println(ann.annotationType().getName());
        }
        
        method.invoke(myTest, new Object[]{});
        
    }
}
