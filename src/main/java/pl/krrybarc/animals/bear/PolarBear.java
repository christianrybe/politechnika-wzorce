package pl.krrybarc.animals.bear;

public class PolarBear extends Bear {

    //DO NOT DO THIS AT HOME OR AT WORK
    //or you might get fired - public field
    public int a;
    public static int b;

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
