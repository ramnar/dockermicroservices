package com.movie;

public class Movie {

    public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public Movie(long id, String title, String director, int rating) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.rating = rating;
	}
	private final long id;
    private final String title;
    private final String director;
    private int rating;

}
