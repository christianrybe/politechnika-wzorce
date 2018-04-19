package pl.krrybarc.animals.bird;

import pl.krrybarc.behaviour.FastFlying;
import pl.krrybarc.behaviour.Flying;
import pl.krrybarc.behaviour.Quacking;
import pl.krrybarc.behaviour.Singing;

public class Goose extends Bird {

    public Goose() {
        super(new FastFlying(), new Quacking());
    }

    @Override
    public void display() {
        System.out.println("I am a goose");
    }
}
