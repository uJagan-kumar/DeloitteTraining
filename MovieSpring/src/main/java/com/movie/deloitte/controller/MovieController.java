package com.movie.deloitte.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.deloitte.dao.MovieDao;
import com.movie.deloitte.model.Movie;

@RestController
public class MovieController {
		@Autowired
		MovieDao movieDao ;
		@RequestMapping("/getMovie")
		public Optional<Movie> getMovie() {
			return movieDao.findById(111);
			//return "Getting movie";
		}
		
		@RequestMapping("/saveMovie")
		public String saveMovie() {
			Movie movie = new Movie(111, "Shining", "Kubrick", 100000);
			movieDao.save(movie);
			return "Movie saved successfully";
		}
		
}
