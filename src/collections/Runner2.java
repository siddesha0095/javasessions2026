package collections;

import java.util.ArrayList;

public class Runner2 {
    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("KGF Chapter 2", "Yash", 9.0f, "Kannada", 'U', 150));
        movieList.add(new Movie("Pushpa", "Allu Arjun", 8.5f, "Telugu", 'U', 160));
        movieList.add(new Movie("RRR", "Ram Charan", 9.2f, "Telugu", 'U', 180));
        movieList.add(new Movie("Leo", "Vijay", 8.0f, "Tamil", 'U', 170));

        // Print all movies
        System.out.println("All Movies:");
        for (Movie m : movieList) {
            System.out.println(m);
        }

        // Search for a movie by title
        String searchTitle = "RRR";
        System.out.println("\nSearching for movie: " + searchTitle);

        boolean found = false;
        for (Movie m : movieList) {
            if (m.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("Found: " + m);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Movie not found in the list.");
        }
    }
}