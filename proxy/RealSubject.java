package cn.proxy;

public class RealSubject extends Subject
{

    @Override
    public void request() {
        // T    ODO Auto-generated method stub
        System.out.println("From real subject.");
    }

}
