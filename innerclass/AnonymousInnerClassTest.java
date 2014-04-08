package cn.innerclass;

import java.util.Date;

public class AnonymousInnerClassTest
{
    @SuppressWarnings("deprecation")
    public String get(Date date){
//        date.test();
        return date.toLocaleString();
    }
    
    public static void main(String[] args) {
        AnonymousInnerClassTest test = new AnonymousInnerClassTest();
        
//        String str = test.get(new Date());
//        System.out.println(str);
        
        String str = test.get(new Date(){
            public void test(){
                System.out.println("In Anonymous Class");
            }
            public String toLocaleString(){
                test();
                return "Hello world";
            }
//            this.test();
        });
        System.out.println(str);
    }
}
