package cn.sict;

import java.util.HashSet;

public class SetTest2
{
    public static void main(String[] args) {
        HashSet set = new HashSet();
        
        set.add(new People("zhangsan"));
        set.add(new People("lisi"));
        set.add(new People("zhangsan"));
        
        People p1 = new People("zhangsan");
        
        set.add(p1);
        set.add(p1);
        
        System.out.println(set); 
        
        String s1 = new String("a");
        String s2 = new String("a");
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
        System.out.println(s1 == s2);
    }
}


class People
{
   String name;
   public People(String name){
       this.name = name;
   }
   @Override
    public String toString() {
        return this.name;
    }
}