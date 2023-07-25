package ru.netology.javaqa;

public class FilmManager {

    private int movieCount;
    private Movie[] movieСollection = new Movie[0];

    public FilmManager() {
        movieCount = 5;
    }

    public FilmManager(int movieCount) {
        this.movieCount = movieCount;
    }

    public void addMovie(Movie item) {
        Movie[] tmp = new Movie[movieСollection.length + 1];
        for (int i = 0; i < movieСollection.length; i++) {
            tmp[i] = movieСollection[i];
        }
        tmp[tmp.length - 1] = item;
        movieСollection = tmp;
    }

    public void removeById(int id) {
        Movie[] tmp = new Movie[movieСollection.length - 1];
        int copyToIndex = 0;
        for (Movie item : movieСollection) {
            if (item.getMovieCount() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        movieСollection = tmp;
    }

    public Movie[] findAll() {
        return movieСollection;
    }

    public Movie[] findLast() {
        int x, count, resultLength;
        if (movieCount > movieСollection.length - 1 || movieCount < 0) {
            count = 0;
            resultLength = movieСollection.length;
        } else {
            count = movieСollection.length - movieCount;
            resultLength = movieCount;
        }
        Movie[] result = new Movie[resultLength];
        x = 0;
        for (int i = movieСollection.length - 1; i >= count; i--) {
            result[x] = movieСollection[i];
            x++;
        }
        return result;
    }

    public void print(Movie[] all) {
    }

    public Movie[] findFirst() {
        return new Movie[0];
    }
}
