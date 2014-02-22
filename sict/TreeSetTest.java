package cn.sict;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest
{
    public static void main(String[] args) {
        TreeSet set = new TreeSet(new MyComparator2());
        
//        set.add("C");
//        set.add("A");
//        set.add("B");
//        set.add("e");
//        set.add("E");
//        set.add("F");
//        set.add("D");
        
        Person p1 = new Person(10);
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(40);
        
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        
        for (Iterator iter = set.iterator(); iter.hasNext();){
            Person p = (Person)iter.next();
            System.out.println(p.score);
        }
//        System.out.println(set);
    }

}

class Person
{
    int score;
    
    public Person(int score){
        this.score = score;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.valueOf(this.score);
    }
    
    
}

class MyComparator2 implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
       
        return p1.score - p2.score;
    }
}