package cn.sict2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest<T>
{
    private T foo;

    /**
     * @return the foo
     */
    public T getFoo() {
        return foo;
    }

    /**
     * @param foo the foo to set
     */
    public void setFoo(T foo) {
        this.foo = foo;
    }
    
    public static void main(String[] args) {
        GenericTest<? extends List> ge = null;
        
        ge = new GenericTest<ArrayList>();
        ge = new GenericTest<LinkedList>();
        
        GenericTest<? super List> ge2 = null;
        ge2 = new GenericTest<Object>();
        
        GenericTest<String> ge3 = new GenericTest<String>();
        ge3.setFoo("Hello World");
        
        GenericTest<? extends Object> ge4 = ge3;
        
        System.out.println(ge4.getFoo());
        ge4.setFoo(null);
        System.out.println(ge4.getFoo());
//        ge4.setFoo(new String("Welcome"));
        GenericTest<?> ge5 = ge3;
    }
}
