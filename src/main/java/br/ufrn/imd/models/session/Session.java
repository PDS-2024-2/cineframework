package br.ufrn.imd.models.session;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import br.ufrn.imd.models.AbstractEntity;
import br.ufrn.imd.models.movie.Movie;
import br.ufrn.imd.models.room.Room;

public class Session extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	private Movie movie;

	private Room room;

	private LocalDate date;

	private LocalTime time;

	private String language;

	private Integer availableSeats;

	private BigDecimal ticketPrice;

	private SessionType sessionType;

	public Session() {
	}

	public Session(Movie movie, Room room, LocalDate date, LocalTime time, String language, Integer availableSeats,
			BigDecimal ticketPrice, SessionType sessionType) {
		this.movie = movie;
		this.room = room;
		this.date = date;
		this.time = time;
		this.language = language;
		this.availableSeats = availableSeats;
		this.ticketPrice = ticketPrice;
		this.sessionType = sessionType;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	public BigDecimal getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public SessionType getSessionType() {
		return sessionType;
	}

	public void setSessionType(SessionType sessionType) {
		this.sessionType = sessionType;
	}
}
