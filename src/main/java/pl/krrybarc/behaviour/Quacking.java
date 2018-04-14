package pl.krrybarc.behaviour;

public class Quacking implements Singing {

    @Override
    public void sing() {
        System.out.println("Quacking sound!");
    }
}
