package org.example.observerpattern.observables;

import org.example.observerpattern.observers.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    String getChange();
}
