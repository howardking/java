package cn.annotation;

public class OverrideTest 
{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "This is OverrideTest";
    }
    
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        System.out.println(test);
    }
}
