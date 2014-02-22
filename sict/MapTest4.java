package cn.sict;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest4
{
    public static void main(String[] args) {
        HashMap map = new HashMap();
        
        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
            if (null == map.get(args[i])){
                map.put(args[i], 1);
            }else {
                map.put(args[i], (int)map.get(args[i])+1);
            }
            
        }
        
        Set set = map.keySet();
        
        for (Iterator iter = set.iterator(); iter.hasNext();){
            String key = (String)iter.next();
            int value = (int)map.get(key);
            
            System.out.println(key + ":" + value);
        }
        
    }
}
