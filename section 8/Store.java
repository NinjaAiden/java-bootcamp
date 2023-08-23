public class Store {

    private Movie[] movies;

    public Store() {
        // create a new array that can store ten elenments
        this.movies = new Movie[10];
    }

    public Movie getMovie(int index) {
        // return a new copy of the movie object being requested         
        return new Movie(this.movies[index]);
    }

    public void setMovie(int index, Movie movie) {
        // return a copy of the movie object
        this.movies[index] = new Movie(movie);
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }    
}
