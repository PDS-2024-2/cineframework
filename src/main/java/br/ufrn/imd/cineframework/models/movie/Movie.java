package br.ufrn.imd.cineframework.models.movie;

import java.time.LocalDate;

import br.ufrn.imd.cineframework.models.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie")
public class Movie extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	@NotBlank(message = "O título não pode estar em branco")
	@Size(min = 2, max = 200, message = "O título deve ter entre 2 e 100 caracteres")
	@Column(name = "title", nullable = false, length = 200)
	private String title;

	@Column(name = "synopsis", columnDefinition = "TEXT")
	private String synopsis;

	@Column(name = "duration")
	private Integer duration;

	@Column(name = "age_rating")
	private AgeRating ageRating;

	@Column(name = "release_date")
	private LocalDate releaseDate;

	@ManyToOne
	@JoinColumn(name = "genre_id", nullable = false)
	private Genre genre;

	@Column(name = "image_path")
	private String imagePath;

}