package pl.krrybarc.animals.bird;

import pl.krrybarc.behaviour.*;

public class ToyBird extends Bird{

    public ToyBird() {
        super(new NullFly(), new Quacking());
    }

    @Override
    public void display() {
        System.out.println("I am a toy!");
    }
}
