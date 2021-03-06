import java.util.ArrayList;
import java.util.List;
 
public class BakingCookie implements Subject {
     
    private List<Observer> observers = new ArrayList<>();
 
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }
 
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }
 
    @Override
    public void notifyUpdate(Cookie n) {
        for(Observer o: observers) {
            o.update(n);
        }
    }
}