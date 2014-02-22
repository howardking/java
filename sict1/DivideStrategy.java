package cn.sict1;

public class DivideStrategy implements Strategy
{

    @Override
    public int calculate(int a, int b) {
        if (b != 0){
            return a / b;
        } else {
            return 0;
        }
    }

}
