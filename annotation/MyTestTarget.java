package cn.annotation;

//@MyTarget("world")
public class MyTestTarget
{
    @MyTarget("hello")
    public void doSomething(){
        System.out.println("hello world");
    }
}
