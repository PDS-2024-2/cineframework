package br.ufrn.imd.models.session;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import br.ufrn.imd.models.AbstractEntity;
import br.ufrn.imd.models.movie.Movie;
import br.ufrn.imd.models.room.Room;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "session")
public class Session extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "movie_id", nullable = false)
	@NotNull(message = "O filme da sessão deve ser informado.")
	private Movie movie;

	@ManyToOne
	@JoinColumn(name = "room_id", nullable = false)
	@NotNull(message = "A sala da sessão deve ser informada.")
	private Room room;

	@Column(name = "date", nullable = false)
	@NotNull(message = "A data da sessão deve ser informada.")
	private LocalDate date;

	@Column(name = "time", nullable = false)
	@NotNull(message = "A hora da sessão deve ser informada.")
	private LocalTime time;

	@Column(name = "language", nullable = false, length = 50)
	@NotBlank(message = "O idioma da sessão não pode estar vazio.")
	private String language;

	@Column(name = "available_seats", nullable = false)
	@NotNull(message = "O número de assentos disponíveis deve ser informado.")
	@Positive(message = "O número de assentos disponíveis deve ser maior que zero.")
	private Integer availableSeats;

	@Column(name = "ticket_price", nullable = false, precision = 10, scale = 2)
	@NotNull(message = "O preço do ingresso deve ser informado.")
	@DecimalMin(value = "0.01", message = "O preço do ingresso deve ser maior que zero.")
	private BigDecimal ticketPrice;

	@ManyToOne
	@JoinColumn(name = "session_type_id", nullable = false)
	@NotNull(message = "O tipo de sessão deve ser informado.")
	private SessionType sessionType;
}
