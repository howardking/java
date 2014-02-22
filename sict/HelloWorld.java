package cn.sict;

import java.util.ArrayList;
import java.util.LinkedList;

public class HelloWorld
{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(4);
        list.add(1, 3);
        System.out.println(list);
        ArrayList listArray = new ArrayList();

        listArray.add(1);
        listArray.add(2);
        listArray.add(0, new Integer(9));
        System.out.println(listArray);
    }

}
