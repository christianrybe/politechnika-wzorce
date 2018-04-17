package pl.krrybarc.meteo;

import java.util.Collection;

class MeteoStation implements Subject {

    Collection<Observer> observers;

    @Override
    public void notifyAllObservers() {
        for (Observer observer:observers) {
            observer.update();
        }
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deRegister(Observer observer) {
        observers.remove(observer);
    }


}
