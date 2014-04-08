package cn.innerclass;

class MemberInner
{
    private int a = 4;
    
    public class Inner2
    {
        private int a = 5;
        public void test(){
            System.out.println(MemberInner.this.a);
            System.out.println(MemberInner.Inner2.this.a);
        }
    }
    public void test(){
        this.new Inner2().test();
    }
}

public class MemberInnerClassTest
{
    public static void main(String[] args) {
        MemberInner.Inner2 inner = new MemberInner().new Inner2();
        inner.test();
        MemberInner meminner = new MemberInner();
        meminner.test();
    }
}
