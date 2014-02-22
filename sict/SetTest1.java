package cn.sict;

import java.util.HashSet;

public class SetTest1
{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashSet set = new HashSet();
        
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("a");
        
        System.out.println(set);
    }

}
