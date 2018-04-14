package pl.krrybarc.utils;

import pl.krrybarc.animals.bear.Bear;
import pl.krrybarc.animals.bear.BlackBear;

import java.util.HashSet;
import java.util.Set;

public class Tuple<F, S> {

    private F first;
    private S second;

    public Tuple(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public static void main(String[] args) {

        Tuple<String, Integer> stringAndInteger
                = new Tuple<String, Integer>("Hello", 4);
        Tuple<Bear, String> bearAndString = new Tuple<Bear, String>(
                new BlackBear(3),
                "Tom"
        );


        // Get String from stringAndInteger
        String s = stringAndInteger.getFirst();

        // Get Integer from stringAndInteger
        Integer i = (Integer) stringAndInteger.getSecond(); // should be getSecond()

        // Give a different String to bearAndString
        bearAndString.setSecond("Shortie"); // should be setSecond()

        Set<Bear> bears = new HashSet<Bear>();
        bears.add(new BlackBear(2));

    }
}

