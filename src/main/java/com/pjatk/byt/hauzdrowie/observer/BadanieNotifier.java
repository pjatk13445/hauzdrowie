package com.pjatk.byt.hauzdrowie.observer;

import com.pjatk.byt.hauzdrowie.model.Badanie;

import java.util.ArrayList;
import java.util.List;

public class BadanieNotifier {

    private Badanie badanie;
    private List<BadanieObserver> observerCollection = new ArrayList<>();

    public BadanieNotifier(Badanie badanie, List<BadanieObserver> observerCollection) {
        this.badanie = badanie;
        this.observerCollection = observerCollection;
    }

    public void addObserver(BadanieObserver observer) {
        if (!this.observerCollection.contains(observer)) {
            this.observerCollection.add(observer);
        }
    }

    public void removeObserver(BadanieObserver observer) {
        if (this.observerCollection.contains(observer)) {
            this.observerCollection.remove(observer);
        }
    }

    public void notifyObservers() {
        this.observerCollection.forEach(observer -> {
            observer.notify(badanie);
        });
    }
}
