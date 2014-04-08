package cn.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWatched implements Watched
{
    private List<Watcher> list = new ArrayList<Watcher>();
    /* (non-Javadoc)
     * @see cn.observer.Watched#addWatcher(cn.observer.Watcher)
     */
    @Override
    public void addWatcher(Watcher watcher) {
        // TODO Auto-generated method stub
        list.add(watcher);
    }

    /* (non-Javadoc)
     * @see cn.observer.Watched#removeWatcher(cn.observer.Watcher)
     */
    @Override
    public void removeWatcher(Watcher watcher) {
        // TODO Auto-generated method stub
        list.remove(watcher);
    }

    /* (non-Javadoc)
     * @see cn.observer.Watched#notifyWatchers(java.lang.String)
     */
    @Override
    public void notifyWatchers(String str) {
        // TODO Auto-generated method stub
        for(Watcher watcher: list){
            watcher.update(str);
        }
    }
    
}
