package pl.krrybarc.factory;

import pl.krrybarc.behaviour.Flying;
import pl.krrybarc.behaviour.NullFly;

public class FlyingFactory {

    public static Flying createFlyingBehaviour(String type) {
        switch (type.toLowerCase()) {
            case "ToyBird":
                return new NullFly();
            default:
                return new NullFly();
        }
    }
}
