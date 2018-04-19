package pl.krrybarc.database;

public class MSSQLDatabase implements Database {

    @Override
    public void save(Object o) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // NOTHING TO DO
        }
    }
}
