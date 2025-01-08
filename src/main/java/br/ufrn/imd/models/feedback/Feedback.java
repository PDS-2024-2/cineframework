package br.ufrn.imd.models.feedback;

import br.ufrn.imd.models.AbstractEntity;
import br.ufrn.imd.models.movie.Movie;
import br.ufrn.imd.models.ticket.AbstractTicket;
import br.ufrn.imd.models.user.User;

public class Feedback extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	private User user;

	private Movie movie;

	private AbstractTicket ticket;

	private Integer rating;

	private String comment;

	public Feedback() {
	}

	public Feedback(User user, Movie movie, AbstractTicket ticket, Integer rating, String comment) {
		this.user = user;
		this.movie = movie;
		this.ticket = ticket;
		this.rating = rating;
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public AbstractTicket getTicket() {
		return ticket;
	}

	public void setTicket(AbstractTicket ticket) {
		this.ticket = ticket;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
