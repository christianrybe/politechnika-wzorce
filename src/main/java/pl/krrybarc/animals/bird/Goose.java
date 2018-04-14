package pl.krrybarc.animals.bird;

import pl.krrybarc.behaviour.FastFlying;
import pl.krrybarc.behaviour.Quacking;

public class Goose extends Bird {

    public Goose() {
        super(new FastFlying(), new Quacking());
    }

    public void display() {
        System.out.println("I am a goose");
    }
}
