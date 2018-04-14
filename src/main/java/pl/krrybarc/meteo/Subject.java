package pl.krrybarc.meteo;

public interface Subject {

    void notifyAllObservers();
    void register(Observer observer);
    void deRegister(Observer observer);
}
