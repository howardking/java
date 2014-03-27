package cn.exception;

public class ExceptionTest4
{
    public void method(String str) throws Exception{
        if (null == str){
            throw new MyException("传入的字符串参数不能为null");
        }else if ("hello".equals(str)){
            throw new MyException2("传入的字符串不能为hello");
        }else{
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) {//throws Exception{
        ExceptionTest4 test = new ExceptionTest4();
        try{
            test.method(null);
        }catch(MyException e){
            System.out.println("进入到MyException块");
            e.printStackTrace();
        }catch(MyException2 e){
            System.out.println("进入到MyException2块");
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("异常处理完毕");
        }
//        test.method(null);
        
        System.out.println("程序执行完毕");
    }
}
