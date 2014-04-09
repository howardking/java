package cn.io;

public class Fabonacci
{
    public int compute(int n){
        if (n == 2 || n == 1){
            return 1;
        }else {
            return compute(n-1) + compute(n-2);
        }
    }
    
    public static void main(String[] args) {
        Fabonacci fabo = new Fabonacci();
        for (int i = 1; i <= 10; i ++){
            System.out.println(fabo.compute(i));
        }
    }
}
