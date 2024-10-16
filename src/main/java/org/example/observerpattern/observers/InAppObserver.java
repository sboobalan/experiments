package org.example.observerpattern.observers;

import org.example.observerpattern.observables.Observable;

public class InAppObserver implements Observer {

    private Observable observable;

    public InAppObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("InApp: " + observable.getChange());
    }
}
