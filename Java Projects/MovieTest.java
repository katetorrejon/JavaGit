import java.util.Scanner;
import java.util.ArrayList;

public class MovieTest {
    public static void main(String[] args) {
        int running = 1;
        Scanner input = new Scanner(System.in);
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Title1", "action"));
        movies.add(new Movie("Title2", "action"));
        movies.add(new Movie("Title3", "action"));
        movies.add(new Movie("Title4", "adventure"));
        movies.add(new Movie("Title5", "adventure"));
        movies.add(new Movie("Title6", "romance"));
        movies.add(new Movie("Title7", "romance"));
        movies.add(new Movie("Title8", "drama"));
        movies.add(new Movie("Title9", "horror"));
        movies.add(new Movie("Title10", "horror"));
        movies.add(new Movie("Title11", "horror"));
        movies.add(new Movie("Title12", "sci-fi"));

        while (running == 1) {
            System.out.println("Movie Rental System");
            System.out.println("1] Rent a Movie");
            System.out.println("2] Return a Movie");
            System.out.println("3] See Titles");
            System.out.println("4] Exit");

            System.out.print("Enter selection: ");
            int choice = input.nextInt();
            input.nextLine();
            System.out.println();

            if (choice == 1) {
                System.out.print("Enter movie title: ");
                String movieTitle = input.nextLine();
                for (Movie movie: movies) {
                    if (movie.getMovieTitle().equalsIgnoreCase(movieTitle)) {
                        movie.rentMovie(movieTitle);
                        break;
                    }
                }
            } else if (choice == 2) {
                for (Movie movie: movies) {
                    if (!movie.checkAvailability()) {
                        System.out.println(movie.getMovieTitle());
                    }
                    System.out.println();
                    System.out.print("Enter movie title: ");
                    String movieTitle = input.nextLine();
                    if (movie.getMovieTitle().equalsIgnoreCase(movieTitle)) {
                        movie.returnMovie(movieTitle);
                        break;
                    }
                }
            } else if (choice == 3) {
                for (Movie movie: movies) {
                    System.out.println(movie.getMovieTitle());
                    System.out.println("[" + movie.getMovieGenre().toUpperCase() + "]");
                    System.out.println();
                }

            } else if (choice == 4) {
                System.out.println("Goodbye.");
                running = 0;

            } else {
                System.out.println("Invalid input.\n");
            }
        }
        input.close();
    }
}
