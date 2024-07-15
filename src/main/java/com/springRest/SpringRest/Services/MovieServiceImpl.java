package com.springRest.SpringRest.Services;

import com.springRest.SpringRest.Entities.Movies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements services {
    List <Movies> list;

    public MovieServiceImpl() {
        list=new ArrayList<>();
        list.add(new Movies(1433,"Fight Club","Psychology of Enlightenment"));
        list.add(new Movies(1434,"Pulp Fiction","Psychology of Enlightenment"));
        list.add(new Movies(1435,"Seven","Psychology of Enlightenment"));
        list.add(new Movies(1436,"Morning Days","Psychology of Enlightenment"));
        list.add(new Movies(1437,"Taxi Driver","Psychology of Enlightenment"));
    }

    @Override
    public List<Movies> getMovies() {
        return list;
    }

    @Override
    public Movies getMovie(long movieID) {
        Movies resultMovies=null;
        for(Movies movies:list){
            if(movies.getId()==movieID){
                resultMovies=movies;
                break;
            }
        }
        return resultMovies;
    }

    @Override
    public Movies addMovies(Movies movie) {
        list.add(movie);
        return movie;
    }

    @Override
    public Movies updateMovies(Movies movie) {
        Movies resultMovie=movie;
        for(Movies movies:list){
            if(movies.getId()==resultMovie.getId()){
                movies.setTitle(resultMovie.getTitle());
                movies.setDescription(resultMovie.getDescription());
                break;
            }
        }
        return resultMovie;
    }

    @Override
    public List<Movies> deleteMovies(long movieID) {
        for(Movies movies:list){
            if(movies.getId()==movieID)
                list.remove(movies);
        }
        return list;
    }

}
