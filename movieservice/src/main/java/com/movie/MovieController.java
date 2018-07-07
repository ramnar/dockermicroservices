package com.movie;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @RequestMapping("/movies")
    public Object getMovies() {
    	List<Movie> movies = new ArrayList<Movie>();
    	Movie mv1 = new Movie(1, "Sanju", "Rajkumar Hirani", 4);
    	Movie mv2 = new Movie(2, "Race 3", "Remo Dsouza", 2);
    	Movie mv3 = new Movie(3, "Kaala", "Ranjith", 4);
    	Movie mv4 = new Movie(4, "Raaji", "Meghana Gulzar", 3);
    	movies.add(mv1);
    	movies.add(mv2);
    	movies.add(mv3);
    	movies.add(mv4);

        return movies;
    }
}
