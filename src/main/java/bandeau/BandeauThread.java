package bandeau;

public class BandeauThread extends Thread {

    private final Bandeau bandeau;
    private final Scenario scenario;

    public BandeauThread(Bandeau bandeau, Scenario scenario) {
        this.bandeau = bandeau;
        this.scenario = scenario;
    }

    @Override
    public void run() {
        synchronized (bandeau) {
            scenario.playOn(bandeau);
        }
    }

}
