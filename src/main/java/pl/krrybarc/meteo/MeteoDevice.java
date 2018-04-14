package pl.krrybarc.meteo;

public class MeteoDevice implements Observer {

    public void updateGraph() {
        System.out.println("Drawing new graph");
    };

    @Override
    public void update() {
        //HERE I KNOW SOMETHING CHANGED
        updateGraph();
    }
}
