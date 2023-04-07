public class App {
    private static LinkedList<Experiment> list;
    private static final int MAXKG = 700;

    public static void main(String[] args) {
        list = new LinkedList<>();
            init();

        for (Experiment e: list) {
            System.out.println(e);
        }
    }

    /**
     * Initialize the list with all experiments.
     */
    private static void init() {
        list.add(new Experiment(1, "Cloud Patterns", 36, 5));
        list.add(new Experiment(2, "Solar Flares", 264, 9));
        list.add(new Experiment(3, "Solar Power", 188, 6));
        list.add(new Experiment(4, "Binary Stars", 203, 8));
        list.add(new Experiment(5, "Relativity", 104, 8));
        list.add(new Experiment(6, "Seed Viability", 7, 4));
        list.add(new Experiment(7, "Sun Spots", 90, 2));
        list.add(new Experiment(8, "Mice Tumors", 65, 8));
        list.add(new Experiment(9, "Microgravity Plant Growth", 75, 5));
        list.add(new Experiment(10, "Micrometeorites", 170, 9));
        list.add(new Experiment(11, "Cosmic Rays", 80, 7));
        list.add(new Experiment(12, "Yeast Fermentation", 27, 4));
    }
}
