package cn.sict2;

public class ObjectFoo
{
    private Object foo;
    
    /**
     * @return the foo
     */
    public Object getFoo() {
        return foo;
    }

    /**
     * @param foo the foo to set
     */
    public void setFoo(Object foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {
        ObjectFoo foo1 = new ObjectFoo();
        ObjectFoo foo2 = new ObjectFoo();
        
        foo1.setFoo(new Boolean(false));
        Boolean b = (Boolean)foo1.getFoo();
        
        foo2.setFoo(new Integer(10));
    }
    
}
