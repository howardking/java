package cn.sict2;

public class GenericFoo<T>
{
    private T foo;

    /**
     * @param foo the foo to set
     */
    public void setFoo(T foo) {
        this.foo = foo;
    }

    /**
     * @return the foo
     */
    public T getFoo() {
        return foo;
    }
    
    public static void main(String[] args) {        
        GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
        GenericFoo<Integer> foo2 = new GenericFoo<Integer>();
        
        foo1.setFoo(new Boolean(true));
        foo2.setFoo(new Integer(100));
        
        Boolean b = foo1.getFoo();
        Integer i = foo2.getFoo();
        
        System.out.println(b);
        System.out.println(i);
        
        GenericFoo<String> foo3 = new GenericFoo<String>();
        foo3.setFoo("Hello world");
        System.out.println(foo3.getFoo());
        
        GenericFoo a = new GenericFoo();
        a.setFoo("String");
        String str = (String)a.getFoo();
        System.out.println(str);
    }
}
