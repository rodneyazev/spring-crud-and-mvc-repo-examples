package com.project.app.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/movies")
public class MoviesController {
	
	@Autowired
	MoviesRepository moviesRepository;
	
	@GetMapping
	public List<Movies> getAllMovies(){
		return moviesRepository.findAll();
	}
	
	@GetMapping(value="{movieId}")
	public Movies getMovieId(@PathVariable(value="movieId") Long movieId) {
		return moviesRepository.findById(movieId).get();
	}
	
	@PostMapping
	public Movies createMovie(@RequestBody Movies movie) {
		return moviesRepository.save(movie);
		
	}
	
	@PutMapping(value="{movieId}")
	public Movies updateMovie(@RequestBody Movies movie, @PathVariable(value="movieId") long movieId) throws Exception {
		movie.setMovieId(movieId);
		return moviesRepository.save(movie);
	}

	@DeleteMapping(value="{movieId}")
	public void movieDelete(@PathVariable(value="movieId") long movieId) {
		moviesRepository.deleteById(movieId);
	}
	
}
