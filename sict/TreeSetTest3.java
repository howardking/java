package cn.sict;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest3
{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeSet set = new TreeSet(new MyComparator());
        
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("E");
        set.add("D");
        set.add("F");
        
        for (Iterator iter = set.iterator(); iter.hasNext();){
            Object value = (String)iter.next();
            System.out.println(value);
        }
    }

}

class MyComparator implements Comparator
{

    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        
        return s2.compareTo(s1);
    }
    
}