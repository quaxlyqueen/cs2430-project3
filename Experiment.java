public class Experiment {
    private int id;
    private String name;
    private int weight;
    private int rating;
    private double ratio;

    public Experiment(int id, String name, int weight, int rating) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.rating = rating;
        this.ratio = weight / rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getRating() {
        return rating;
    }

    public double getRatio() {
        return ratio; // TODO: need to calculate ratio.
    }

    @Override
    public String toString() {
        return String.format("[%d, %s, %dkg, %d]", id, name, weight, rating);
    }
}
