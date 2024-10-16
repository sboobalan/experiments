package org.example.observerpattern.observers;

import org.example.observerpattern.observables.Observable;

public class MobileObserver implements Observer {

    private Observable observable;

    public MobileObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Mobile: " + observable.getChange());
    }

}
