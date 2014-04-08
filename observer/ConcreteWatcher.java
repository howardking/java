package cn.observer;

public class ConcreteWatcher implements Watcher
{

    /* (non-Javadoc)
     * @see cn.observer.Watcher#update(java.lang.String)
     */
    @Override
    public void update(String str) {
        // TODO Auto-generated method stub
        System.out.println(str);
    }

}
