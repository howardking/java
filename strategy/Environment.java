package strategy;

import java.util.List;

public class Environment
{
    private SortInterface sortInterface;
    public Environment(SortInterface sortinterface){
        this.sortInterface = sortinterface;
    }
    
    public  Environment() {
        
    }
    /**
     * @param sortInterface the sortInterface to set
     */
    public void setSortInterface(SortInterface sortInterface) {
        this.sortInterface = sortInterface;
    }
    
    public void sort(List<Person> list){
        this.sortInterface.sort(list);
    }
    
}
