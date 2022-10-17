package com.soprasteria.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String title;
	private LocalDate dateOfRelease;
	private String movieDirector;
	private List<String> cast;
	
	//Constructor
	
	public Movie() {
		this.title = "The Dark Knight";
		this.dateOfRelease = LocalDate.of(2008, 5, 5);
		this.movieDirector = "Cristopher Nolan";
		this.cast = new ArrayList<>();
		cast.add("Christian Bale");
		cast.add("Anne Hataway");
	}
	
	//Getters and Setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDateOfRelease() {
		return dateOfRelease;
	}

	public void setDateOfRelease(LocalDate dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}
	
	
	
}
