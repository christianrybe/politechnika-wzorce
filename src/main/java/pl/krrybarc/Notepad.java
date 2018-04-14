package pl.krrybarc;

import pl.krrybarc.animals.bear.PolarBear;

public class Notepad {

    //This is a file where experiments from each session are saved.

    public static void main(String[] args) {
        PolarBear yoggy = new PolarBear(1);
        PolarBear teddy = new PolarBear(2);

        yoggy.a = 2;
        PolarBear.b = 2;

        //NOT ALLOWED teddy.a = 1
        //NOT ALLOWED teddy.b = 3

        System.out.println(PolarBear.b); // 3

        PolarBear sam = new PolarBear(10);
        PolarBear jimmy = new PolarBear(10);
        assert sam != jimmy;
        assert sam.equals(jimmy);

        sam = jimmy;
        assert sam == jimmy;
        assert sam.equals(jimmy);

    }
}
