package cn.reflect;

import cn.sict3.Child;

public class ClassTest
{
    public static void main(String[] args) {
        Class<?> classType = Child.class;
        System.out.println(classType);
        classType = classType.getSuperclass();
        System.out.println(classType);
        classType = classType.getSuperclass();
        System.out.println(classType);
        classType = classType.getSuperclass();
        System.out.println(classType);
    }
}

class Parent{}
class child extends Parent{}