using System.Runtime.CompilerServices;
using System.Runtime.InteropServices;
using System.Security.Cryptography.X509Certificates;
using Microsoft.VisualBasic;

public class Experiment {
    private int id { get; }
    private string experiment { get; }
    private int weight { get; }
    private int rating { get; }
    private int massToRatingRatio { get; }

    public Experiment(int id, string experiment, int weight, int rating) {
        this.id = id;
        this.experiment = experiment;
        this.weight = weight;
        this.rating = rating;
        massToRatingRatio = weight / rating;
    }

    public static List<Experiment> SortedByWeight(List<Experiment> experiments) {
        experiments.Sort((e1, e2) => e1.weight.CompareTo(e2.weight));
        return experiments;
    }

    public static List<Experiment> SortedByRating(List<Experiment> experiments) {
        experiments.Sort((e1, e2) => e1.rating.CompareTo(e2.rating));
        return experiments;
    }

    public static List<Experiment> SortedByRatio(List<Experiment> experiments) {
        experiments.Sort((e1, e2) => e1.massToRatingRatio.CompareTo(e2.massToRatingRatio));
        return experiments;
    }

    
    public override string ToString() {
        return $"[{id}, {experiment}, {weight}kg, {rating}, {massToRatingRatio}]";
    }

    // test client
    public static void Main(string[] args) {
        List<Experiment> es = new List<Experiment> {
            new Experiment(1, "Cloud Patterns", 36, 5),
            new Experiment(2, "Solar Flares", 264, 9),
            new Experiment(3, "Solar Power", 188, 6),
            new Experiment(4, "Binary Stars", 203, 8),
            new Experiment(5, "Relativity", 104, 8),
            new Experiment(6, "Seed Viability", 7, 4),
            new Experiment(7, "Sun Spots", 90, 2),
            new Experiment(8, "Mice Tumors", 65, 8),
            new Experiment(9, "Microgravity Plant Growth", 75, 5),
            new Experiment(10, "Micrometeorites", 170, 9),
            new Experiment(11, "Cosmic Rays", 80, 7),
            new Experiment(12, "Yeast Fermentation", 27, 4),
        };

        Experiment.SortedByRatio(es);

        foreach (Experiment ex in es) {
            Console.WriteLine(ex);
        }
    }
}