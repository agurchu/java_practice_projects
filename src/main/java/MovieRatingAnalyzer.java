import java.util.ArrayList;

public class MovieRatingAnalyzer {

    public static void main(String[] args) {
        ArrayList<String> movieTitles = new ArrayList<>();
        ArrayList<Double> ratings = new ArrayList<>();

        // TODO 1: Add the sample movie data here (at least 8 movies)

        movieTitles.add("Fast & Furious");  ratings.add(8.8);
        movieTitles.add("Callout");         ratings.add(7.8);
        movieTitles.add("Be Great");        ratings.add(8.0);
        movieTitles.add("Red");             ratings.add(8.8);
        movieTitles.add("Bad land");        ratings.add(8.8);
        movieTitles.add("Spider Man");      ratings.add(8.8);
        movieTitles.add("Superman");        ratings.add(8.8);
        movieTitles.add("Kea & Thato");     ratings.add(8.8);
        // Example:
        // movieTitles.add("Inception");
        // ratings.add(8.8);


        System.out.println("=== MOVIE RATING ANALYZER ===\n");

        // TODO 2: Call the methods in this order:
        // 1. printAllMovies
        printAllMovies(movieTitles, ratings);
        // 2. Print average rating (use calculateAverageRating)
        System.out.println();
        System.out.println("Average Rating: " + calculateAverageRating(ratings));
        // 3. Print number of highly rated movies (use countHighlyRated)
        // 4. printRatingCategories
        // 5. findHighestAndLowestRated
    }

    /**
     * TODO 3: Implement this method
     * Prints all movies with their ratings using a for loop with range.
     * Format: "1. Inception - 8.8"
     */
    public static void printAllMovies(ArrayList<String> titles, ArrayList<Double> ratings) {
        // for i in range(0, len(titles)
        for (int i = 0; i < titles.size()  ; i++) System.out.println((i + 1) + ". " + titles.get(i) + " - " + ratings.get(i));
    }

    /**
     * TODO 4: Implement this method
     * Calculates and returns the average rating of all movies.
     * Use a for loop with range to sum the ratings, then divide by size.
     */
    public static double calculateAverageRating(ArrayList<Double> ratings) {
        // Your code here - return the average
        double total = 0;
        for (int i = 0; i < ratings.size(); i++)  total += ratings.get(i);
        return total/ ratings.size();
    }

    /**
     * TODO 5: Implement this method
     * Returns the count of movies with rating >= 8.0
     * Use for loop with range + if statement
     */
    public static int countHighlyRated(ArrayList<Double> ratings) {
        // Your code here - return the count

        return 0;
    }

    /**
     * TODO 6: Implement this method
     * Prints each movie with its rating category using if/else if:
     * Excellent (>= 8.5), Very Good (8.0-8.4), Good (7.0-7.9), Average (< 7.0)
     * Format: "Inception is Excellent (8.8)"
     */
    public static void printRatingCategories(ArrayList<String> titles, ArrayList<Double> ratings) {
        // Your code here
    }

    /**
     * TODO 7: Implement this method
     * Finds and prints the highest rated movie(s) and the lowest rated movie(s).
     * Handle cases where multiple movies have the same highest or lowest rating.
     * Use for loop with range + if statements for comparison.
     */
    public static void findHighestAndLowestRated(ArrayList<String> titles, ArrayList<Double> ratings) {
        // Your code here
    }
}
