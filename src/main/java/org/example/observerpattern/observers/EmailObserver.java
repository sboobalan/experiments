package org.example.observerpattern.observers;

import org.example.observerpattern.observables.Observable;

public class EmailObserver implements Observer {

    private Observable observable;

    public EmailObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Email: " + observable.getChange());
    }
}
