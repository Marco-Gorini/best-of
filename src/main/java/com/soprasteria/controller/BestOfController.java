package com.soprasteria.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.model.Movie;
import com.soprasteria.model.Song;

@RestController
@RequestMapping("/bestof") //localhost:8080
public class BestOfController {
	
	@GetMapping("/movie")
	public Movie getFavoriteMovie() {
		Movie movie = new Movie();
		List<String> movieCast = new ArrayList<>();
		movieCast.add("Christian Bale");
		movieCast.add("Anne Hataway");
		movie.setDateOfRelease(LocalDate.of(2008, 5, 5));
		movie.setMovieDirector("Nolan");
		movie.setTitle("The Dark Knight");
		movie.setCast(movieCast);
		return movie;
	}
	
	@GetMapping("/song")
	public Song getFavoriteSong() {
		Song song = new Song();
		song.setAuthor("Lazza");
		song.setGenre("Rap/Trap");
		song.setPerformer("Lazza");
		song.setTitle("Piove");
		song.setYearOfProduction(LocalDate.of(2022, 5, 5));
		return song;
	}
}

