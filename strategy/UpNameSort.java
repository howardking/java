package strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UpNameSort implements SortInterface, Comparator<Person>
{

    @Override
    public void sort(List<Person> list) {
        // TODO Auto-generated method stub
        Collections.sort(list, this);
    }
    
    @Override
    public int compare(Person o1, Person o2) {
        // TODO Auto-generated method stub
        int result = o1.getName().compareTo(o2.getName());
        if (0 == result){
            return o1.getId()-o2.getId();
        }
        return result;
    }

}
