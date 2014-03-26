package cn.annotation;


@MyAnnotation(hello="bj", world="sh")
public class MyTest
{
    @MyAnnotation(hello="tianjin", world="bj")
    @Deprecated
    @SuppressWarnings("unchecked")
    public void output(){
        System.out.println("output .....");
    }
//    public static void main(String[] args) {
//        MyTest test = new MyTest();
//        test.output();
//    }
}
