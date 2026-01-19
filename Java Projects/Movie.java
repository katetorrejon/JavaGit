public class Movie {
    // ATTRIBUTES
    private String title, genre;
    private boolean available;

    // CONSTRUCTOR
    Movie (String x, String y) {
        title = x;
        genre = y;
        available = true;
    }

    // GETTERS
    public String getMovieTitle() {
        return title;
    }
    public String getMovieGenre() {
        return genre;
    }
    public boolean checkAvailability() {
        return available;
    }

    // METHODS
    public void rentMovie(String n) {
        if (available) {
            available = false;
            System.out.println("Movie rented successfully.\n");
        } else {
            System.out.println("This movie is currently being rented.\n");
        }
    }
    public void returnMovie(String n) {
        if (!available) {
            available = true;
            System.out.println("Movie returned successfully.\n");
        } else {
            System.out.println("This movie has not been borrowed.\n");
        }
    }
}
