package cn.exception;

public class ExceptionTest3
{
    public void method(String str) throws MyException{
        if (null == str){
            throw new MyException("传入的字符串参数不能为null");
        }else{
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) throws Exception{
        ExceptionTest3 test = new ExceptionTest3();
        try{
            test.method(null);
        }catch(MyException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("finally异常处理完毕");
        }
//        test.method(null);
        
        System.out.println("异常处理完毕");
    }
}
