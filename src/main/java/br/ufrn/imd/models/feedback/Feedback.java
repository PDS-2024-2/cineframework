package br.ufrn.imd.models.feedback;

import br.ufrn.imd.models.AbstractEntity;
import br.ufrn.imd.models.movie.Movie;
import br.ufrn.imd.models.ticket.AbstractTicket;
import br.ufrn.imd.models.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "feedback")
public class Feedback extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	@NotNull(message = "O usuário deve ser informado.")
	private User user;

	@ManyToOne
	@JoinColumn(name = "movie_id", nullable = false)
	@NotNull(message = "O filme deve ser informado.")
	private Movie movie;

	private AbstractTicket ticket;

	@Column(name = "rating", nullable = false)
	@NotNull(message = "A avaliação deve ser informada.")
	@Min(value = 1, message = "A avaliação mínima é 1.")
	@Max(value = 5, message = "A avaliação máxima é 5.")
	private Integer rating;

	@Column(name = "comment", columnDefinition = "TEXT")
	private String comment;

}
