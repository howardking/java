package cn.proxy;

public class ProxySubject extends Subject
{

    private RealSubject realSubject; //代理角色内部引用了真实角色
    
    @Override
    public void request() {
        // TODO Auto-generated method stub
        this.preRequest();
        if(null == realSubject){
            realSubject = new RealSubject();
        }
        
        realSubject.request(); //真实角色所完成的事情
        
        postTequest();
    }
    
    private void preRequest(){ //在真实角色操作之前所附加的操作
        System.out.println("pre request");
    }
    
    private void postTequest(){ //在真实角色操作之后所附加的操作
        System.out.println("post request");
    }

}
