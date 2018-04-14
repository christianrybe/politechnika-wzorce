package pl.krrybarc;

import pl.krrybarc.animals.Animal;
import pl.krrybarc.animals.bear.Bear;
import pl.krrybarc.animals.bear.BlackBear;
import pl.krrybarc.animals.bear.PolarBear;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Zoo {

    public static void main(String[] args) {
        Map<Animal, Integer> animalCount = new HashMap<Animal, Integer>();

        int counter = 0;
        for (int i = 1; i <= 10; i++) {
            counter++;
            Bear blackBear = new BlackBear(2);

            animalCount.put(blackBear, counter);
        }

        System.out.println(animalCount);

        for (int i = 1; i <= 5; i++) {
            counter++;
            Bear polarBear = new PolarBear(2);
            animalCount.put(polarBear, counter);
        }

        System.out.println(animalCount);

        Stream.generate(() -> new PolarBear(10)).limit(10);
    }


}
