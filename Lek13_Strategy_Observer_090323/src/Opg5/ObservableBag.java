package Opg5;

import java.util.*;

public class ObservableBag implements Bag, Iterable<String>{

    private Map<String, Integer> strings;
    private Set<Observer> observers;

    public ObservableBag() {
        strings = new HashMap<>();
        observers = new HashSet<>();
    }

    @Override
    public void addString(String s) {
        if (strings.containsKey(s)) {
            strings.put(s, getCount(s) + 1);
        } else {
            strings.put(s, 1);
        }
        notifyObservers(s, getCount(s));
    }

    @Override
    public void removeString(String s) {
        if (strings.containsKey(s)) {
            strings.put(s, getCount(s) - 1);
            if (getCount(s) == 0) {
                strings.remove(s);
            }
        } if (strings.containsKey(s)){
            notifyObservers(s, getCount(s));
        }
    }

    @Override
    public int getCount(String s) {
        if (strings.containsKey(s)) {
            return strings.get(s);
        } else {
            return 0;
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String s, int antal) {
        for (Observer o : observers) {
            o.update(s, antal);
        }
    }

    public Map<String, Integer> getStrings() {
        return strings;
    }

    @Override
    public Iterator<String> iterator() {
        return strings.keySet().iterator();
    }
}

