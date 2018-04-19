package pl.krrybarc.animals.bird;

import pl.krrybarc.behaviour.FastFlying;
import pl.krrybarc.behaviour.Flying;
import pl.krrybarc.behaviour.Quacking;
import pl.krrybarc.behaviour.Singing;

class Duck extends Bird {

    public Duck() {
        super(new FastFlying(), new Quacking());
    }

    @Override
    public void display() {
        System.out.println("I am a duck");
    }

    public static void main(String[] args) {
        Bird duck = new Duck();
    }
}
