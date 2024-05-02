package org.example;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
@Builder
@Getter

public class Action implements Subject<Action> {

    String name;

    Double price;

    List<Observer<Action>> observers;

    public Double changePrice(Double price) {
        return this.price = price;
    }
    @Override
    public void registerObserver(Observer<Action> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<Action> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Action element) {
        observers.forEach(o->o.update(this));
    }
}
