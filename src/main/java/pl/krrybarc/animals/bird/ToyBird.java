package pl.krrybarc.animals.bird;

import pl.krrybarc.behaviour.AbstractBehaviourFactory;
import pl.krrybarc.behaviour.NullFly;
import pl.krrybarc.behaviour.Quacking;

public class ToyBird extends Bird{

    private static AbstractBehaviourFactory factory;

    @Override
    public void display() {
        System.out.println("I am a toy!");
    }
}
