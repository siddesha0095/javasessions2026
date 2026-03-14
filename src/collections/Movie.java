package collections;

public class Movie {
    private String title;
    private String actor;
    private float rating;
    private String language;
    private char certification;
    private int duration;

    // Constructor
    public Movie(String title, String actor, float rating, String language, char certification, int duration) {
        this.title = title;
        this.actor = actor;
        this.rating = rating;
        this.language = language;
        this.certification = certification;
        this.duration = duration;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", actor='" + actor + '\'' +
                ", rating=" + rating +
                ", language='" + language + '\'' +
                ", certification=" + certification +
                ", duration=" + duration +
                '}';
    }

	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
}