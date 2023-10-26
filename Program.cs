const int w = 700;

Experiment[] e = {
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
    new Experiment(12, "Yeast Fermentation", 27, 4)
};

foreach (Experiment ex in e)
{
    Console.WriteLine(ex.ToString());
}
