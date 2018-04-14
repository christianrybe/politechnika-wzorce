package pl.krrybarc.animals.bear

import org.joda.time.DateTime
import pl.krrybarc.database.Database
import pl.krrybarc.clock.Clock
import spock.lang.Specification

class BearSpec extends Specification {

    def "Bear should be alive if has eaten within 10 days"() {
        given:
        Bear bear = testBear
        bear.eat()

        when:
        boolean result = bear.isAlive()

        then:
        result == true

        where:
        testBear << [new BlackBear(2, new TestDatabase())]
    }

    def "Bear should be dead if it has not eaten for more than 10 days"() {
        given:
        Clock clock = new TestClock()
        Bear bear = new BlackBear(20, clock)

        when:
        boolean result = bear.isAlive()

        then:
        result == false
    }

    class TestClock implements Clock {
        @Override
        DateTime getCurrentTime() {
            return DateTime.now().plusDays(11)
        }
    }

    class TestDatabase implements Database {

        @Override
        void save(Object o) {}
    }
}

