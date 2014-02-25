package cn.sict2;

public class Generic3<T1, T2, T3>
{

    private T1 foo1;
    private T2 foo2;
    private T3 foo3;
    
    
    /**
     * @return the foo1
     */
    public T1 getFoo1() {
        return foo1;
    }


    /**
     * @param foo1 the foo1 to set
     */
    public void setFoo1(T1 foo1) {
        this.foo1 = foo1;
    }


    /**
     * @return the foo2
     */
    public T2 getFoo2() {
        return foo2;
    }


    /**
     * @param foo2 the foo2 to set
     */
    public void setFoo2(T2 foo2) {
        this.foo2 = foo2;
    }


    /**
     * @return the foo3
     */
    public T3 getFoo3() {
        return foo3;
    }


    /**
     * @param foo3 the foo3 to set
     */
    public void setFoo3(T3 foo3) {
        this.foo3 = foo3;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Generic3<Integer, Boolean, String> foo = new Generic3<Integer, Boolean, String>();
        foo.setFoo1(new Integer(10));
        foo.setFoo2(false);
        foo.setFoo3("Hello World");
        
        System.out.println(foo.getFoo1());
        System.out.println(foo.getFoo2());
        System.out.println(foo.getFoo3());
    }

}
