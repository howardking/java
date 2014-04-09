package cn.io;

public class Test1
{
    // 递归方式计算阶乘
    public int compute(int number){
        if (number == 1 || number == 0){
            return 1;
        }
        return number * compute(number - 1);
    }
    
    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println(test.compute(10));
    }
}
