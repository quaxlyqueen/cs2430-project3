public class Experiment {
    private int id;
    private String name;
    private int weight;
    private int rating;
    public Experiment next;
    public Experiment prev;

    public Experiment(int id, String name, int weight, int rating) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.rating = rating;
    }

    public void setNext(int id, String name, int weight, int rating) {
        // TODO
    }

    public void setNext(Experiment e) {
        // TODO
    }

    public void setPrev(int id, String name, int weight, int rating) {
        // TODO
    }

    public void setPrev(Experiment e) {
        // TODO
    }

    public Experiment getNext() {
        return next;
    }

    public Experiment getPrev() {
        return prev;
    }

    @Override
    public String toString() {
        return String.format("[%d, %s, %dkg, %d]", id, name, weight, rating);
    }
}
