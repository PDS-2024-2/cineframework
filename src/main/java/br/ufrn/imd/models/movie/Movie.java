package br.ufrn.imd.models.movie;

import java.time.LocalDate;

import br.ufrn.imd.models.AbstractEntity;

public class Movie extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	private String title;

	private String synopsis;

	private Integer duration;
	private AgeRating ageRating;

	private LocalDate releaseDate;

	private Genre genre;

	private String imagePath;

	public Movie() {
	}

	public Movie(String title, String synopsis, Integer duration, Genre genre, LocalDate releaseDate,
			AgeRating ageRating) {
		this.title = title;
		this.synopsis = synopsis;
		this.duration = duration;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.ageRating = ageRating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public AgeRating getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(AgeRating ageRating) {
		this.ageRating = ageRating;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
