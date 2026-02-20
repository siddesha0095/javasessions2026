package myjava;


public class Movie1 {

    private String title;
    private String actor;
    private float rating;
    private String language;
    private char movieType;   // Example: 'A' for Action, 'D' for Drama
    private int ticketPrice;

    // Constructor
    public Movie1(String title, String actor, float rating, String language, char movieType, int ticketPrice) {
        if (verifyRating(rating) && verifyTicketPrice(ticketPrice)) {
            this.title = title;
            this.actor = actor;
            this.rating = rating;
            this.language = language;
            this.movieType = movieType;
            this.ticketPrice = ticketPrice;
        } else {
            System.out.println("Invalid rating or ticket price!");
        }
    }

    // Validation methods
    private boolean verifyRating(float rating) {
        return rating >= 0.0f && rating <= 10.0f;
    }

    private boolean verifyTicketPrice(int ticketPrice) {
        return ticketPrice >= 0 && ticketPrice <= 1000;
    }

    // Override toString for readable output
    @Override
    public String toString() {
        return "Movie [title=" + title + ", actor=" + actor + ", rating=" + rating +
               ", language=" + language + ", movieType=" + movieType +
               ", ticketPrice=" + ticketPrice + "]";
    }
}