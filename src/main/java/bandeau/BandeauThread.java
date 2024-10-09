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
            // for (ScenarioElement element : scenario.getmyElements()) {
            // for (int repeats = 0; repeats < element.repeats; repeats++) {
            scenario.playOn(bandeau);
            // }

        }
    }
    // }

    /*
     * public void playOn(Bandeau b) {
     * for (ScenarioElement element : myElements) {
     * for (int repeats = 0; repeats < element.repeats; repeats++) {
     * element.effect.playOn(b);}}}
     */

}
