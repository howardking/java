package cn.sict1;

public class Client
{
    public static void main(String[] args) {
        AddStrategy addStrategy = new AddStrategy();
        
        Environment environment = new Environment(addStrategy);
        System.out.println(environment.calculate(3, 4));
        
        SubtractStrategy subStrategy = new SubtractStrategy();
        environment = new Environment(subStrategy);
        System.out.println(environment.calculate(2, 10));
        
        MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
        environment = new Environment(multiplyStrategy);
        System.out.println(environment.calculate(2, 10));
        
        DivideStrategy divideStrategy = new DivideStrategy();
        environment = new Environment(divideStrategy);
        System.out.println(environment.calculate(10, 2));
    }
}
