package cn.annotation;

public class DocumentTest
{
    @DocumentAnnotation(hello="hello")
    public void doSomething(){
        System.out.println("hello world");
    }
}
