package cn.sict1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class RandomTest
{

    public static void main(String[] args) {
       // TODO Auto-generated method stub
        Map map = new TreeMap();
        
        Random random = new Random();
        
        for (int i = 0; i < 50; i++) {
            int number = random.nextInt(41) + 10;
            
            Integer in = new Integer(number);
            
            if (map.get(in) == null){
                map.put(in, new Integer(1));
            } else {
                int value = ((Integer)map.get(in)).intValue();
                map.put(in, new Integer(value + 1));
            }
        }
        
        Collection cols = map.values();
        
        Integer maxOccurs = (Integer)Collections.max(cols);
        
        Set set = map.entrySet();
        
        List list = new ArrayList();
        
        for (Iterator iter = set.iterator(); iter.hasNext();){
            Map.Entry entry = (Map.Entry)iter.next();
            
            Integer key = (Integer)entry.getKey();
            Integer value = (Integer)entry.getValue();
            
            if (value.intValue() == maxOccurs.intValue()){
                list.add(key);
            }
            
            System.out.println(key + ":" + value);
        }
        
        System.out.println("出现的最多的次数为：" + maxOccurs);
        
        System.out.println("这些数字分别是：");
        
        for (Iterator iter = list.iterator(); iter.hasNext();){
            System.out.println(((Integer)iter.next()).intValue());
        }
    }

}
