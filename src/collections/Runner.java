package collections;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        // Create an ArrayList of Movie objects
        ArrayList<Movie> movieList = new ArrayList<>();

        // Add movies to the list
        movieList.add(new Movie("KGF Chapter 2", "Yash", 9.0f, "Kannada", 'U', 150));
        movieList.add(new Movie("Pushpa", "Allu Arjun", 8.5f, "Telugu", 'U', 160));
        movieList.add(new Movie("RRR", "Ram Charan", 9.2f, "Telugu", 'U', 180));
        movieList.add(new Movie("Leo", "Vijay", 8.0f, "Tamil", 'U', 170));

        // Print all movies
        for (Movie m : movieList) {
            System.out.println(m);
        }
    }
}
