package cn.annotation;

import java.util.Date;

public class DeprecatedTest
{
    @Deprecated
    public void doSomething(){
        System.out.println("do Something");
    }
    
    public static void main(String[] args) {
        DeprecatedTest test = new DeprecatedTest();
        test.doSomething();
//        Date date = new Date();
//        System.out.println(date.toLocaleString());
    }
}
