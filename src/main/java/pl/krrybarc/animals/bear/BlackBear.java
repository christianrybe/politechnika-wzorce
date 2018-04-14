package pl.krrybarc.animals.bear;

import pl.krrybarc.database.Database;
import pl.krrybarc.clock.Clock;

public class BlackBear extends Bear {

    public BlackBear(int weight, Clock clock) {
        super(weight, clock);
    }

    public BlackBear(int weight) {
        super(weight);
    }

    public BlackBear(int weight, Database database) {
        super(weight, database);
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(2 * weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BlackBear) {
            return this.weight == ((BlackBear) obj).weight;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return weight*79;
    }
}