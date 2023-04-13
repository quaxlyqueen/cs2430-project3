import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static int W = 700;
    public static void main(String[] args) {
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

        System.out.println("\n\nSorted by weight:");
        sortByWeight(e, e.length);
            printArr(e);
            sortById(e, e.length);

        System.out.println("\n\nSorted by rating:");
        sortByRating(e, e.length);
            printArr(e);
            sortById(e, e.length);

        System.out.println("\n\nSorted by ratio:");
        sortByRatio(e, e.length);
            printArr(e);
            sortById(e, e.length);

        System.out.println("\n\nDynamic programming approach: ");
        int n = e.length;
        int[][] combinations = new int[n + 1][W + 1];
        boolean[][] included = new boolean[n + 1][W + 1];

        // fill the combinations table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (e[i - 1].getWeight() > j) {
                    combinations[i][j] = combinations[i - 1][j];
                } else {
                    int withoutI = combinations[i - 1][j];
                    int withI = e[i - 1].getRating() + combinations[i - 1][j - e[i - 1].getWeight()];
                    if (withI > withoutI) {
                        combinations[i][j] = withI;
                        included[i][j] = true;
                    } else {
                        combinations[i][j] = withoutI;
                    }
                }
            }
        }

        // find the items included in the optimal solution
        List<Integer> indices = new ArrayList<>();
        int remainingW = W;
        for (int i = n; i >= 1; i--) {
            if (included[i][remainingW]) {
                indices.add(i - 1);
                remainingW -= e[i - 1].getWeight();
            }
        }
        Collections.reverse(indices);

        // print out the results
        System.out.println("max rating: " + combinations[n][W]);
        System.out.println("items included: ");

        int weight = 0;
        int rating = 0;
        for (int i: indices) {
            System.out.println(e[i]);
                weight += e[i].getWeight();
                rating += e[i].getRating();
        }
        System.out.println("Total rating: " + rating + ", total weight: " + weight);
    }

    private static void printArr(Experiment[] arr) {
        int weight = 0;
        int rating = 0;
        for (Experiment e : arr) {
            if(!(weight + e.getWeight() > W)) {
                System.out.println(e);
                weight += e.getWeight();
                rating += e.getRating();
            }
        }
        System.out.println("Total rating: " + rating + ", total weight: " + weight);
    }

    private static void sortByWeight(Experiment[] arr, int n) {
        // base case
        if (n == 1)
            return;
        
        // one pass through the array to move the largest unsorted element to the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].getWeight() > arr[i + 1].getWeight()) {
                // swap arr[i] and arr[i+1]
                Experiment temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        
        // recursive call with n-1
        sortByWeight(arr, n - 1);
    }

    private static void sortByRating(Experiment[] arr, int n) {
        // base case
        if (n == 1)
            return;
        
        // one pass through the array to move the largest unsorted element to the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].getRating() > arr[i + 1].getRating()) {
                // swap arr[i] and arr[i+1]
                Experiment temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        
        // recursive call with n-1
        sortByRating(arr, n - 1);
    }

    private static void sortByRatio(Experiment[] arr, int n) {
        // base case
        if (n == 1)
            return;
        
        // one pass through the array to move the largest unsorted element to the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].getRatio() > arr[i + 1].getRatio()) {
                // swap arr[i] and arr[i+1]
                Experiment temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        
        // recursive call with n-1
        sortByRatio(arr, n - 1);
    }

    private static void sortById(Experiment[] arr, int n) {
        // base case
        if (n == 1)
            return;
        
        // one pass through the array to move the largest unsorted element to the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].getId() > arr[i + 1].getId()) {
                // swap arr[i] and arr[i+1]
                Experiment temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        
        // recursive call with n-1
        sortById(arr, n - 1);
    }
}
