package cn.exception;

public class ExceptionTest
{
    public static void main(String[] args) {
        int c = 0;
        try{
            int a = 3;
            int b = 0;
            
            System.out.println("Bdfore /0");
            c = a / b;
            System.out.println("After /0");
        }catch(ArithmeticException e){
//            System.out.println(e);
            e.printStackTrace();
        }
        
        finally{
            System.out.println("welcome");
        }
        
        System.out.println("hello world");
        System.out.println(c);
    }
}
