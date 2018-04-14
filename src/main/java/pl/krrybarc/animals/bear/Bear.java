package pl.krrybarc.animals.bear;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import pl.krrybarc.animals.Animal;
import pl.krrybarc.animals.bird.Bird;
import pl.krrybarc.clock.Clock;
import pl.krrybarc.clock.DateTimeClock;
import pl.krrybarc.database.Database;
import pl.krrybarc.database.SQLDatabase;
import pl.krrybarc.exception.TooFastException;


public abstract class Bear implements Animal {

    protected int weight;
    private DateTime lastMealDate;
    private Clock clock;
    private Database database;

    public Bear(int weight) {
        this.weight = weight;
        this.clock = new DateTimeClock();
        this.lastMealDate = clock.getCurrentTime();
        this.database = new SQLDatabase();
    }

    public Bear(int weight, Clock clock) {
        this(weight);
        this.clock = clock;
    }

    //<dependency-injection>

    @Override
    public boolean isAlive() {
        return new Duration(lastMealDate, clock.getCurrentTime())
                .isShorterThan(Duration.standardDays(10));
    }

    public void eat(Bird bird) throws TooFastException {
        lastMealDate = clock.getCurrentTime();
        database.save(lastMealDate);
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bear) {
            Bear thatBear = (Bear) obj;
            return this.weight == thatBear.weight;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return weight * 11;
    }
}




