package cn.dynamicproxy;

public class RealSubject implements Subject
{

    @Override
    public void request() {
        // TODO Auto-generated method stub
        System.out.println("From real Subject!");
    }
    
    @Override
    public void Print() {
        // TODO Auto-generated method stub
        System.out.println("Print in Real Subject");
    }

}
