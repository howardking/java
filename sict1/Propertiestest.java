package cn.sict1;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Propertiestest
{
    public static void main(String[] args) {
        
        Properties p = System.getProperties();
        
        Set set = p.keySet();
        
        for(Iterator iter = set.iterator(); iter.hasNext();){
            String key = (String)iter.next();
            String value = p.getProperty(key);
            System.out.println(key + "=" + value);
        }
        
        System.out.println();
    }
}
