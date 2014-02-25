package cn.sict2;

public class WraperFoo<T>
{
    private GenericFoo3<T> foo;

    /**
     * @return the foo
     */
    public GenericFoo3<T> getFoo() {
        return foo;
    }

    /**
     * @param foo the foo to set
     */
    public void setFoo(GenericFoo3<T> foo) {
        this.foo = foo;
    }
    
    public static void main(String[] args) {
        GenericFoo3<Integer> foo = new GenericFoo3<Integer>();
        foo.setFoo(new Integer(-100000));
        
        WraperFoo<Integer> wrapper = new WraperFoo<Integer>();
        wrapper.setFoo(foo);
        
        GenericFoo3<Integer> g = wrapper.getFoo();
        System.out.println(g.getFoo());
    }
}

class GenericFoo3<T>
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
    
    
}