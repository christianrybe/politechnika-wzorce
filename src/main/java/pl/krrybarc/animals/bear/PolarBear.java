package pl.krrybarc.animals.bear;

public class PolarBear extends Bear {

    public PolarBear(int weight) {
        super(weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PolarBear) {
            return this.weight == ((PolarBear) obj).weight;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return weight*27;
    }
}
