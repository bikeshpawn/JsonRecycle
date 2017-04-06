package com.example.bks.recyclejason;

/**
 * Created by Bks on 4/6/2017.
 */

public class MovieListingDetail {
    private String movieName;
    private int moviePosterPath;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMoviePosterPath() {
        return moviePosterPath;
    }

    public void setMoviePosterPath(int moviePosterPath) {
        this.moviePosterPath = moviePosterPath;
    }

    public MovieListingDetail(String movieName, int moviePosterPath) {
        this.movieName = movieName;
        this.moviePosterPath = moviePosterPath;
    }
}
