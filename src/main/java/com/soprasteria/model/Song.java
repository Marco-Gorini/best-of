package com.soprasteria.model;

import java.time.LocalDate;

public class Song {
	private String title;
	private LocalDate yearOfProduction;
	private String genre;
	private String author;
	private String performer;
	
	//Constructor
	
	public Song() {
	}

	//Getters and Setters
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(LocalDate yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}
	
	
}
