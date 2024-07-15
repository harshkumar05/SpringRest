package com.springRest.SpringRest.Services;

import com.springRest.SpringRest.Entities.Movies;

import java.util.List;

public interface services {
    public List<Movies> getMovies();

    public Movies getMovie(long movieID);

    Movies addMovies(Movies movie);

    Movies updateMovies(Movies movie);

    List<Movies> deleteMovies(long movieID);
}

