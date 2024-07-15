package com.springRest.SpringRest.Controller;

import com.springRest.SpringRest.Entities.Movies;
import com.springRest.SpringRest.Services.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controllers {

    @Autowired
    private services MovieServices;

    @GetMapping("/home")
    public String home(){
        return  "this is the home page";
    }

    //get the movies
    @GetMapping("/movies")
    public List<Movies> getMovies(){
        return this.MovieServices.getMovies();
    }

    @GetMapping("/movies/{movieID}")
    public Movies getMovie(@PathVariable String movieID){
        return this.MovieServices.getMovie(Long.parseLong(movieID));
    }

    @PostMapping("/movies")
    public Movies addMovies(@RequestBody Movies movie){
        return this.MovieServices.addMovies(movie);
    }

    @PutMapping("/movies")
    public Movies updateMovies(@RequestBody Movies movie){
        return this.MovieServices.updateMovies(movie);
    }

    @GetMapping("movies/delete/{movieID}")
    public List <Movies> deleteMovies(@PathVariable String movieID){
        return this.MovieServices.deleteMovies(Long.parseLong(movieID));
    }

}
