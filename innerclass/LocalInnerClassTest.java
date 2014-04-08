package cn.innerclass;

class LocalInner
{
    final int a = 40;
    public void test(){
//        final int a = 4;
        class Inner3{
//            int a = 5;
            public void test(){
                System.out.println("hello world");
                System.out.println(a);
//                System.out.println(LocalInner.this.test().a);
            }
        }
        
        new Inner3().test();
    }
}

public class LocalInnerClassTest
{
    public static void main(String[] args) {
        LocalInner inner = new LocalInner();
        inner.test();
    }
}
