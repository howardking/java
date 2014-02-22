/**
 * 
 */
package cn.sict;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author howard
 *
 */
public class CollectionTest
{

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList list = new LinkedList();
        
        list.add(-8);
        list.add(10);
        list.add(-20);
        list.add(100);
        
        System.out.println(list);
        
        Comparator r = Collections.reverseOrder();
        
        Collections.sort(list, r);
        
        for (Iterator iter = list.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
        
        Collections.shuffle(list);
        
        for (Iterator iter = list.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
        
        System.out.println("minimum value: " + Collections.min(list));
        System.out.println("maximum value: " + Collections.max(list));
    }

}
