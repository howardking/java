package cn.sict2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            System.out.println(value);
        }
        
        System.out.println("------------------");
        
        for (String string : list) {
            System.out.println(string);
        }
        
        System.out.println("-------------------");
        
        for (Iterator<String> iter = list.iterator(); iter.hasNext();){
            String string = iter.next();
            System.out.println(string);
        }
    }
}
