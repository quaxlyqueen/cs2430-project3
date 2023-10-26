public class Experiment
{
    private int id;
    private string name;
    private int weight;
    private int rating;
    private double ratio;

    public Experiment(int id, string name, int weight, int rating)
    {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.rating = rating;

        this.ratio = weight / rating;
    }

    public int GetId()
    {
        return id;
    }

    public string GetName()
    {
        return name;
    }

    public int GetWeight()
    {
        return weight;
    }

    public int GetRating()
    {
        return rating;
    }

    public double GetRatio()
    {
        return ratio;
    }

    public override string ToString()
    {
        return $"[{id}, {name}, {weight}, {rating}]";
    }
}
